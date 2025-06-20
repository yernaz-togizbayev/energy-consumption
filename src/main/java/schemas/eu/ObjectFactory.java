
package schemas.eu;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the schemas.eu package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MyEnergyDataMarketDocument_QNAME = new QName("urn:entsoe.eu:wgedi:MyEnergyData:10:1", "MyEnergyData_MarketDocument");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: schemas.eu
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MyEnergyDataMarketDocument }
     * 
     */
    public MyEnergyDataMarketDocument createMyEnergyDataMarketDocument() {
        return new MyEnergyDataMarketDocument();
    }

    /**
     * Create an instance of {@link MeasurementPointIDString }
     * 
     */
    public MeasurementPointIDString createMeasurementPointIDString() {
        return new MeasurementPointIDString();
    }

    /**
     * Create an instance of {@link MarketEvaluationPoint }
     * 
     */
    public MarketEvaluationPoint createMarketEvaluationPoint() {
        return new MarketEvaluationPoint();
    }

    /**
     * Create an instance of {@link PartyIDString }
     * 
     */
    public PartyIDString createPartyIDString() {
        return new PartyIDString();
    }

    /**
     * Create an instance of {@link AreaIDString }
     * 
     */
    public AreaIDString createAreaIDString() {
        return new AreaIDString();
    }

    /**
     * Create an instance of {@link ActionStatus }
     * 
     */
    public ActionStatus createActionStatus() {
        return new ActionStatus();
    }

    /**
     * Create an instance of {@link ESMPDateTimeInterval }
     * 
     */
    public ESMPDateTimeInterval createESMPDateTimeInterval() {
        return new ESMPDateTimeInterval();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link SeriesPeriod }
     * 
     */
    public SeriesPeriod createSeriesPeriod() {
        return new SeriesPeriod();
    }

    /**
     * Create an instance of {@link TimeSeries }
     * 
     */
    public TimeSeries createTimeSeries() {
        return new TimeSeries();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyEnergyDataMarketDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MyEnergyDataMarketDocument }{@code >}
     */
    @XmlElementDecl(namespace = "urn:entsoe.eu:wgedi:MyEnergyData:10:1", name = "MyEnergyData_MarketDocument")
    public JAXBElement<MyEnergyDataMarketDocument> createMyEnergyDataMarketDocument(MyEnergyDataMarketDocument value) {
        return new JAXBElement<MyEnergyDataMarketDocument>(_MyEnergyDataMarketDocument_QNAME, MyEnergyDataMarketDocument.class, null, value);
    }

}
