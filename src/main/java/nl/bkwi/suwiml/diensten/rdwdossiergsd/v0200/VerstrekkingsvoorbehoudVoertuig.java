
package nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerstrekkingsvoorbehoudVoertuig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VerstrekkingsvoorbehoudVoertuig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatBVerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="TijdBVerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdstip" minOccurs="0"/>
 *         <element name="DatEVerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="TijdEVerstrekkingsvoorbehoudVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdstip" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerstrekkingsvoorbehoudVoertuig", propOrder = {
    "datBVerstrekkingsvoorbehoudVoertuig",
    "tijdBVerstrekkingsvoorbehoudVoertuig",
    "datEVerstrekkingsvoorbehoudVoertuig",
    "tijdEVerstrekkingsvoorbehoudVoertuig"
})
public class VerstrekkingsvoorbehoudVoertuig {

    @XmlElement(name = "DatBVerstrekkingsvoorbehoudVoertuig")
    protected String datBVerstrekkingsvoorbehoudVoertuig;
    @XmlElement(name = "TijdBVerstrekkingsvoorbehoudVoertuig")
    protected String tijdBVerstrekkingsvoorbehoudVoertuig;
    @XmlElement(name = "DatEVerstrekkingsvoorbehoudVoertuig")
    protected String datEVerstrekkingsvoorbehoudVoertuig;
    @XmlElement(name = "TijdEVerstrekkingsvoorbehoudVoertuig")
    protected String tijdEVerstrekkingsvoorbehoudVoertuig;

    /**
     * Gets the value of the datBVerstrekkingsvoorbehoudVoertuig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatBVerstrekkingsvoorbehoudVoertuig() {
        return datBVerstrekkingsvoorbehoudVoertuig;
    }

    /**
     * Sets the value of the datBVerstrekkingsvoorbehoudVoertuig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatBVerstrekkingsvoorbehoudVoertuig(String value) {
        this.datBVerstrekkingsvoorbehoudVoertuig = value;
    }

    /**
     * Gets the value of the tijdBVerstrekkingsvoorbehoudVoertuig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTijdBVerstrekkingsvoorbehoudVoertuig() {
        return tijdBVerstrekkingsvoorbehoudVoertuig;
    }

    /**
     * Sets the value of the tijdBVerstrekkingsvoorbehoudVoertuig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTijdBVerstrekkingsvoorbehoudVoertuig(String value) {
        this.tijdBVerstrekkingsvoorbehoudVoertuig = value;
    }

    /**
     * Gets the value of the datEVerstrekkingsvoorbehoudVoertuig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatEVerstrekkingsvoorbehoudVoertuig() {
        return datEVerstrekkingsvoorbehoudVoertuig;
    }

    /**
     * Sets the value of the datEVerstrekkingsvoorbehoudVoertuig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatEVerstrekkingsvoorbehoudVoertuig(String value) {
        this.datEVerstrekkingsvoorbehoudVoertuig = value;
    }

    /**
     * Gets the value of the tijdEVerstrekkingsvoorbehoudVoertuig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTijdEVerstrekkingsvoorbehoudVoertuig() {
        return tijdEVerstrekkingsvoorbehoudVoertuig;
    }

    /**
     * Sets the value of the tijdEVerstrekkingsvoorbehoudVoertuig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTijdEVerstrekkingsvoorbehoudVoertuig(String value) {
        this.tijdEVerstrekkingsvoorbehoudVoertuig = value;
    }

}
