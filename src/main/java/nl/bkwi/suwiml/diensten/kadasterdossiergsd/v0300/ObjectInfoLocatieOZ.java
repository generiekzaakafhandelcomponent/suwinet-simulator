
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="Postcd" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Postcd"/>
 *         <element name="Huisnr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAdresNederlandN5"/>
 *         <element name="Huisnrtoevoeging" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAdresNederlandAN6" minOccurs="0"/>
 *         <element name="Huisletter" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAdresNederlandAN1" minOccurs="0"/>
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
    "postcd",
    "huisnr",
    "huisnrtoevoeging",
    "huisletter"
})
@XmlRootElement(name = "ObjectInfoLocatieOZ")
public class ObjectInfoLocatieOZ {

    @XmlElement(name = "Postcd", required = true)
    protected String postcd;
    @XmlElement(name = "Huisnr", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger huisnr;
    @XmlElement(name = "Huisnrtoevoeging")
    protected String huisnrtoevoeging;
    @XmlElement(name = "Huisletter")
    protected String huisletter;

    /**
     * Gets the value of the postcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcd() {
        return postcd;
    }

    /**
     * Sets the value of the postcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcd(String value) {
        this.postcd = value;
    }

    /**
     * Gets the value of the huisnr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHuisnr() {
        return huisnr;
    }

    /**
     * Sets the value of the huisnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHuisnr(BigInteger value) {
        this.huisnr = value;
    }

    /**
     * Gets the value of the huisnrtoevoeging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuisnrtoevoeging() {
        return huisnrtoevoeging;
    }

    /**
     * Sets the value of the huisnrtoevoeging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuisnrtoevoeging(String value) {
        this.huisnrtoevoeging = value;
    }

    /**
     * Gets the value of the huisletter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuisletter() {
        return huisletter;
    }

    /**
     * Sets the value of the huisletter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuisletter(String value) {
        this.huisletter = value;
    }

}
