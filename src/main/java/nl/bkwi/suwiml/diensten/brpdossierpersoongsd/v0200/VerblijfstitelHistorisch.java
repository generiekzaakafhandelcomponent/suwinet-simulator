
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerblijfstitelHistorisch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VerblijfstitelHistorisch">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdVerblijfstitel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdVerblijfstitel" minOccurs="0"/>
 *         <element name="DatBVerblijfstitel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="DatEVerblijfstitel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="OnderzoekGegVerblijfstitel" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnderzoekGeg" minOccurs="0"/>
 *         <element name="OnjuistGegVerblijfstitel" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnjuistGeg" minOccurs="0"/>
 *         <element name="GeldigheidGegevensVerblijfstitel" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Geldigheid" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerblijfstitelHistorisch", propOrder = {
    "cdVerblijfstitel",
    "datBVerblijfstitel",
    "datEVerblijfstitel",
    "onderzoekGegVerblijfstitel",
    "onjuistGegVerblijfstitel",
    "geldigheidGegevensVerblijfstitel"
})
public class VerblijfstitelHistorisch {

    @XmlElement(name = "CdVerblijfstitel")
    protected String cdVerblijfstitel;
    @XmlElement(name = "DatBVerblijfstitel")
    protected String datBVerblijfstitel;
    @XmlElement(name = "DatEVerblijfstitel")
    protected String datEVerblijfstitel;
    @XmlElement(name = "OnderzoekGegVerblijfstitel")
    protected OnderzoekGeg onderzoekGegVerblijfstitel;
    @XmlElement(name = "OnjuistGegVerblijfstitel")
    protected OnjuistGeg onjuistGegVerblijfstitel;
    @XmlElement(name = "GeldigheidGegevensVerblijfstitel")
    protected Geldigheid geldigheidGegevensVerblijfstitel;

    /**
     * Gets the value of the cdVerblijfstitel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVerblijfstitel() {
        return cdVerblijfstitel;
    }

    /**
     * Sets the value of the cdVerblijfstitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVerblijfstitel(String value) {
        this.cdVerblijfstitel = value;
    }

    /**
     * Gets the value of the datBVerblijfstitel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatBVerblijfstitel() {
        return datBVerblijfstitel;
    }

    /**
     * Sets the value of the datBVerblijfstitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatBVerblijfstitel(String value) {
        this.datBVerblijfstitel = value;
    }

    /**
     * Gets the value of the datEVerblijfstitel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatEVerblijfstitel() {
        return datEVerblijfstitel;
    }

    /**
     * Sets the value of the datEVerblijfstitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatEVerblijfstitel(String value) {
        this.datEVerblijfstitel = value;
    }

    /**
     * Gets the value of the onderzoekGegVerblijfstitel property.
     * 
     * @return
     *     possible object is
     *     {@link OnderzoekGeg }
     *     
     */
    public OnderzoekGeg getOnderzoekGegVerblijfstitel() {
        return onderzoekGegVerblijfstitel;
    }

    /**
     * Sets the value of the onderzoekGegVerblijfstitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnderzoekGeg }
     *     
     */
    public void setOnderzoekGegVerblijfstitel(OnderzoekGeg value) {
        this.onderzoekGegVerblijfstitel = value;
    }

    /**
     * Gets the value of the onjuistGegVerblijfstitel property.
     * 
     * @return
     *     possible object is
     *     {@link OnjuistGeg }
     *     
     */
    public OnjuistGeg getOnjuistGegVerblijfstitel() {
        return onjuistGegVerblijfstitel;
    }

    /**
     * Sets the value of the onjuistGegVerblijfstitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnjuistGeg }
     *     
     */
    public void setOnjuistGegVerblijfstitel(OnjuistGeg value) {
        this.onjuistGegVerblijfstitel = value;
    }

    /**
     * Gets the value of the geldigheidGegevensVerblijfstitel property.
     * 
     * @return
     *     possible object is
     *     {@link Geldigheid }
     *     
     */
    public Geldigheid getGeldigheidGegevensVerblijfstitel() {
        return geldigheidGegevensVerblijfstitel;
    }

    /**
     * Sets the value of the geldigheidGegevensVerblijfstitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geldigheid }
     *     
     */
    public void setGeldigheidGegevensVerblijfstitel(Geldigheid value) {
        this.geldigheidGegevensVerblijfstitel = value;
    }

}
