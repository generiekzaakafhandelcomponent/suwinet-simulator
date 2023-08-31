
package nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Voertuigverplichtingen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Voertuigverplichtingen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatBVoertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="TijdBVoertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdstip" minOccurs="0"/>
 *         <element name="DatEVoertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="TijdEVoertuigverplichtingen" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdstip" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Voertuigverplichtingen", propOrder = {
    "datBVoertuigverplichtingen",
    "tijdBVoertuigverplichtingen",
    "datEVoertuigverplichtingen",
    "tijdEVoertuigverplichtingen"
})
public class Voertuigverplichtingen {

    @XmlElement(name = "DatBVoertuigverplichtingen")
    protected String datBVoertuigverplichtingen;
    @XmlElement(name = "TijdBVoertuigverplichtingen")
    protected String tijdBVoertuigverplichtingen;
    @XmlElement(name = "DatEVoertuigverplichtingen")
    protected String datEVoertuigverplichtingen;
    @XmlElement(name = "TijdEVoertuigverplichtingen")
    protected String tijdEVoertuigverplichtingen;

    /**
     * Gets the value of the datBVoertuigverplichtingen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatBVoertuigverplichtingen() {
        return datBVoertuigverplichtingen;
    }

    /**
     * Sets the value of the datBVoertuigverplichtingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatBVoertuigverplichtingen(String value) {
        this.datBVoertuigverplichtingen = value;
    }

    /**
     * Gets the value of the tijdBVoertuigverplichtingen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTijdBVoertuigverplichtingen() {
        return tijdBVoertuigverplichtingen;
    }

    /**
     * Sets the value of the tijdBVoertuigverplichtingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTijdBVoertuigverplichtingen(String value) {
        this.tijdBVoertuigverplichtingen = value;
    }

    /**
     * Gets the value of the datEVoertuigverplichtingen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatEVoertuigverplichtingen() {
        return datEVoertuigverplichtingen;
    }

    /**
     * Sets the value of the datEVoertuigverplichtingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatEVoertuigverplichtingen(String value) {
        this.datEVoertuigverplichtingen = value;
    }

    /**
     * Gets the value of the tijdEVoertuigverplichtingen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTijdEVoertuigverplichtingen() {
        return tijdEVoertuigverplichtingen;
    }

    /**
     * Sets the value of the tijdEVoertuigverplichtingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTijdEVoertuigverplichtingen(String value) {
        this.tijdEVoertuigverplichtingen = value;
    }

}
