
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardRoleTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardRoleTypeList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A01"/&gt;
 *     &lt;enumeration value="A02"/&gt;
 *     &lt;enumeration value="A03"/&gt;
 *     &lt;enumeration value="A04"/&gt;
 *     &lt;enumeration value="A05"/&gt;
 *     &lt;enumeration value="A06"/&gt;
 *     &lt;enumeration value="A07"/&gt;
 *     &lt;enumeration value="A08"/&gt;
 *     &lt;enumeration value="A09"/&gt;
 *     &lt;enumeration value="A10"/&gt;
 *     &lt;enumeration value="A11"/&gt;
 *     &lt;enumeration value="A12"/&gt;
 *     &lt;enumeration value="A13"/&gt;
 *     &lt;enumeration value="A14"/&gt;
 *     &lt;enumeration value="A15"/&gt;
 *     &lt;enumeration value="A16"/&gt;
 *     &lt;enumeration value="A17"/&gt;
 *     &lt;enumeration value="A18"/&gt;
 *     &lt;enumeration value="A19"/&gt;
 *     &lt;enumeration value="A20"/&gt;
 *     &lt;enumeration value="A21"/&gt;
 *     &lt;enumeration value="A22"/&gt;
 *     &lt;enumeration value="A23"/&gt;
 *     &lt;enumeration value="A24"/&gt;
 *     &lt;enumeration value="A25"/&gt;
 *     &lt;enumeration value="A26"/&gt;
 *     &lt;enumeration value="A27"/&gt;
 *     &lt;enumeration value="A28"/&gt;
 *     &lt;enumeration value="A29"/&gt;
 *     &lt;enumeration value="A30"/&gt;
 *     &lt;enumeration value="A31"/&gt;
 *     &lt;enumeration value="A32"/&gt;
 *     &lt;enumeration value="A33"/&gt;
 *     &lt;enumeration value="A34"/&gt;
 *     &lt;enumeration value="A35"/&gt;
 *     &lt;enumeration value="A36"/&gt;
 *     &lt;enumeration value="A37"/&gt;
 *     &lt;enumeration value="A38"/&gt;
 *     &lt;enumeration value="A39"/&gt;
 *     &lt;enumeration value="A40"/&gt;
 *     &lt;enumeration value="A41"/&gt;
 *     &lt;enumeration value="A42"/&gt;
 *     &lt;enumeration value="A43"/&gt;
 *     &lt;enumeration value="A44"/&gt;
 *     &lt;enumeration value="A45"/&gt;
 *     &lt;enumeration value="A46"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandardRoleTypeList", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum StandardRoleTypeList {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Trade responsible party&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
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
     * 							&lt;Title&gt;Consumption responsible party&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
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
     * 							&lt;Title&gt;Combined power exchange (not to be used)&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;This role is no longer in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A03")
    A_03("A03"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;System operator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A04")
    A_04("A04"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Imbalance settlement responsible&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A05")
    A_05("A05"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Production responsible party&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A06")
    A_06("A06"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Transmission capacity allocator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A07")
    A_07("A07"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Balance responsible party&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A08")
    A_08("A08"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Metered data aggregator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A09")
    A_09("A09"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Billing agent&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A10")
    A_10("A10"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Market operator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A11")
    A_11("A11"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Balance supplier&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A12")
    A_12("A12"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Consumer&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A13")
    A_13("A13"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Control area operator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A14")
    A_14("A14"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Control block operator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A15")
    A_15("A15"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Coordination center operator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A16")
    A_16("A16"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Grid access provider&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A17")
    A_17("A17"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Grid operator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A18")
    A_18("A18"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Meter administrator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A19")
    A_19("A19"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Party connected to grid&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A20")
    A_20("A20"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Producer&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A21")
    A_21("A21"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Profile maintenance party&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A22")
    A_22("A22"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Meter operator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A23")
    A_23("A23"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Metered data collector&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A24")
    A_24("A24"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Metered data responsible&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A25")
    A_25("A25"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Metering point administrator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A26")
    A_26("A26"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Resource Provider&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A27")
    A_27("A27"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Scheduling coordinator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A28")
    A_28("A28"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Capacity Trader&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A29")
    A_29("A29"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Interconnection Trade Responsible&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A30")
    A_30("A30"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Nomination Validator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A31")
    A_31("A31"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Market information aggregator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document. &#13;
     * A party that collects information from different sources and assembles  it to provide a summary of the market.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A32")
    A_32("A32"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Information receiver&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document. &#13;
     * A party, not necessarily a market participant, which receives information about the market.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A33")
    A_33("A33"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Reserve Allocator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document. &#13;
     * A party that informs the market of reserve requirements, receives tenders against the requirements and in compliance with the prequalification criteria, determines what tenders meet requirements and assigns tenders.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A34")
    A_34("A34"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;MOL Responsible&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document. &#13;
     * A party that Informs the market of reserve requirements, receives tenders against the requirements and in compliance with the prequalification criteria, determines what tenders meet requirements and assigns tenders.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A35")
    A_35("A35"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Capacity Coordinator&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document. &#13;
     * A party, acting on behalf of the SOs involved, responsible for establishing a coordinated Offered Capacity and/or NTC and/or ATC between several Market Balance Areas.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A36")
    A_36("A36"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Reconciliation Accountable&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Refer to role model definitions in the ENTSO-E Harmonised Role Model Document. &#13;
     * A party that is financially accountable for the reconciled volume of energy products for a profiled local metering point.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A37")
    A_37("A37"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Reconciliation Responsible&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A party that is responsible for reconciling, within a metering grid area, the volumes used in the imbalance settlement process for profiled metering points and the actual metered quantities.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A38")
    A_38("A38"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Data provider&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A party that is responsible for providing information to a central authority.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A39")
    A_39("A39"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Local Issuing Office (LIO)&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A party that is responsible for operating a Local Issuing Office (LIO).&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A40")
    A_40("A40"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Central Issuing Office (CIO)&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A party that is responsible for operating a Central Issuing Office (CIO).&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A41")
    A_41("A41"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;EIC Participant&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A party that participates in the EIC environment.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A42")
    A_42("A42"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Weather analyser&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A party that analyses the current and forecast weather situation and establishes a prognosis of its impact on the renewable energy environment as well as the overall load.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A43")
    A_43("A43"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Regional Security Coordinator (RSC)&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;The RSC as defined in the System Operation guideline.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A44")
    A_44("A44"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Energy Service Company (ESCO)&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A party offering energy-related services to the Party Connected to Grid, but not directly active in the energy value chain or the physical infrastructure itself. The ESCO may provide insight services as well as energy management services.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A45")
    A_45("A45"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Balancing Service Provider&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A party with reserve-providing units or reserve-providing groups able to provide balancing services to LFC Operators.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A46")
    A_46("A46");
    private final String value;

    StandardRoleTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardRoleTypeList fromValue(String v) {
        for (StandardRoleTypeList c: StandardRoleTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
