
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Nationaliteit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Nationaliteit">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdNationaliteit" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdNationaliteit" minOccurs="0"/>
 *         <element name="OnderzoekGegNationaliteit" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnderzoekGeg" minOccurs="0"/>
 *         <element name="CdBijzonderNederlanderschap" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdBijzonderNederlanderschap" minOccurs="0"/>
 *         <element name="GeldigheidGegevensNationaliteit" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}Geldigheid" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nationaliteit", propOrder = {
    "cdNationaliteit",
    "onderzoekGegNationaliteit",
    "cdBijzonderNederlanderschap",
    "geldigheidGegevensNationaliteit"
})
public class Nationaliteit {

    @XmlElement(name = "CdNationaliteit")
    protected String cdNationaliteit;
    @XmlElement(name = "OnderzoekGegNationaliteit")
    protected OnderzoekGeg onderzoekGegNationaliteit;
    @XmlElement(name = "CdBijzonderNederlanderschap")
    protected String cdBijzonderNederlanderschap;
    @XmlElement(name = "GeldigheidGegevensNationaliteit")
    protected Geldigheid geldigheidGegevensNationaliteit;

    /**
     * Gets the value of the cdNationaliteit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdNationaliteit() {
        return cdNationaliteit;
    }

    /**
     * Sets the value of the cdNationaliteit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdNationaliteit(String value) {
        this.cdNationaliteit = value;
    }

    /**
     * Gets the value of the onderzoekGegNationaliteit property.
     * 
     * @return
     *     possible object is
     *     {@link OnderzoekGeg }
     *     
     */
    public OnderzoekGeg getOnderzoekGegNationaliteit() {
        return onderzoekGegNationaliteit;
    }

    /**
     * Sets the value of the onderzoekGegNationaliteit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnderzoekGeg }
     *     
     */
    public void setOnderzoekGegNationaliteit(OnderzoekGeg value) {
        this.onderzoekGegNationaliteit = value;
    }

    /**
     * Gets the value of the cdBijzonderNederlanderschap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdBijzonderNederlanderschap() {
        return cdBijzonderNederlanderschap;
    }

    /**
     * Sets the value of the cdBijzonderNederlanderschap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdBijzonderNederlanderschap(String value) {
        this.cdBijzonderNederlanderschap = value;
    }

    /**
     * Gets the value of the geldigheidGegevensNationaliteit property.
     * 
     * @return
     *     possible object is
     *     {@link Geldigheid }
     *     
     */
    public Geldigheid getGeldigheidGegevensNationaliteit() {
        return geldigheidGegevensNationaliteit;
    }

    /**
     * Sets the value of the geldigheidGegevensNationaliteit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geldigheid }
     *     
     */
    public void setGeldigheidGegevensNationaliteit(Geldigheid value) {
        this.geldigheidGegevensNationaliteit = value;
    }

}
