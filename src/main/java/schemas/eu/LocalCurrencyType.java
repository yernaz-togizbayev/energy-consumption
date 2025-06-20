
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalCurrencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalCurrencyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="BAM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalCurrencyType", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum LocalCurrencyType {

    BAM;

    public String value() {
        return name();
    }

    public static LocalCurrencyType fromValue(String v) {
        return valueOf(v);
    }

}
