
package schemas.eu;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Point complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Point"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="position" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}Position_Integer"/&gt;
 *         &lt;element name="in_Quantity.quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="in_Quantity.quality" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}Quality_String" minOccurs="0"/&gt;
 *         &lt;element name="out_Quantity.quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="out_Quantity.quality" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}Quality_String" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point", propOrder = {
    "position",
    "inQuantityQuantity",
    "inQuantityQuality",
    "outQuantityQuantity",
    "outQuantityQuality"
})
public class Point {

    @XmlSchemaType(name = "integer")
    protected int position;
    @XmlElement(name = "in_Quantity.quantity")
    protected BigDecimal inQuantityQuantity;
    @XmlElement(name = "in_Quantity.quality")
    protected String inQuantityQuality;
    @XmlElement(name = "out_Quantity.quantity")
    protected BigDecimal outQuantityQuantity;
    @XmlElement(name = "out_Quantity.quality")
    protected String outQuantityQuality;

    /**
     * Gets the value of the position property.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
    }

    /**
     * Gets the value of the inQuantityQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInQuantityQuantity() {
        return inQuantityQuantity;
    }

    /**
     * Sets the value of the inQuantityQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInQuantityQuantity(BigDecimal value) {
        this.inQuantityQuantity = value;
    }

    /**
     * Gets the value of the inQuantityQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInQuantityQuality() {
        return inQuantityQuality;
    }

    /**
     * Sets the value of the inQuantityQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInQuantityQuality(String value) {
        this.inQuantityQuality = value;
    }

    /**
     * Gets the value of the outQuantityQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutQuantityQuantity() {
        return outQuantityQuantity;
    }

    /**
     * Sets the value of the outQuantityQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutQuantityQuantity(BigDecimal value) {
        this.outQuantityQuantity = value;
    }

    /**
     * Gets the value of the outQuantityQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutQuantityQuality() {
        return outQuantityQuality;
    }

    /**
     * Sets the value of the outQuantityQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutQuantityQuality(String value) {
        this.outQuantityQuality = value;
    }

}
