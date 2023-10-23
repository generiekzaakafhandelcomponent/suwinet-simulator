
package nl.bkwi.suwiml.diensten.duodossierpersoongsd.v0300;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InhoudOpleidingDuo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InhoudOpleidingDuo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NaamOpleidingKortDuo" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN40" minOccurs="0"/>
 *         <element name="CdNiveauOpleidingDuo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdNiveauOpleidingDuo" minOccurs="0"/>
 *         <element name="OmsStudiegebied" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN40" minOccurs="0"/>
 *         <element name="OmsStudieinhoud" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN160" minOccurs="0"/>
 *         <element name="OmsStudieuitstroom" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN160" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InhoudOpleidingDuo", propOrder = {
    "naamOpleidingKortDuo",
    "cdNiveauOpleidingDuo",
    "omsStudiegebied",
    "omsStudieinhoud",
    "omsStudieuitstroom"
})
public class InhoudOpleidingDuo {

    @XmlElement(name = "NaamOpleidingKortDuo")
    protected String naamOpleidingKortDuo;
    @XmlElement(name = "CdNiveauOpleidingDuo")
    protected String cdNiveauOpleidingDuo;
    @XmlElement(name = "OmsStudiegebied")
    protected String omsStudiegebied;
    @XmlElement(name = "OmsStudieinhoud")
    protected String omsStudieinhoud;
    @XmlElement(name = "OmsStudieuitstroom")
    protected String omsStudieuitstroom;

    /**
     * Gets the value of the naamOpleidingKortDuo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaamOpleidingKortDuo() {
        return naamOpleidingKortDuo;
    }

    /**
     * Sets the value of the naamOpleidingKortDuo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaamOpleidingKortDuo(String value) {
        this.naamOpleidingKortDuo = value;
    }

    /**
     * Gets the value of the cdNiveauOpleidingDuo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdNiveauOpleidingDuo() {
        return cdNiveauOpleidingDuo;
    }

    /**
     * Sets the value of the cdNiveauOpleidingDuo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdNiveauOpleidingDuo(String value) {
        this.cdNiveauOpleidingDuo = value;
    }

    /**
     * Gets the value of the omsStudiegebied property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmsStudiegebied() {
        return omsStudiegebied;
    }

    /**
     * Sets the value of the omsStudiegebied property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmsStudiegebied(String value) {
        this.omsStudiegebied = value;
    }

    /**
     * Gets the value of the omsStudieinhoud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmsStudieinhoud() {
        return omsStudieinhoud;
    }

    /**
     * Sets the value of the omsStudieinhoud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmsStudieinhoud(String value) {
        this.omsStudieinhoud = value;
    }

    /**
     * Gets the value of the omsStudieuitstroom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmsStudieuitstroom() {
        return omsStudieuitstroom;
    }

    /**
     * Sets the value of the omsStudieuitstroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmsStudieuitstroom(String value) {
        this.omsStudieuitstroom = value;
    }

}
