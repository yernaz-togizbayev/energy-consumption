
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalCoordinateSystemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalCoordinateSystemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A01"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalCoordinateSystemType", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum LocalCoordinateSystemType {

    @XmlEnumValue("A01")
    A_01("A01");
    private final String value;

    LocalCoordinateSystemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocalCoordinateSystemType fromValue(String v) {
        for (LocalCoordinateSystemType c: LocalCoordinateSystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
