
package schemas.eu;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalUnitSymbol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalUnitSymbol"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="AMP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocalUnitSymbol", namespace = "urn:entsoe.eu:wgedi:codelists")
@XmlEnum
public enum LocalUnitSymbol {

    AMP;

    public String value() {
        return name();
    }

    public static LocalUnitSymbol fromValue(String v) {
        return valueOf(v);
    }

}
