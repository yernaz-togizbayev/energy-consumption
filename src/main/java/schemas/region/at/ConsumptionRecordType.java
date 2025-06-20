
package schemas.region.at;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ConsumptionRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MarketParticipantDirectory" type="{http://www.ebutilities.at/schemata/customerprocesses/consumptionrecord/01p21}MarketParticipantDirectoryType"/&gt;
 *         &lt;element name="ProcessDirectory" type="{http://www.ebutilities.at/schemata/customerprocesses/consumptionrecord/01p21}ProcessDirectoryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ConsumptionRecord")
@XmlType(name = "ConsumptionRecordType", propOrder = {
    "marketParticipantDirectory",
    "processDirectory"
})
public class ConsumptionRecordType {

    @XmlElement(name = "MarketParticipantDirectory", required = true)
    protected MarketParticipantDirectoryType marketParticipantDirectory;
    @XmlElement(name = "ProcessDirectory", required = true)
    protected ProcessDirectoryType processDirectory;

    /**
     * Gets the value of the marketParticipantDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link MarketParticipantDirectoryType }
     *     
     */
    public MarketParticipantDirectoryType getMarketParticipantDirectory() {
        return marketParticipantDirectory;
    }

    /**
     * Sets the value of the marketParticipantDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketParticipantDirectoryType }
     *     
     */
    public void setMarketParticipantDirectory(MarketParticipantDirectoryType value) {
        this.marketParticipantDirectory = value;
    }

    /**
     * Gets the value of the processDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessDirectoryType }
     *     
     */
    public ProcessDirectoryType getProcessDirectory() {
        return processDirectory;
    }

    /**
     * Sets the value of the processDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessDirectoryType }
     *     
     */
    public void setProcessDirectory(ProcessDirectoryType value) {
        this.processDirectory = value;
    }

}
