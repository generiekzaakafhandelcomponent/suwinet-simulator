
package nl.bkwi.suwiml.diensten.uwvdossierinkomstengsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StraatadresBuitenland complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StraatadresBuitenland">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LocatieomsBuitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresBuitenlandAN70" minOccurs="0"/>
 *         <element name="PostcdBuitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAdresBuitenlandAN9" minOccurs="0"/>
 *         <element name="WoonplaatsnaamBuitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresBuitenlandAN40" minOccurs="0"/>
 *         <element name="RegionaamBuitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresBuitenlandAN24" minOccurs="0"/>
 *         <element name="LandencdIso" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}LandenCdIsoA2" minOccurs="0"/>
 *         <element name="Landsnaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresBuitenlandAN40" minOccurs="0"/>
 *         <element name="StraatnaamBuitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresBuitenlandAN24" minOccurs="0"/>
 *         <element name="HuisnrBuitenland" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAdresBuitenlandAN9" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StraatadresBuitenland", propOrder = {
    "locatieomsBuitenland",
    "postcdBuitenland",
    "woonplaatsnaamBuitenland",
    "regionaamBuitenland",
    "landencdIso",
    "landsnaam",
    "straatnaamBuitenland",
    "huisnrBuitenland"
})
public class StraatadresBuitenland {

    @XmlElement(name = "LocatieomsBuitenland")
    protected String locatieomsBuitenland;
    @XmlElement(name = "PostcdBuitenland")
    protected String postcdBuitenland;
    @XmlElement(name = "WoonplaatsnaamBuitenland")
    protected String woonplaatsnaamBuitenland;
    @XmlElement(name = "RegionaamBuitenland")
    protected String regionaamBuitenland;
    @XmlElement(name = "LandencdIso")
    protected String landencdIso;
    @XmlElement(name = "Landsnaam")
    protected String landsnaam;
    @XmlElement(name = "StraatnaamBuitenland")
    protected String straatnaamBuitenland;
    @XmlElement(name = "HuisnrBuitenland")
    protected String huisnrBuitenland;

    /**
     * Gets the value of the locatieomsBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocatieomsBuitenland() {
        return locatieomsBuitenland;
    }

    /**
     * Sets the value of the locatieomsBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocatieomsBuitenland(String value) {
        this.locatieomsBuitenland = value;
    }

    /**
     * Gets the value of the postcdBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcdBuitenland() {
        return postcdBuitenland;
    }

    /**
     * Sets the value of the postcdBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcdBuitenland(String value) {
        this.postcdBuitenland = value;
    }

    /**
     * Gets the value of the woonplaatsnaamBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoonplaatsnaamBuitenland() {
        return woonplaatsnaamBuitenland;
    }

    /**
     * Sets the value of the woonplaatsnaamBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoonplaatsnaamBuitenland(String value) {
        this.woonplaatsnaamBuitenland = value;
    }

    /**
     * Gets the value of the regionaamBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionaamBuitenland() {
        return regionaamBuitenland;
    }

    /**
     * Sets the value of the regionaamBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionaamBuitenland(String value) {
        this.regionaamBuitenland = value;
    }

    /**
     * Gets the value of the landencdIso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandencdIso() {
        return landencdIso;
    }

    /**
     * Sets the value of the landencdIso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandencdIso(String value) {
        this.landencdIso = value;
    }

    /**
     * Gets the value of the landsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandsnaam() {
        return landsnaam;
    }

    /**
     * Sets the value of the landsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandsnaam(String value) {
        this.landsnaam = value;
    }

    /**
     * Gets the value of the straatnaamBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStraatnaamBuitenland() {
        return straatnaamBuitenland;
    }

    /**
     * Sets the value of the straatnaamBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStraatnaamBuitenland(String value) {
        this.straatnaamBuitenland = value;
    }

    /**
     * Gets the value of the huisnrBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuisnrBuitenland() {
        return huisnrBuitenland;
    }

    /**
     * Sets the value of the huisnrBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuisnrBuitenland(String value) {
        this.huisnrBuitenland = value;
    }

}
