
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InschrijvingsgegevensBrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InschrijvingsgegevensBrp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatOpschortingBijhoudingPl" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="CdRedenOpschortingBijhoudingPl" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}CdRedenOpschortingBijhoudingPl" minOccurs="0"/>
 *         <element name="CdGemeenteWaarPkZichBevindt" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdGemeenteGba" minOccurs="0"/>
 *         <element name="VerificatieRni" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}VerificatieRni" minOccurs="0"/>
 *         <element name="CdPkVolledigGeconverteerd" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdPkVolledigGeconverteerd" minOccurs="0"/>
 *         <element name="RniDeelnemer" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}RniDeelnemer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InschrijvingsgegevensBrp", propOrder = {
    "datOpschortingBijhoudingPl",
    "cdRedenOpschortingBijhoudingPl",
    "cdGemeenteWaarPkZichBevindt",
    "verificatieRni",
    "cdPkVolledigGeconverteerd",
    "rniDeelnemer"
})
public class InschrijvingsgegevensBrp {

    @XmlElement(name = "DatOpschortingBijhoudingPl")
    protected String datOpschortingBijhoudingPl;
    @XmlElement(name = "CdRedenOpschortingBijhoudingPl")
    protected String cdRedenOpschortingBijhoudingPl;
    @XmlElement(name = "CdGemeenteWaarPkZichBevindt")
    protected String cdGemeenteWaarPkZichBevindt;
    @XmlElement(name = "VerificatieRni")
    protected VerificatieRni verificatieRni;
    @XmlElement(name = "CdPkVolledigGeconverteerd")
    protected String cdPkVolledigGeconverteerd;
    @XmlElement(name = "RniDeelnemer")
    protected RniDeelnemer rniDeelnemer;

    /**
     * Gets the value of the datOpschortingBijhoudingPl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatOpschortingBijhoudingPl() {
        return datOpschortingBijhoudingPl;
    }

    /**
     * Sets the value of the datOpschortingBijhoudingPl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatOpschortingBijhoudingPl(String value) {
        this.datOpschortingBijhoudingPl = value;
    }

    /**
     * Gets the value of the cdRedenOpschortingBijhoudingPl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdRedenOpschortingBijhoudingPl() {
        return cdRedenOpschortingBijhoudingPl;
    }

    /**
     * Sets the value of the cdRedenOpschortingBijhoudingPl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdRedenOpschortingBijhoudingPl(String value) {
        this.cdRedenOpschortingBijhoudingPl = value;
    }

    /**
     * Gets the value of the cdGemeenteWaarPkZichBevindt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGemeenteWaarPkZichBevindt() {
        return cdGemeenteWaarPkZichBevindt;
    }

    /**
     * Sets the value of the cdGemeenteWaarPkZichBevindt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGemeenteWaarPkZichBevindt(String value) {
        this.cdGemeenteWaarPkZichBevindt = value;
    }

    /**
     * Gets the value of the verificatieRni property.
     * 
     * @return
     *     possible object is
     *     {@link VerificatieRni }
     *     
     */
    public VerificatieRni getVerificatieRni() {
        return verificatieRni;
    }

    /**
     * Sets the value of the verificatieRni property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificatieRni }
     *     
     */
    public void setVerificatieRni(VerificatieRni value) {
        this.verificatieRni = value;
    }

    /**
     * Gets the value of the cdPkVolledigGeconverteerd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPkVolledigGeconverteerd() {
        return cdPkVolledigGeconverteerd;
    }

    /**
     * Sets the value of the cdPkVolledigGeconverteerd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPkVolledigGeconverteerd(String value) {
        this.cdPkVolledigGeconverteerd = value;
    }

    /**
     * Gets the value of the rniDeelnemer property.
     * 
     * @return
     *     possible object is
     *     {@link RniDeelnemer }
     *     
     */
    public RniDeelnemer getRniDeelnemer() {
        return rniDeelnemer;
    }

    /**
     * Sets the value of the rniDeelnemer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RniDeelnemer }
     *     
     */
    public void setRniDeelnemer(RniDeelnemer value) {
        this.rniDeelnemer = value;
    }

}
