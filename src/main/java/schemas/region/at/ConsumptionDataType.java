
package schemas.region.at;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumptionPosition" type="{http://www.ebutilities.at/schemata/customerprocesses/consumptionrecord/01p21}ConsumptionPositionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MeterCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionDataType", propOrder = {
    "consumptionPosition"
})
public class ConsumptionDataType {

    @XmlElement(name = "ConsumptionPosition")
    protected List<ConsumptionPositionType> consumptionPosition;
    @XmlAttribute(name = "MeterCode")
    protected String meterCode;

    /**
     * Gets the value of the consumptionPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionPositionType }
     * 
     * 
     */
    public List<ConsumptionPositionType> getConsumptionPosition() {
        if (consumptionPosition == null) {
            consumptionPosition = new ArrayList<ConsumptionPositionType>();
        }
        return this.consumptionPosition;
    }

    /**
     * Gets the value of the meterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterCode() {
        return meterCode;
    }

    /**
     * Sets the value of the meterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterCode(String value) {
        this.meterCode = value;
    }

}
