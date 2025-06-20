
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalPriceCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalPriceCategoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A01"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalPriceCategoryType", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum LocalPriceCategoryType {

    @XmlEnumValue("A01")
    A_01("A01");
    private final String value;

    LocalPriceCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocalPriceCategoryType fromValue(String v) {
        for (LocalPriceCategoryType c: LocalPriceCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
