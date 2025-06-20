package eddie.energy.transformer;

import schemas.eu.*;
import schemas.region.at.ConsumptionPositionType;
import schemas.region.at.ConsumptionRecordType;
import schemas.region.at.RoutingHeaderType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;

public class EdaCcmTransformer extends AbstractVhcdTransformer {

    ConsumptionRecordType consumptionRecord;
    final JAXBContext austrianContext = JAXBContext.newInstance(ConsumptionRecordType.class);
    final Unmarshaller austrianContextUnmarshaller = austrianContext.createUnmarshaller();
    final SimpleDateFormat austrianDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");

    public EdaCcmTransformer() throws JAXBException {
    }

    @Override
    public void loadFromFile(File file) throws FileNotFoundException, JAXBException {
        consumptionRecord = (ConsumptionRecordType) austrianContextUnmarshaller.unmarshal(new FileInputStream(file));
    }

    @Override
    public void loadReceivedData(String receivedData) throws JAXBException {
        consumptionRecord = (ConsumptionRecordType) austrianContextUnmarshaller.unmarshal(new StringReader(receivedData));
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument(String receivedData) throws JAXBException, ParseException {
        loadReceivedData(receivedData);
        return getMappedMarketDocument();
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument(File file) throws JAXBException, FileNotFoundException, ParseException {
        loadFromFile(file);
        return getMappedMarketDocument();
    }

    @Override
    public MyEnergyDataMarketDocument getMappedMarketDocument() throws ParseException {
        MyEnergyDataMarketDocument doc = new MyEnergyDataMarketDocument();

        doc.setMRID(consumptionRecord.getProcessDirectory().getConversationId() + "-" + consumptionRecord.getProcessDirectory().getMessageId());
        RoutingHeaderType routingHeader = consumptionRecord.getMarketParticipantDirectory().getRoutingHeader();
        doc.setSenderMarketParticipantMarketRoleType(routingHeader.getSender().getMessageAddress());
        doc.setSenderMarketParticipantName("MDA");
        doc.setReceiverMarketParticipantMarketRoleType("EP");
        doc.setReceiverMarketParticipantName(routingHeader.getReceiver().getMessageAddress());
        // TODO doc.setCreatedDateTime(routingHeader.getDocumentCreationDateTime());

        TimeSeries ts = new TimeSeries();
        ts.setMRID(UUID.randomUUID().toString());
        ts.setMeasurementUnitName("KWh"); // TODO define set of possible values from BillingUOM
        ts.setProduct("Electricity"); // TODO define enum

        String cups = null;

        int position = 1;

        for(ConsumptionPositionType ct : consumptionRecord.getProcessDirectory().getConsumption().getConsumptionData().getConsumptionPosition()) {
            SeriesPeriod period = new SeriesPeriod();

            ESMPDateTimeInterval intv = new ESMPDateTimeInterval();
            intv.setStart(ct.getDateTimeFrom());
            intv.setEnd(ct.getDateTimeTo());
            period.setTimeInterval(intv);

            Point point = new Point();

            point.setPosition(position++);

            float qty = Float.parseFloat(ct.getBillingQuantity());

            if(qty < 0) {
                point.setOutQuantityQuantity(BigDecimal.valueOf(qty*-1));
                point.setOutQuantityQuality(ct.getMeteringMethod()); // TODO normalise values
            } else {
                point.setOutQuantityQuantity(BigDecimal.valueOf(qty));
                point.setOutQuantityQuality(ct.getMeteringMethod()); // TODO normalise values
            }

            period.getPoint().add(point);

            ts.getPeriod().add(period);
        }

        MeasurementPointIDString mpid = new MeasurementPointIDString();
        mpid.setCodingScheme("ATCode");
        mpid.setValue(consumptionRecord.getProcessDirectory().getMeteringPoint());
        MarketEvaluationPoint ep = new MarketEvaluationPoint();
        ep.setMRID(mpid);
        ts.getMarketEvaluationPoint().add(ep);

        doc.getTimeSeries().add(ts);

        return doc;
    }
}
