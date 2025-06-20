
package schemas.region.es;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consumosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consumosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Consumo_kWh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metodo_obtencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consumos" type="{}consumosType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consumosType", propOrder = {
    "cups",
    "fecha",
    "hora",
    "consumoKWh",
    "metodoObtencion",
    "consumos"
})
public class ConsumosType {

    @XmlElement(name = "CUPS")
    protected String cups;
    @XmlElement(name = "Fecha")
    protected String fecha;
    @XmlElement(name = "Hora")
    protected String hora;
    @XmlElement(name = "Consumo_kWh")
    protected String consumoKWh;
    @XmlElement(name = "metodo_obtencion")
    protected String metodoObtencion;
    protected List<ConsumosType> consumos;

    /**
     * Gets the value of the cups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUPS() {
        return cups;
    }

    /**
     * Sets the value of the cups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUPS(String value) {
        this.cups = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the hora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHora() {
        return hora;
    }

    /**
     * Sets the value of the hora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHora(String value) {
        this.hora = value;
    }

    /**
     * Gets the value of the consumoKWh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumoKWh() {
        return consumoKWh;
    }

    /**
     * Sets the value of the consumoKWh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumoKWh(String value) {
        this.consumoKWh = value;
    }

    /**
     * Gets the value of the metodoObtencion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoObtencion() {
        return metodoObtencion;
    }

    /**
     * Sets the value of the metodoObtencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoObtencion(String value) {
        this.metodoObtencion = value;
    }

    /**
     * Gets the value of the consumos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumosType }
     * 
     * 
     */
    public List<ConsumosType> getConsumos() {
        if (consumos == null) {
            consumos = new ArrayList<ConsumosType>();
        }
        return this.consumos;
    }

}
