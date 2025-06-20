
package schemas.region.at;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumptionPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionPositionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTimeFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DateTimeTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MeteringMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BillingUOM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BillingQuantity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionPositionType", propOrder = {
    "dateTimeFrom",
    "dateTimeTo",
    "meteringMethod",
    "billingUOM",
    "billingQuantity"
})
public class ConsumptionPositionType {

    @XmlElement(name = "DateTimeFrom", required = true)
    protected String dateTimeFrom;
    @XmlElement(name = "DateTimeTo", required = true)
    protected String dateTimeTo;
    @XmlElement(name = "MeteringMethod", required = true)
    protected String meteringMethod;
    @XmlElement(name = "BillingUOM", required = true)
    protected String billingUOM;
    @XmlElement(name = "BillingQuantity", required = true)
    protected String billingQuantity;

    /**
     * Gets the value of the dateTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeFrom() {
        return dateTimeFrom;
    }

    /**
     * Sets the value of the dateTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeFrom(String value) {
        this.dateTimeFrom = value;
    }

    /**
     * Gets the value of the dateTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeTo() {
        return dateTimeTo;
    }

    /**
     * Sets the value of the dateTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeTo(String value) {
        this.dateTimeTo = value;
    }

    /**
     * Gets the value of the meteringMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringMethod() {
        return meteringMethod;
    }

    /**
     * Sets the value of the meteringMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeteringMethod(String value) {
        this.meteringMethod = value;
    }

    /**
     * Gets the value of the billingUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingUOM() {
        return billingUOM;
    }

    /**
     * Sets the value of the billingUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingUOM(String value) {
        this.billingUOM = value;
    }

    /**
     * Gets the value of the billingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingQuantity() {
        return billingQuantity;
    }

    /**
     * Sets the value of the billingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingQuantity(String value) {
        this.billingQuantity = value;
    }

}
