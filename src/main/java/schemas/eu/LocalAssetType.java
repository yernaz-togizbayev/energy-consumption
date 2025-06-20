
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalAssetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalAssetType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A01"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalAssetType", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum LocalAssetType {

    @XmlEnumValue("A01")
    A_01("A01");
    private final String value;

    LocalAssetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocalAssetType fromValue(String v) {
        for (LocalAssetType c: LocalAssetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
