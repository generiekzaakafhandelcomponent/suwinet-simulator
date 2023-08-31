
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
 *         <sequence>
 *           <element name="InschrijvingsnrKvK" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}InschrijvingsnrKvK"/>
 *           <element name="VestigingsnrHandelsregister" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}VestigingsnrHandelsregister" minOccurs="0"/>
 *         </sequence>
 *         <sequence>
 *           <element name="DatBPeilperiodeAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *           <element name="DatEPeilperiodeAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
    "inschrijvingsnrKvK",
    "vestigingsnrHandelsregister",
    "datBPeilperiodeAansprakelijkheid",
    "datEPeilperiodeAansprakelijkheid"
})
@XmlRootElement(name = "VoertuigbezitInfoOrg")
public class VoertuigbezitInfoOrg {

    @XmlElement(name = "InschrijvingsnrKvK", required = true)
    protected String inschrijvingsnrKvK;
    @XmlElement(name = "VestigingsnrHandelsregister")
    protected String vestigingsnrHandelsregister;
    @XmlElement(name = "DatBPeilperiodeAansprakelijkheid", required = true)
    protected String datBPeilperiodeAansprakelijkheid;
    @XmlElement(name = "DatEPeilperiodeAansprakelijkheid")
    protected String datEPeilperiodeAansprakelijkheid;

    /**
     * Gets the value of the inschrijvingsnrKvK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInschrijvingsnrKvK() {
        return inschrijvingsnrKvK;
    }

    /**
     * Sets the value of the inschrijvingsnrKvK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInschrijvingsnrKvK(String value) {
        this.inschrijvingsnrKvK = value;
    }

    /**
     * Gets the value of the vestigingsnrHandelsregister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVestigingsnrHandelsregister() {
        return vestigingsnrHandelsregister;
    }

    /**
     * Sets the value of the vestigingsnrHandelsregister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVestigingsnrHandelsregister(String value) {
        this.vestigingsnrHandelsregister = value;
    }

    /**
     * Gets the value of the datBPeilperiodeAansprakelijkheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatBPeilperiodeAansprakelijkheid() {
        return datBPeilperiodeAansprakelijkheid;
    }

    /**
     * Sets the value of the datBPeilperiodeAansprakelijkheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatBPeilperiodeAansprakelijkheid(String value) {
        this.datBPeilperiodeAansprakelijkheid = value;
    }

    /**
     * Gets the value of the datEPeilperiodeAansprakelijkheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatEPeilperiodeAansprakelijkheid() {
        return datEPeilperiodeAansprakelijkheid;
    }

    /**
     * Sets the value of the datEPeilperiodeAansprakelijkheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatEPeilperiodeAansprakelijkheid(String value) {
        this.datEPeilperiodeAansprakelijkheid = value;
    }

}
