
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rechtspersoon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Rechtspersoon">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FiNr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr" minOccurs="0"/>
 *         <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200" minOccurs="0"/>
 *         <element name="OmsRechtsvorm" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}OmsRechtsvorm" minOccurs="0"/>
 *         <element name="OmsStatutaireZetel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN24" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rechtspersoon", propOrder = {
    "fiNr",
    "naamRechtspersoon",
    "omsRechtsvorm",
    "omsStatutaireZetel"
})
public class Rechtspersoon {

    @XmlElement(name = "FiNr")
    protected String fiNr;
    @XmlElement(name = "NaamRechtspersoon")
    protected String naamRechtspersoon;
    @XmlElement(name = "OmsRechtsvorm")
    protected String omsRechtsvorm;
    @XmlElement(name = "OmsStatutaireZetel")
    protected String omsStatutaireZetel;

    /**
     * Gets the value of the fiNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiNr() {
        return fiNr;
    }

    /**
     * Sets the value of the fiNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiNr(String value) {
        this.fiNr = value;
    }

    /**
     * Gets the value of the naamRechtspersoon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaamRechtspersoon() {
        return naamRechtspersoon;
    }

    /**
     * Sets the value of the naamRechtspersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaamRechtspersoon(String value) {
        this.naamRechtspersoon = value;
    }

    /**
     * Gets the value of the omsRechtsvorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmsRechtsvorm() {
        return omsRechtsvorm;
    }

    /**
     * Sets the value of the omsRechtsvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmsRechtsvorm(String value) {
        this.omsRechtsvorm = value;
    }

    /**
     * Gets the value of the omsStatutaireZetel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmsStatutaireZetel() {
        return omsStatutaireZetel;
    }

    /**
     * Sets the value of the omsStatutaireZetel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmsStatutaireZetel(String value) {
        this.omsStatutaireZetel = value;
    }

}
