
package nl.bkwi.suwiml.diensten.duodossierpersoongsd.v0300;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InhoudVak complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InhoudVak">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OmsVak" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}OmschrijvingAN40"/>
 *         <element name="CdNiveauOpleidingDuo" type="{http://bkwi.nl/SuwiML/Diensten/DUODossierPersoonGSD/v0300}CdNiveauOpleidingDuo" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InhoudVak", propOrder = {
    "omsVak",
    "cdNiveauOpleidingDuo"
})
public class InhoudVak {

    @XmlElement(name = "OmsVak", required = true)
    protected String omsVak;
    @XmlElement(name = "CdNiveauOpleidingDuo")
    protected String cdNiveauOpleidingDuo;

    /**
     * Gets the value of the omsVak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmsVak() {
        return omsVak;
    }

    /**
     * Sets the value of the omsVak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmsVak(String value) {
        this.omsVak = value;
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

}
