
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gezagsverhouding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Gezagsverhouding">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdGezagMinderjarige" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdGezagMinderjarige" minOccurs="0"/>
 *         <element name="IndCuratelestelling" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}StdIndJN" minOccurs="0"/>
 *         <element name="OnderzoekGegGezag" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}OnderzoekGeg" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gezagsverhouding", propOrder = {
    "cdGezagMinderjarige",
    "indCuratelestelling",
    "onderzoekGegGezag"
})
public class Gezagsverhouding {

    @XmlElement(name = "CdGezagMinderjarige")
    protected String cdGezagMinderjarige;
    @XmlElement(name = "IndCuratelestelling")
    protected String indCuratelestelling;
    @XmlElement(name = "OnderzoekGegGezag")
    protected OnderzoekGeg onderzoekGegGezag;

    /**
     * Gets the value of the cdGezagMinderjarige property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGezagMinderjarige() {
        return cdGezagMinderjarige;
    }

    /**
     * Sets the value of the cdGezagMinderjarige property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGezagMinderjarige(String value) {
        this.cdGezagMinderjarige = value;
    }

    /**
     * Gets the value of the indCuratelestelling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCuratelestelling() {
        return indCuratelestelling;
    }

    /**
     * Sets the value of the indCuratelestelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCuratelestelling(String value) {
        this.indCuratelestelling = value;
    }

    /**
     * Gets the value of the onderzoekGegGezag property.
     * 
     * @return
     *     possible object is
     *     {@link OnderzoekGeg }
     *     
     */
    public OnderzoekGeg getOnderzoekGegGezag() {
        return onderzoekGegGezag;
    }

    /**
     * Sets the value of the onderzoekGegGezag property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnderzoekGeg }
     *     
     */
    public void setOnderzoekGegGezag(OnderzoekGeg value) {
        this.onderzoekGegGezag = value;
    }

}
