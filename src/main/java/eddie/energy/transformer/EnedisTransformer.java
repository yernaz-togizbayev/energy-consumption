package eddie.energy.transformer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import schemas.eu.*;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class EnedisTransformer extends AbstractVhcdTransformer {

    JSONObject jsonObject;
    final JSONParser jsonParser = new JSONParser();
    //DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-DD'T'HH:mm:ssZ");
    public EnedisTransformer() throws JAXBException {
    }

    @Override
    public void loadFromFile(File file) throws IOException, org.json.simple.parser.ParseException {
        jsonObject = (JSONObject) jsonParser.parse(new FileReader(file));
    }

    @Override
    public void loadReceivedData(String receivedData) throws org.json.simple.parser.ParseException {
        jsonObject = (JSONObject) jsonParser.parse(receivedData);
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument(String receivedData) throws ParseException, org.json.simple.parser.ParseException {
        loadReceivedData(receivedData);
        return getMappedMarketDocument();
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument(File file) throws ParseException, IOException, org.json.simple.parser.ParseException {
        loadFromFile(file);
        return getMappedMarketDocument();
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument() throws ParseException {
        JSONObject meterReading = (JSONObject) jsonObject.get("meter_reading");

        MyEnergyDataMarketDocument doc = new MyEnergyDataMarketDocument();

        doc.setMRID(UUID.randomUUID().toString());
        doc.setSenderMarketParticipantMarketRoleType("MDA");
        doc.setSenderMarketParticipantName("?");
        doc.setReceiverMarketParticipantMarketRoleType("EP");
        doc.setReceiverMarketParticipantName("?");
        // TODO doc.setCreatedDateTime(routingHeader.getDocumentCreationDateTime());

        TimeSeries ts = new TimeSeries();
        ts.setMRID(UUID.randomUUID().toString());
        ts.setMeasurementUnitName("KWh"); // TODO define set of possible values from BillingUOM
        ts.setProduct("Electricity"); // TODO define enum

        int position = 1;

        JSONArray intervalReading = (JSONArray) meterReading.get("interval_reading");
        for(Object rd : intervalReading.stream().toList()) {
            JSONObject jobj = (JSONObject) rd;

            SeriesPeriod period = new SeriesPeriod();

            ESMPDateTimeInterval intv = new ESMPDateTimeInterval();
            ZonedDateTime date = ZonedDateTime.parse(jobj.get("date").toString(), DateTimeFormatter.ISO_DATE_TIME);
            intv.setStart(date.toString());
            intv.setEnd(date.plusMinutes(30).toString());

  //          intv.setEnd(ct.getDateTimeTo());

            period.setTimeInterval(intv);

            Point point = new Point();

            point.setPosition(position++);

            float qty = Float.parseFloat(jobj.get("value").toString());

            if(qty < 0) {
                point.setOutQuantityQuantity(BigDecimal.valueOf(qty*-1));
                point.setOutQuantityQuality(jobj.get("measure_type").toString()); // TODO normalise values
            } else {
                point.setOutQuantityQuantity(BigDecimal.valueOf(qty));
                point.setOutQuantityQuality(jobj.get("measure_type").toString()); // TODO normalise values
            }

            period.getPoint().add(point);

            ts.getPeriod().add(period);
        }

        MeasurementPointIDString mpid = new MeasurementPointIDString();
        mpid.setCodingScheme("Enedis");
        JSONObject meter_reading = (JSONObject) jsonObject.get("meter_reading");
        mpid.setValue(meter_reading.get("usage_point_id").toString());
        MarketEvaluationPoint ep = new MarketEvaluationPoint();
        ep.setMRID(mpid);
        ts.getMarketEvaluationPoint().add(ep);

        doc.getTimeSeries().add(ts);

        return doc;
    }
}
