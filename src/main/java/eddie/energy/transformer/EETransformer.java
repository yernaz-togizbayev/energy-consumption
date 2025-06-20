package eddie.energy.transformer;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import schemas.eu.ESMPDateTimeInterval;
import schemas.eu.MarketEvaluationPoint;
import schemas.eu.MeasurementPointIDString;
import schemas.eu.MyEnergyDataMarketDocument;
import schemas.eu.Point;
import schemas.eu.SeriesPeriod;
import schemas.eu.TimeSeries;

public class EETransformer extends AbstractVhcdTransformer {
	
	Document xmlDoc;
	final String CREATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
	SimpleDateFormat sdf = new SimpleDateFormat(CREATE_TIME_FORMAT);
	DateTimeFormatter intervallFormater = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mmX");
	
	

	public EETransformer() throws JAXBException {
	}

	@Override
	public void loadFromFile(File file) throws IOException, JAXBException, ParseException, ParserConfigurationException, SAXException {
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		xmlDoc = builder.parse(file);
		xmlDoc.getDocumentElement().normalize();
	}

	@Override
	public void loadReceivedData(String receivedData) throws JAXBException, ParseException, ParserConfigurationException, SAXException, IOException {
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		InputSource is = new InputSource();
		is.setCharacterStream(new StringReader(receivedData));
		xmlDoc = builder.parse(is);
	}

	@Override
	public MyEnergyDataMarketDocument getMappedMarketDocument(File file)
			throws JAXBException, IOException, java.text.ParseException, ParseException, ParserConfigurationException, SAXException, DatatypeConfigurationException {
        loadFromFile(file);
        return getMappedMarketDocument();
	}

	@Override
	public MyEnergyDataMarketDocument getMappedMarketDocument(String receivedData)
			throws JAXBException, java.text.ParseException, ParseException, ParserConfigurationException, SAXException, IOException, DatatypeConfigurationException {
		loadReceivedData(receivedData);
        return getMappedMarketDocument();
	}

	@Override
	public MyEnergyDataMarketDocument getMappedMarketDocument() throws java.text.ParseException, DatatypeConfigurationException {
		//Default Zone is EET because Data is from Estonia
		return getMappedMarketDocumentFromTimezone(OriginTimeZone.EET);
	}
	
	private int decideIntervallLength(String code) {
		switch(code){
		case"QH":
			return 15;
		case"PT1H":
			return 60;
		default:
			return 30;
		}
	}
	
	//zone specifies which TimeZone the data is supposed to come from for the output
	public MyEnergyDataMarketDocument getMappedMarketDocumentFromTimezone(File file, OriginTimeZone zone)
			throws JAXBException, IOException, java.text.ParseException, ParseException, ParserConfigurationException, SAXException, DatatypeConfigurationException {
        loadFromFile(file);
        return getMappedMarketDocumentFromTimezone(zone);
	}
	
	public MyEnergyDataMarketDocument getMappedMarketDocumentFromTimezone(OriginTimeZone zone) throws java.text.ParseException, DatatypeConfigurationException {
		MyEnergyDataMarketDocument doc = new MyEnergyDataMarketDocument();
		
		DatatypeFactory dataFactory = DatatypeFactory.newInstance();
		
		//retrieve the root
		Element energyReport = xmlDoc.getDocumentElement();
		
		//get unique document identification
		String documentIdentification = energyReport.getElementsByTagName("DocumentIdentification").item(0).getTextContent();
		doc.setMRID(documentIdentification);
		
		//Set sender and receiver with EIC from document
		String sender = energyReport.getElementsByTagName("SenderIdentification").item(0).getTextContent();
        doc.setSenderMarketParticipantName(sender);
        String receiver = energyReport.getElementsByTagName("ReceiverIdentification").item(0).getTextContent();
        doc.setReceiverMarketParticipantName(receiver);
        
        //set the creation time of document
        String documentDateTime = energyReport.getElementsByTagName("DocumentDateTime").item(0).getTextContent();
        Date creationDate = sdf.parse(documentDateTime);
        
        //Our input has the format UTC+1
        ZonedDateTime creationZoneDate = ZonedDateTime.ofInstant(creationDate.toInstant(), ZoneId.of("UTC+1"));
        //We ignore the Timezone for now because later we apply our own
        creationZoneDate = creationZoneDate.withZoneSameLocal(ZoneId.of("UTC+0"));
        
        //Our Data originally comes from Estonia which is EET=UTC+2
    	//We shift it according to the provided Zone to make it seem like it came from that zone
        ZonedDateTime creationZoneDateWithOrigin = applyZoneOffset(creationZoneDate, zone);
        
        String creationDateString = creationZoneDateWithOrigin.format(DateTimeFormatter.ISO_INSTANT);
        
		doc.setCreatedDateTime(dataFactory.newXMLGregorianCalendar(creationDateString));
		
		
		//Prepare values for TimeSeries
		String intervallStart = energyReport.getElementsByTagName("start").item(0).getTextContent();
		String resolution_string = energyReport.getElementsByTagName("Resolution").item(0).getTextContent();
		int intervallLength = decideIntervallLength(resolution_string);
		
		Date intervallStartDate = sdf.parse(intervallStart);
		
        TimeSeries ts = new TimeSeries();
        
        //No value in dataset available for TimeSeries MRID
        //UUID is 36 characters long I remove 1 character to make it 35 long
      	String uuid = UUID.randomUUID().toString();
      	String uuid_35 = uuid.substring(0, uuid.length() -1 );
        ts.setMRID(uuid_35);
        ts.setMeasurementUnitName("KWH");
        ts.setProduct("8716867000030");
        
        //get the energy readings from the xml
        NodeList outQuantity = energyReport.getElementsByTagName("OutQty");
        
        int position = 1;
        
        //Our input has the format UTC+1
        ZonedDateTime date = ZonedDateTime.ofInstant(intervallStartDate.toInstant(), ZoneId.of("UTC+1"));
        
        //We ignore the Timezone for now because later we apply our own
        date = date.withZoneSameLocal(ZoneId.of("UTC+0"));
        
        //We again apply our shift to act like the data is from a different timezone
        date = applyZoneOffset(date, zone);
        
        //Loop throught the nodes in the Document
        int timeZoneOffset = 0;
        //We skip the last readings of the data if we are not in EET to keep the data within the 24 hours of a single day
        if(zone == OriginTimeZone.CET) {
        	timeZoneOffset = 1*4;
        }
        if(zone == OriginTimeZone.WET) {
        	timeZoneOffset = 2*4;
        }
        
        for(int i =0; i < outQuantity.getLength()-timeZoneOffset; i++) {

            SeriesPeriod period = new SeriesPeriod();
            
            //set the intervall
            ESMPDateTimeInterval intv = new ESMPDateTimeInterval();
            intv.setStart(date.format(intervallFormater));
            date = date.plusMinutes(intervallLength);
            intv.setEnd(date.format(intervallFormater));
            period.setTimeInterval(intv);
            
            
            Duration resolution = dataFactory.newDuration(true, 0, 0, 0, 0, intervallLength, 0);
            period.setResolution(resolution);
            	
            //the value of the actual energy reading
            Point point = new Point();
            point.setPosition(position++);
            String qty_string = outQuantity.item(i).getTextContent();
            float qty_float = Float.parseFloat(qty_string);
           
            point.setOutQuantityQuantity(BigDecimal.valueOf(qty_float));
            
            period.getPoint().add(point);

            ts.getPeriod().add(period);
        }

        String accountingPoint = energyReport.getElementsByTagName("AccountingPoint").item(0).getTextContent();
        
        //setting the scheme of the measurement point
        MeasurementPointIDString mpid = new MeasurementPointIDString();
        mpid.setCodingScheme("NEE");
        
        mpid.setValue(accountingPoint);
        MarketEvaluationPoint ep = new MarketEvaluationPoint();
        ep.setMRID(mpid);
        ts.getMarketEvaluationPoint().add(ep);

        doc.getTimeSeries().add(ts);

		return doc;
	}
	
	//Our Data originally comes from CET
	//Offset is calculated with this assumption
	private ZonedDateTime applyZoneOffset(ZonedDateTime date, OriginTimeZone zone) {
		switch(zone) {
			case WET:
				return date.plusHours(2);
			case CET:
				return date.plusHours(1);
			case EET:
				return date.plusHours(0);
			default:
				return date;
		}
	}
}
