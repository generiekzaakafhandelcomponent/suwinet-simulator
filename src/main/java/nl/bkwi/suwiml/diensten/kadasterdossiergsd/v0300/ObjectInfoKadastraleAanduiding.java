
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="CdKadastraleGemeente" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdKadastraleGemeente"/>
 *         <element name="KadastraleGemeentenaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN40"/>
 *         <element name="KadastraleSectie" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}KadastraleSectie"/>
 *         <element name="KadastraalPerceelnr" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}KadastraalPerceelnr"/>
 *         <element name="VolgnrKadastraalAppartementsrecht" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}VolgnrKadAppartementsrecht" minOccurs="0"/>
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
    "cdKadastraleGemeente",
    "kadastraleGemeentenaam",
    "kadastraleSectie",
    "kadastraalPerceelnr",
    "volgnrKadastraalAppartementsrecht"
})
@XmlRootElement(name = "ObjectInfoKadastraleAanduiding")
public class ObjectInfoKadastraleAanduiding {

    @XmlElement(name = "CdKadastraleGemeente", required = true)
    protected String cdKadastraleGemeente;
    @XmlElement(name = "KadastraleGemeentenaam", required = true)
    protected String kadastraleGemeentenaam;
    @XmlElement(name = "KadastraleSectie", required = true)
    protected String kadastraleSectie;
    @XmlElement(name = "KadastraalPerceelnr", required = true)
    protected BigInteger kadastraalPerceelnr;
    @XmlElement(name = "VolgnrKadastraalAppartementsrecht")
    protected BigInteger volgnrKadastraalAppartementsrecht;

    /**
     * Gets the value of the cdKadastraleGemeente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdKadastraleGemeente() {
        return cdKadastraleGemeente;
    }

    /**
     * Sets the value of the cdKadastraleGemeente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdKadastraleGemeente(String value) {
        this.cdKadastraleGemeente = value;
    }

    /**
     * Gets the value of the kadastraleGemeentenaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKadastraleGemeentenaam() {
        return kadastraleGemeentenaam;
    }

    /**
     * Sets the value of the kadastraleGemeentenaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKadastraleGemeentenaam(String value) {
        this.kadastraleGemeentenaam = value;
    }

    /**
     * Gets the value of the kadastraleSectie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKadastraleSectie() {
        return kadastraleSectie;
    }

    /**
     * Sets the value of the kadastraleSectie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKadastraleSectie(String value) {
        this.kadastraleSectie = value;
    }

    /**
     * Gets the value of the kadastraalPerceelnr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKadastraalPerceelnr() {
        return kadastraalPerceelnr;
    }

    /**
     * Sets the value of the kadastraalPerceelnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKadastraalPerceelnr(BigInteger value) {
        this.kadastraalPerceelnr = value;
    }

    /**
     * Gets the value of the volgnrKadastraalAppartementsrecht property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVolgnrKadastraalAppartementsrecht() {
        return volgnrKadastraalAppartementsrecht;
    }

    /**
     * Sets the value of the volgnrKadastraalAppartementsrecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVolgnrKadastraalAppartementsrecht(BigInteger value) {
        this.volgnrKadastraalAppartementsrecht = value;
    }

}
