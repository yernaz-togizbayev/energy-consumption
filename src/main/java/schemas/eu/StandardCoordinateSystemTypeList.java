
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardCoordinateSystemTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardCoordinateSystemTypeList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A01"/&gt;
 *     &lt;enumeration value="A02"/&gt;
 *     &lt;enumeration value="A03"/&gt;
 *     &lt;enumeration value="A04"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandardCoordinateSystemTypeList", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum StandardCoordinateSystemTypeList {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CodeDescription xmlns:ecl="urn:entsoe.eu:wgedi:codelists" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     * 							&lt;Title&gt;ED50&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;ED 50 (European Datum 1950) is a geodetic datum which was defined after World War II for the international connection of geodetic networks.&lt;/Definition&gt;&#13;
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
     * 							&lt;Title&gt;OSGB36&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Ordinance Survey Great Britain 1936. The Ordinance Survey (OS) devised the national grid reference system, and it is heavily used in their survey data, and in maps (whether published by the Ordinance Survey or commercial map producers) based on those surveys.&lt;/Definition&gt;&#13;
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
     * 							&lt;Title&gt;WGS84&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;The World Geodetic System version 1984. for use in cartography, geodesy, and navigation including by GPS. It comprises a standard coordinate system for the earth, a standard spheroidal reference surface (the datum or reference ellipsoid) for raw altitude data, and a gravitational equipotential surface (the geoid) that defines the nominal sea level.&lt;/Definition&gt;&#13;
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
     * 							&lt;Title&gt;GTRF&lt;/Title&gt;&#13;
     * 							&lt;Definition&gt;Galileo Terrestrial Reference Frame&lt;/Definition&gt;&#13;
     * 						&lt;/CodeDescription&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("A04")
    A_04("A04");
    private final String value;

    StandardCoordinateSystemTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardCoordinateSystemTypeList fromValue(String v) {
        for (StandardCoordinateSystemTypeList c: StandardCoordinateSystemTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
