
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardMarketProductTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardMarketProductTypeList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A01"/&gt;
 *     &lt;enumeration value="A02"/&gt;
 *     &lt;enumeration value="A03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandardMarketProductTypeList", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum StandardMarketProductTypeList {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Standard balancing product&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A harmonised balancing product defined by all TSOs for the exchange of balancing services.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A01")
    A_01("A01"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Specific balancing product&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A product different from a standard product.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A02")
    A_02("A02"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Product from integrated scheduling process&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;From the EBGL Article 2 (19), means an iterative process that uses at least integrated scheduling process bids that contain commercial data, complex technical data of individual power generating facilities or demand facilities and explicitly includes the start-up characteristics, the latest control area adequacy analysis and the operational security limits as an input to the process.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A03")
    A_03("A03");
    private final String value;

    StandardMarketProductTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardMarketProductTypeList fromValue(String v) {
        for (StandardMarketProductTypeList c: StandardMarketProductTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
