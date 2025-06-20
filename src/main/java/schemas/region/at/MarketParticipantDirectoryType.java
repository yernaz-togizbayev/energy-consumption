
package schemas.region.at;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketParticipantDirectoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketParticipantDirectoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoutingHeader" type="{http://www.ebutilities.at/schemata/customerprocesses/consumptionrecord/01p21}RoutingHeaderType"/&gt;
 *         &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DocumentMode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Duplicate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SchemaVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketParticipantDirectoryType", propOrder = {
    "routingHeader",
    "sector",
    "messageCode"
})
public class MarketParticipantDirectoryType {

    @XmlElement(name = "RoutingHeader", required = true)
    protected RoutingHeaderType routingHeader;
    @XmlElement(name = "Sector", required = true)
    protected String sector;
    @XmlElement(name = "MessageCode", required = true)
    protected String messageCode;
    @XmlAttribute(name = "DocumentMode")
    protected String documentMode;
    @XmlAttribute(name = "Duplicate")
    protected String duplicate;
    @XmlAttribute(name = "SchemaVersion")
    protected String schemaVersion;

    /**
     * Gets the value of the routingHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingHeaderType }
     *     
     */
    public RoutingHeaderType getRoutingHeader() {
        return routingHeader;
    }

    /**
     * Sets the value of the routingHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingHeaderType }
     *     
     */
    public void setRoutingHeader(RoutingHeaderType value) {
        this.routingHeader = value;
    }

    /**
     * Gets the value of the sector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSector(String value) {
        this.sector = value;
    }

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the documentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentMode() {
        return documentMode;
    }

    /**
     * Sets the value of the documentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentMode(String value) {
        this.documentMode = value;
    }

    /**
     * Gets the value of the duplicate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicate() {
        return duplicate;
    }

    /**
     * Sets the value of the duplicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicate(String value) {
        this.duplicate = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
