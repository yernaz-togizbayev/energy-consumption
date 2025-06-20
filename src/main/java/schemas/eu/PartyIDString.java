
package schemas.eu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PartyID_String complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyID_String"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:entsoe.eu:wgedi:MyEnergyData:10:1&gt;PartyID_String-base"&gt;
 *       &lt;attribute name="codingScheme" use="required" type="{urn:entsoe.eu:wgedi:codelists}CodingSchemeTypeList" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyID_String", propOrder = {
    "value"
})
public class PartyIDString {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "codingScheme", required = true)
    protected String codingScheme;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the codingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodingScheme() {
        return codingScheme;
    }

    /**
     * Sets the value of the codingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodingScheme(String value) {
        this.codingScheme = value;
    }

}
