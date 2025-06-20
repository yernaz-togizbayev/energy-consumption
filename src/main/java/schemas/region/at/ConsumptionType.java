
package schemas.region.at;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeteringReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MeteringPeriodStart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MeteringPeriodEnd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MeteringIntervall" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumberOfMeteringIntervall" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConsumptionData" type="{http://www.ebutilities.at/schemata/customerprocesses/consumptionrecord/01p21}ConsumptionDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionType", propOrder = {
    "meteringReason",
    "meteringPeriodStart",
    "meteringPeriodEnd",
    "meteringIntervall",
    "numberOfMeteringIntervall",
    "consumptionData"
})
public class ConsumptionType {

    @XmlElement(name = "MeteringReason", required = true)
    protected String meteringReason;
    @XmlElement(name = "MeteringPeriodStart", required = true)
    protected String meteringPeriodStart;
    @XmlElement(name = "MeteringPeriodEnd", required = true)
    protected String meteringPeriodEnd;
    @XmlElement(name = "MeteringIntervall", required = true)
    protected String meteringIntervall;
    @XmlElement(name = "NumberOfMeteringIntervall", required = true)
    protected String numberOfMeteringIntervall;
    @XmlElement(name = "ConsumptionData", required = true)
    protected ConsumptionDataType consumptionData;

    /**
     * Gets the value of the meteringReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringReason() {
        return meteringReason;
    }

    /**
     * Sets the value of the meteringReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeteringReason(String value) {
        this.meteringReason = value;
    }

    /**
     * Gets the value of the meteringPeriodStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringPeriodStart() {
        return meteringPeriodStart;
    }

    /**
     * Sets the value of the meteringPeriodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeteringPeriodStart(String value) {
        this.meteringPeriodStart = value;
    }

    /**
     * Gets the value of the meteringPeriodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringPeriodEnd() {
        return meteringPeriodEnd;
    }

    /**
     * Sets the value of the meteringPeriodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeteringPeriodEnd(String value) {
        this.meteringPeriodEnd = value;
    }

    /**
     * Gets the value of the meteringIntervall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringIntervall() {
        return meteringIntervall;
    }

    /**
     * Sets the value of the meteringIntervall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeteringIntervall(String value) {
        this.meteringIntervall = value;
    }

    /**
     * Gets the value of the numberOfMeteringIntervall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfMeteringIntervall() {
        return numberOfMeteringIntervall;
    }

    /**
     * Sets the value of the numberOfMeteringIntervall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfMeteringIntervall(String value) {
        this.numberOfMeteringIntervall = value;
    }

    /**
     * Gets the value of the consumptionData property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionDataType }
     *     
     */
    public ConsumptionDataType getConsumptionData() {
        return consumptionData;
    }

    /**
     * Sets the value of the consumptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionDataType }
     *     
     */
    public void setConsumptionData(ConsumptionDataType value) {
        this.consumptionData = value;
    }

}
