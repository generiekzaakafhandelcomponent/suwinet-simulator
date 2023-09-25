
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HuwelijkHistorisch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HuwelijkHistorisch">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatHuwelijkssluiting" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="OnderzoekGegHuwelijk" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnderzoekGeg" minOccurs="0"/>
 *         <element name="OnjuistGegHuwelijk" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnjuistGeg" minOccurs="0"/>
 *         <element name="Partner" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}PartnerHistorisch" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HuwelijkHistorisch", propOrder = {
    "datHuwelijkssluiting",
    "onderzoekGegHuwelijk",
    "onjuistGegHuwelijk",
    "partner"
})
public class HuwelijkHistorisch {

    @XmlElement(name = "DatHuwelijkssluiting")
    protected String datHuwelijkssluiting;
    @XmlElement(name = "OnderzoekGegHuwelijk")
    protected OnderzoekGeg onderzoekGegHuwelijk;
    @XmlElement(name = "OnjuistGegHuwelijk")
    protected OnjuistGeg onjuistGegHuwelijk;
    @XmlElement(name = "Partner")
    protected PartnerHistorisch partner;

    /**
     * Gets the value of the datHuwelijkssluiting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatHuwelijkssluiting() {
        return datHuwelijkssluiting;
    }

    /**
     * Sets the value of the datHuwelijkssluiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatHuwelijkssluiting(String value) {
        this.datHuwelijkssluiting = value;
    }

    /**
     * Gets the value of the onderzoekGegHuwelijk property.
     * 
     * @return
     *     possible object is
     *     {@link OnderzoekGeg }
     *     
     */
    public OnderzoekGeg getOnderzoekGegHuwelijk() {
        return onderzoekGegHuwelijk;
    }

    /**
     * Sets the value of the onderzoekGegHuwelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnderzoekGeg }
     *     
     */
    public void setOnderzoekGegHuwelijk(OnderzoekGeg value) {
        this.onderzoekGegHuwelijk = value;
    }

    /**
     * Gets the value of the onjuistGegHuwelijk property.
     * 
     * @return
     *     possible object is
     *     {@link OnjuistGeg }
     *     
     */
    public OnjuistGeg getOnjuistGegHuwelijk() {
        return onjuistGegHuwelijk;
    }

    /**
     * Sets the value of the onjuistGegHuwelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnjuistGeg }
     *     
     */
    public void setOnjuistGegHuwelijk(OnjuistGeg value) {
        this.onjuistGegHuwelijk = value;
    }

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerHistorisch }
     *     
     */
    public PartnerHistorisch getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerHistorisch }
     *     
     */
    public void setPartner(PartnerHistorisch value) {
        this.partner = value;
    }

}
