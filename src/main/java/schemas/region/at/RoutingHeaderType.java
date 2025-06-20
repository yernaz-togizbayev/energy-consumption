
package schemas.region.at;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutingHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sender" type="{http://www.ebutilities.at/schemata/customerprocesses/consumptionrecord/01p21}SenderType"/&gt;
 *         &lt;element name="Receiver" type="{http://www.ebutilities.at/schemata/customerprocesses/consumptionrecord/01p21}ReceiverType"/&gt;
 *         &lt;element name="DocumentCreationDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingHeaderType", propOrder = {
    "sender",
    "receiver",
    "documentCreationDateTime"
})
public class RoutingHeaderType {

    @XmlElement(name = "Sender", required = true)
    protected SenderType sender;
    @XmlElement(name = "Receiver", required = true)
    protected ReceiverType receiver;
    @XmlElement(name = "DocumentCreationDateTime", required = true)
    protected String documentCreationDateTime;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link SenderType }
     *     
     */
    public SenderType getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderType }
     *     
     */
    public void setSender(SenderType value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverType }
     *     
     */
    public ReceiverType getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverType }
     *     
     */
    public void setReceiver(ReceiverType value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the documentCreationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentCreationDateTime() {
        return documentCreationDateTime;
    }

    /**
     * Sets the value of the documentCreationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentCreationDateTime(String value) {
        this.documentCreationDateTime = value;
    }

}
