
package schemas.eu;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MyEnergyData_MarketDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyEnergyData_MarketDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}ID_String"/&gt;
 *         &lt;element name="revisionNumber" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}ESMPVersion_String" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}MessageKind_String" minOccurs="0"/&gt;
 *         &lt;element name="docStatus" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}Action_Status" minOccurs="0"/&gt;
 *         &lt;element name="createdDateTime" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}ESMP_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="sender_MarketParticipant.name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sender_MarketParticipant.marketRole.type" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}MarketRoleKind_String" minOccurs="0"/&gt;
 *         &lt;element name="sender_MarketParticipant.mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}PartyID_String" minOccurs="0"/&gt;
 *         &lt;element name="receiver_MarketParticipant.name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiver_MarketParticipant.marketRole.type" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}MarketRoleKind_String" minOccurs="0"/&gt;
 *         &lt;element name="receiver_MarketParticipant.mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}PartyID_String" minOccurs="0"/&gt;
 *         &lt;element name="period.timeInterval" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}ESMP_DateTimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="mD_Area_Domain.mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}AreaID_String" minOccurs="0"/&gt;
 *         &lt;element name="TimeSeries" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}TimeSeries" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyEnergyData_MarketDocument", propOrder = {
    "mrid",
    "revisionNumber",
    "type",
    "docStatus",
    "createdDateTime",
    "senderMarketParticipantName",
    "senderMarketParticipantMarketRoleType",
    "senderMarketParticipantMRID",
    "receiverMarketParticipantName",
    "receiverMarketParticipantMarketRoleType",
    "receiverMarketParticipantMRID",
    "periodTimeInterval",
    "mdAreaDomainMRID",
    "timeSeries"
})
public class MyEnergyDataMarketDocument {

    @XmlElement(name = "mRID", required = true)
    protected String mrid;
    protected String revisionNumber;
    protected String type;
    protected ActionStatus docStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDateTime;
    @XmlElement(name = "sender_MarketParticipant.name")
    protected String senderMarketParticipantName;
    @XmlElement(name = "sender_MarketParticipant.marketRole.type")
    protected String senderMarketParticipantMarketRoleType;
    @XmlElement(name = "sender_MarketParticipant.mRID")
    protected PartyIDString senderMarketParticipantMRID;
    @XmlElement(name = "receiver_MarketParticipant.name")
    protected String receiverMarketParticipantName;
    @XmlElement(name = "receiver_MarketParticipant.marketRole.type")
    protected String receiverMarketParticipantMarketRoleType;
    @XmlElement(name = "receiver_MarketParticipant.mRID")
    protected PartyIDString receiverMarketParticipantMRID;
    @XmlElement(name = "period.timeInterval")
    protected ESMPDateTimeInterval periodTimeInterval;
    @XmlElement(name = "mD_Area_Domain.mRID")
    protected AreaIDString mdAreaDomainMRID;
    @XmlElement(name = "TimeSeries")
    protected List<TimeSeries> timeSeries;

    /**
     * Gets the value of the mrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRID() {
        return mrid;
    }

    /**
     * Sets the value of the mrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRID(String value) {
        this.mrid = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the docStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatus }
     *     
     */
    public ActionStatus getDocStatus() {
        return docStatus;
    }

    /**
     * Sets the value of the docStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatus }
     *     
     */
    public void setDocStatus(ActionStatus value) {
        this.docStatus = value;
    }

    /**
     * Gets the value of the createdDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Sets the value of the createdDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDateTime(XMLGregorianCalendar value) {
        this.createdDateTime = value;
    }

    /**
     * Gets the value of the senderMarketParticipantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderMarketParticipantName() {
        return senderMarketParticipantName;
    }

    /**
     * Sets the value of the senderMarketParticipantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderMarketParticipantName(String value) {
        this.senderMarketParticipantName = value;
    }

    /**
     * Gets the value of the senderMarketParticipantMarketRoleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderMarketParticipantMarketRoleType() {
        return senderMarketParticipantMarketRoleType;
    }

    /**
     * Sets the value of the senderMarketParticipantMarketRoleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderMarketParticipantMarketRoleType(String value) {
        this.senderMarketParticipantMarketRoleType = value;
    }

    /**
     * Gets the value of the senderMarketParticipantMRID property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIDString }
     *     
     */
    public PartyIDString getSenderMarketParticipantMRID() {
        return senderMarketParticipantMRID;
    }

    /**
     * Sets the value of the senderMarketParticipantMRID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIDString }
     *     
     */
    public void setSenderMarketParticipantMRID(PartyIDString value) {
        this.senderMarketParticipantMRID = value;
    }

    /**
     * Gets the value of the receiverMarketParticipantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverMarketParticipantName() {
        return receiverMarketParticipantName;
    }

    /**
     * Sets the value of the receiverMarketParticipantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverMarketParticipantName(String value) {
        this.receiverMarketParticipantName = value;
    }

    /**
     * Gets the value of the receiverMarketParticipantMarketRoleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverMarketParticipantMarketRoleType() {
        return receiverMarketParticipantMarketRoleType;
    }

    /**
     * Sets the value of the receiverMarketParticipantMarketRoleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverMarketParticipantMarketRoleType(String value) {
        this.receiverMarketParticipantMarketRoleType = value;
    }

    /**
     * Gets the value of the receiverMarketParticipantMRID property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIDString }
     *     
     */
    public PartyIDString getReceiverMarketParticipantMRID() {
        return receiverMarketParticipantMRID;
    }

    /**
     * Sets the value of the receiverMarketParticipantMRID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIDString }
     *     
     */
    public void setReceiverMarketParticipantMRID(PartyIDString value) {
        this.receiverMarketParticipantMRID = value;
    }

    /**
     * Gets the value of the periodTimeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link ESMPDateTimeInterval }
     *     
     */
    public ESMPDateTimeInterval getPeriodTimeInterval() {
        return periodTimeInterval;
    }

    /**
     * Sets the value of the periodTimeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESMPDateTimeInterval }
     *     
     */
    public void setPeriodTimeInterval(ESMPDateTimeInterval value) {
        this.periodTimeInterval = value;
    }

    /**
     * Gets the value of the mdAreaDomainMRID property.
     * 
     * @return
     *     possible object is
     *     {@link AreaIDString }
     *     
     */
    public AreaIDString getMDAreaDomainMRID() {
        return mdAreaDomainMRID;
    }

    /**
     * Sets the value of the mdAreaDomainMRID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaIDString }
     *     
     */
    public void setMDAreaDomainMRID(AreaIDString value) {
        this.mdAreaDomainMRID = value;
    }

    /**
     * Gets the value of the timeSeries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSeries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeSeries }
     * 
     * 
     */
    public List<TimeSeries> getTimeSeries() {
        if (timeSeries == null) {
            timeSeries = new ArrayList<TimeSeries>();
        }
        return this.timeSeries;
    }

}
