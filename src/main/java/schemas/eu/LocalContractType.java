
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalContractType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalContractType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="A01"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalContractType", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum LocalContractType {

    @XmlEnumValue("A01")
    A_01("A01");
    private final String value;

    LocalContractType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocalContractType fromValue(String v) {
        for (LocalContractType c: LocalContractType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
