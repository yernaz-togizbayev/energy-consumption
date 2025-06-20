
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardUnitOfMeasureTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardUnitOfMeasureTypeList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A59"/&gt;
 *     &lt;enumeration value="A90"/&gt;
 *     &lt;enumeration value="A97"/&gt;
 *     &lt;enumeration value="AMP"/&gt;
 *     &lt;enumeration value="C62"/&gt;
 *     &lt;enumeration value="CEL"/&gt;
 *     &lt;enumeration value="D54"/&gt;
 *     &lt;enumeration value="DD"/&gt;
 *     &lt;enumeration value="GWH"/&gt;
 *     &lt;enumeration value="HMQ"/&gt;
 *     &lt;enumeration value="KEL"/&gt;
 *     &lt;enumeration value="KMT"/&gt;
 *     &lt;enumeration value="KVR"/&gt;
 *     &lt;enumeration value="KVT"/&gt;
 *     &lt;enumeration value="KWH"/&gt;
 *     &lt;enumeration value="KWT"/&gt;
 *     &lt;enumeration value="MAH"/&gt;
 *     &lt;enumeration value="MAR"/&gt;
 *     &lt;enumeration value="MAW"/&gt;
 *     &lt;enumeration value="MMT"/&gt;
 *     &lt;enumeration value="MQS"/&gt;
 *     &lt;enumeration value="MTQ"/&gt;
 *     &lt;enumeration value="MTR"/&gt;
 *     &lt;enumeration value="MTS"/&gt;
 *     &lt;enumeration value="MVA"/&gt;
 *     &lt;enumeration value="MWH"/&gt;
 *     &lt;enumeration value="P1"/&gt;
 *     &lt;enumeration value="WTT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandardUnitOfMeasureTypeList", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum StandardUnitOfMeasureTypeList {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;OKTA unit&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit of measurement of the cloudiness expressed in OKTA or OCTA, i.e. A unit of count defining the number of eighth-parts as a measure of the celestial dome cloud coverage.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A59")
    A_59("A59"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;gigawatt&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;GW unit as per UN/CEFACT recommendation 20.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A90")
    A_90("A90"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;hectopascal&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit of measurement of the pressure expressed in hectopascal.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A97")
    A_97("A97"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;ampere&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;The unit of electrical current in the International system of Units (SI) equivalent to one Coulomb per second.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    AMP("AMP"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;One&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit for dimensionless quantities, also called quantities of dimension one.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("C62")
    C_62("C62"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;Celsius&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit of measurement of temperature expressed in degree Celsius.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    CEL("CEL"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;watt per square meter&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit of measurement of the density of heat flow rate expressed in watt per square meter.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("D54")
    D_54("D54"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;degree (unit of angle)&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit of measurement of angles expressed in a 0 to 360 degree gradient.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    DD("DD"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;gigawatt hour&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;GWh unit as per UN/CEFACT recommendation 20.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    GWH("GWH"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;cubic hectometres&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit of volume equal to one million cubic metres.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    HMQ("HMQ"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;K (Kelvin)&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Temperature unit refer ISO 80000-5 (Quantities and units, Part 5: Thermodynamics).&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    KEL("KEL"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;kilometre&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;km unit as per UN/CEFACT recommendation 20.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    KMT("KMT"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;kilovolt ampere reactive&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit of electrical reactive power represented by a current of one thousand amperes flowing due to a potential difference of one thousand volts where the sine of the phase angle between them is 1. The unity power factor is expressed in thousands of a volt ampere reactive.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    KVR("KVR"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;kilovolt&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;kV unit as per UN/CEFACT recommendation 20.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    KVT("KVT"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;kilowatt hour&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A total amount of electrical energy transferred or consumed in one hour.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    KWH("KWH"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;kilowatt&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit of bulk power flow, which can be defined as the rate of energy transfer /consumption when a current of 1000 amperes flows due to a potential of 1000 volts at unity power factor expressed in thousands of a watt.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    KWT("KWT"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;megavolt ampere reactive hours&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Total amount of reactive power across a power system.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MAH("MAH"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;megavolt ampere reactive&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit of electrical reactive power represented by a current of one thousand amperes flowing due to a potential difference of one thousand volts where the sine of the phase angle between them is 1.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MAR("MAR"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;megawatt&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit of bulk power flow, which can be defined as the rate of energy transfer /consumption when a current of 1000 amperes flows due to a potential of 1000 volts at unity power factor expressed in millions of a watt.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MAW("MAW"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;millimeter&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit of measurement of length expressed in millimeter.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MMT("MMT"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;cubic metres per second&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;The volume flow rate of cubic metre per second.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MQS("MQS"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;cubic metre&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A Cubic metre.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MTQ("MTQ"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;metre&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;The length of a metre.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MTR("MTR"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;meter per second&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit of measurement of the speed expressed in m/s.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MTS("MTS"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;megavolt-ampere&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;MVA unit as per UN/CEFACT recommendation 20.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MVA("MVA"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;megawatt hours&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;The total amount of bulk energy transferred or consumed.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MWH("MWH"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;percent&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;A unit of proportion equal to 0.01.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("P1")
    P_1("P1"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;watt&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;The watt is the International System of Units (SI) standard unit of power (energy per unit time), the equivalent of one joule per second.&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    WTT("WTT");
    private final String value;

    StandardUnitOfMeasureTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardUnitOfMeasureTypeList fromValue(String v) {
        for (StandardUnitOfMeasureTypeList c: StandardUnitOfMeasureTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
