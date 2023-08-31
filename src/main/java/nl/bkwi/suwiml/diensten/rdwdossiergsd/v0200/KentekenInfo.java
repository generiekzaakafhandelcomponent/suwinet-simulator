
package nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200;

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
 *         <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6"/>
 *         <sequence minOccurs="0">
 *           <element name="PeildatAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *           <element name="PeiltijdAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Tijdstip"/>
 *         </sequence>
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
    "kentekenVoertuig",
    "peildatAansprakelijkheid",
    "peiltijdAansprakelijkheid"
})
@XmlRootElement(name = "KentekenInfo")
public class KentekenInfo {

    @XmlElement(name = "KentekenVoertuig", required = true)
    protected String kentekenVoertuig;
    @XmlElement(name = "PeildatAansprakelijkheid")
    protected String peildatAansprakelijkheid;
    @XmlElement(name = "PeiltijdAansprakelijkheid")
    protected String peiltijdAansprakelijkheid;

    /**
     * Gets the value of the kentekenVoertuig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKentekenVoertuig() {
        return kentekenVoertuig;
    }

    /**
     * Sets the value of the kentekenVoertuig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKentekenVoertuig(String value) {
        this.kentekenVoertuig = value;
    }

    /**
     * Gets the value of the peildatAansprakelijkheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeildatAansprakelijkheid() {
        return peildatAansprakelijkheid;
    }

    /**
     * Sets the value of the peildatAansprakelijkheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeildatAansprakelijkheid(String value) {
        this.peildatAansprakelijkheid = value;
    }

    /**
     * Gets the value of the peiltijdAansprakelijkheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeiltijdAansprakelijkheid() {
        return peiltijdAansprakelijkheid;
    }

    /**
     * Sets the value of the peiltijdAansprakelijkheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeiltijdAansprakelijkheid(String value) {
        this.peiltijdAansprakelijkheid = value;
    }

}
