
package nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <sequence>
 *             <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr"/>
 *           </sequence>
 *           <sequence>
 *             <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *             <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200"/>
 *             <element name="Voorletters" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorletters"/>
 *           </sequence>
 *           <sequence>
 *             <element name="Postcd" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Postcd"/>
 *             <element name="Huisnr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAdresNederlandN5"/>
 *           </sequence>
 *         </choice>
 *         <sequence>
 *           <element name="DatBPeilperiodeAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *           <element name="DatEPeilperiodeAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "burgerservicenr",
    "geboortedat",
    "significantDeelVanDeAchternaam",
    "voorletters",
    "postcd",
    "huisnr",
    "datBPeilperiodeAansprakelijkheid",
    "datEPeilperiodeAansprakelijkheid"
})
@XmlRootElement(name = "VoertuigbezitInfoPersoon")
public class VoertuigbezitInfoPersoon {

    @XmlElement(name = "Burgerservicenr")
    protected String burgerservicenr;
    @XmlElement(name = "Geboortedat")
    protected String geboortedat;
    @XmlElement(name = "SignificantDeelVanDeAchternaam")
    protected String significantDeelVanDeAchternaam;
    @XmlElement(name = "Voorletters")
    protected String voorletters;
    @XmlElement(name = "Postcd")
    protected String postcd;
    @XmlElement(name = "Huisnr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger huisnr;
    @XmlElement(name = "DatBPeilperiodeAansprakelijkheid", required = true)
    protected String datBPeilperiodeAansprakelijkheid;
    @XmlElement(name = "DatEPeilperiodeAansprakelijkheid")
    protected String datEPeilperiodeAansprakelijkheid;

    /**
     * Gets the value of the burgerservicenr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBurgerservicenr() {
        return burgerservicenr;
    }

    /**
     * Sets the value of the burgerservicenr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBurgerservicenr(String value) {
        this.burgerservicenr = value;
    }

    /**
     * Gets the value of the geboortedat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeboortedat() {
        return geboortedat;
    }

    /**
     * Sets the value of the geboortedat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeboortedat(String value) {
        this.geboortedat = value;
    }

    /**
     * Gets the value of the significantDeelVanDeAchternaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignificantDeelVanDeAchternaam() {
        return significantDeelVanDeAchternaam;
    }

    /**
     * Sets the value of the significantDeelVanDeAchternaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignificantDeelVanDeAchternaam(String value) {
        this.significantDeelVanDeAchternaam = value;
    }

    /**
     * Gets the value of the voorletters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoorletters() {
        return voorletters;
    }

    /**
     * Sets the value of the voorletters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoorletters(String value) {
        this.voorletters = value;
    }

    /**
     * Gets the value of the postcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcd() {
        return postcd;
    }

    /**
     * Sets the value of the postcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcd(String value) {
        this.postcd = value;
    }

    /**
     * Gets the value of the huisnr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHuisnr() {
        return huisnr;
    }

    /**
     * Sets the value of the huisnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHuisnr(BigInteger value) {
        this.huisnr = value;
    }

    /**
     * Gets the value of the datBPeilperiodeAansprakelijkheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatBPeilperiodeAansprakelijkheid() {
        return datBPeilperiodeAansprakelijkheid;
    }

    /**
     * Sets the value of the datBPeilperiodeAansprakelijkheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatBPeilperiodeAansprakelijkheid(String value) {
        this.datBPeilperiodeAansprakelijkheid = value;
    }

    /**
     * Gets the value of the datEPeilperiodeAansprakelijkheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatEPeilperiodeAansprakelijkheid() {
        return datEPeilperiodeAansprakelijkheid;
    }

    /**
     * Sets the value of the datEPeilperiodeAansprakelijkheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatEPeilperiodeAansprakelijkheid(String value) {
        this.datEPeilperiodeAansprakelijkheid = value;
    }

}
