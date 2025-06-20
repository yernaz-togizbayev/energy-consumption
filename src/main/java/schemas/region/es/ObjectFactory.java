
package schemas.region.es;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the schemas.region.es package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Consumos_QNAME = new QName("", "consumos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: schemas.region.es
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsumosType }
     * 
     */
    public ConsumosType createConsumosType() {
        return new ConsumosType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumosType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsumosType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "consumos")
    public JAXBElement<ConsumosType> createConsumos(ConsumosType value) {
        return new JAXBElement<ConsumosType>(_Consumos_QNAME, ConsumosType.class, null, value);
    }

}
