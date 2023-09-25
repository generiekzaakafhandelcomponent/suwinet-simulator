
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnderzoekGeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OnderzoekGeg">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AanduidingOnderzoek" type="{http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200}AanduidingOnderzoek" minOccurs="0"/>
 *         <element name="DatBOnderzoek" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="DatEOnderzoek" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnderzoekGeg", propOrder = {
    "aanduidingOnderzoek",
    "datBOnderzoek",
    "datEOnderzoek"
})
public class OnderzoekGeg {

    @XmlElement(name = "AanduidingOnderzoek")
    protected String aanduidingOnderzoek;
    @XmlElement(name = "DatBOnderzoek")
    protected String datBOnderzoek;
    @XmlElement(name = "DatEOnderzoek")
    protected String datEOnderzoek;

    /**
     * Gets the value of the aanduidingOnderzoek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAanduidingOnderzoek() {
        return aanduidingOnderzoek;
    }

    /**
     * Sets the value of the aanduidingOnderzoek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAanduidingOnderzoek(String value) {
        this.aanduidingOnderzoek = value;
    }

    /**
     * Gets the value of the datBOnderzoek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatBOnderzoek() {
        return datBOnderzoek;
    }

    /**
     * Sets the value of the datBOnderzoek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatBOnderzoek(String value) {
        this.datBOnderzoek = value;
    }

    /**
     * Gets the value of the datEOnderzoek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatEOnderzoek() {
        return datEOnderzoek;
    }

    /**
     * Sets the value of the datEOnderzoek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatEOnderzoek(String value) {
        this.datEOnderzoek = value;
    }

}
