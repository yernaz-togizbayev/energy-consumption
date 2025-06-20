
package schemas.eu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketEvaluationPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketEvaluationPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}MeasurementPointID_String"/&gt;
 *         &lt;element name="connectionCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usagePointLocation.geoInfoReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketEvaluationPoint", propOrder = {
    "mrid",
    "connectionCategory",
    "usagePointLocationGeoInfoReference"
})
public class MarketEvaluationPoint {

    @XmlElement(name = "mRID", required = true)
    protected MeasurementPointIDString mrid;
    protected String connectionCategory;
    @XmlElement(name = "usagePointLocation.geoInfoReference")
    protected String usagePointLocationGeoInfoReference;

    /**
     * Gets the value of the mrid property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPointIDString }
     *     
     */
    public MeasurementPointIDString getMRID() {
        return mrid;
    }

    /**
     * Sets the value of the mrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPointIDString }
     *     
     */
    public void setMRID(MeasurementPointIDString value) {
        this.mrid = value;
    }

    /**
     * Gets the value of the connectionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionCategory() {
        return connectionCategory;
    }

    /**
     * Sets the value of the connectionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionCategory(String value) {
        this.connectionCategory = value;
    }

    /**
     * Gets the value of the usagePointLocationGeoInfoReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsagePointLocationGeoInfoReference() {
        return usagePointLocationGeoInfoReference;
    }

    /**
     * Sets the value of the usagePointLocationGeoInfoReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsagePointLocationGeoInfoReference(String value) {
        this.usagePointLocationGeoInfoReference = value;
    }

}
