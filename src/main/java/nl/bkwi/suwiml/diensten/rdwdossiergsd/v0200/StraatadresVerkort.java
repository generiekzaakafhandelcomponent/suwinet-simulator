
package nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Straatadres_verkort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Straatadres_verkort">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Postcd" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Postcd" minOccurs="0"/>
 *         <element name="Woonplaatsnaam" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}NaamAdresNederlandAN80" minOccurs="0"/>
 *         <element name="Straatnaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN24" minOccurs="0"/>
 *         <element name="Huisnr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAdresNederlandN5" minOccurs="0"/>
 *         <element name="Huisnrtoevoeging" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAdresNederlandAN6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Straatadres_verkort", propOrder = {
    "postcd",
    "woonplaatsnaam",
    "straatnaam",
    "huisnr",
    "huisnrtoevoeging"
})
public class StraatadresVerkort {

    @XmlElement(name = "Postcd")
    protected String postcd;
    @XmlElement(name = "Woonplaatsnaam")
    protected String woonplaatsnaam;
    @XmlElement(name = "Straatnaam")
    protected String straatnaam;
    @XmlElement(name = "Huisnr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger huisnr;
    @XmlElement(name = "Huisnrtoevoeging")
    protected String huisnrtoevoeging;

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
     * Gets the value of the woonplaatsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoonplaatsnaam() {
        return woonplaatsnaam;
    }

    /**
     * Sets the value of the woonplaatsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoonplaatsnaam(String value) {
        this.woonplaatsnaam = value;
    }

    /**
     * Gets the value of the straatnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStraatnaam() {
        return straatnaam;
    }

    /**
     * Sets the value of the straatnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStraatnaam(String value) {
        this.straatnaam = value;
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
     * Gets the value of the huisnrtoevoeging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuisnrtoevoeging() {
        return huisnrtoevoeging;
    }

    /**
     * Sets the value of the huisnrtoevoeging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuisnrtoevoeging(String value) {
        this.huisnrtoevoeging = value;
    }

}
