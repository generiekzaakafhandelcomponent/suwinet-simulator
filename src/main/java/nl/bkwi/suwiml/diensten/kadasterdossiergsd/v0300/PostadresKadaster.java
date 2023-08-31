
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostadresKadaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PostadresKadaster">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="StraatadresBag" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}StraatadresBag"/>
 *         <element name="Postbusadres">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Locatieoms" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN70" minOccurs="0"/>
 *                   <element name="Postcd" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Postcd" minOccurs="0"/>
 *                   <element name="Woonplaatsnaam" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}NaamAdresNederlandAN80" minOccurs="0"/>
 *                   <element name="Gemeentenaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN40" minOccurs="0"/>
 *                   <element name="Postbusnr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAdresNederlandN5" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="GeneriekAdresBuitenland" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}GeneriekAdresBuitenland"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostadresKadaster", propOrder = {
    "straatadresBag",
    "postbusadres",
    "generiekAdresBuitenland"
})
public class PostadresKadaster {

    @XmlElement(name = "StraatadresBag")
    protected StraatadresBag straatadresBag;
    @XmlElement(name = "Postbusadres")
    protected PostadresKadaster.Postbusadres postbusadres;
    @XmlElement(name = "GeneriekAdresBuitenland")
    protected GeneriekAdresBuitenland generiekAdresBuitenland;

    /**
     * Gets the value of the straatadresBag property.
     * 
     * @return
     *     possible object is
     *     {@link StraatadresBag }
     *     
     */
    public StraatadresBag getStraatadresBag() {
        return straatadresBag;
    }

    /**
     * Sets the value of the straatadresBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link StraatadresBag }
     *     
     */
    public void setStraatadresBag(StraatadresBag value) {
        this.straatadresBag = value;
    }

    /**
     * Gets the value of the postbusadres property.
     * 
     * @return
     *     possible object is
     *     {@link PostadresKadaster.Postbusadres }
     *     
     */
    public PostadresKadaster.Postbusadres getPostbusadres() {
        return postbusadres;
    }

    /**
     * Sets the value of the postbusadres property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostadresKadaster.Postbusadres }
     *     
     */
    public void setPostbusadres(PostadresKadaster.Postbusadres value) {
        this.postbusadres = value;
    }

    /**
     * Gets the value of the generiekAdresBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link GeneriekAdresBuitenland }
     *     
     */
    public GeneriekAdresBuitenland getGeneriekAdresBuitenland() {
        return generiekAdresBuitenland;
    }

    /**
     * Sets the value of the generiekAdresBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneriekAdresBuitenland }
     *     
     */
    public void setGeneriekAdresBuitenland(GeneriekAdresBuitenland value) {
        this.generiekAdresBuitenland = value;
    }


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
     *         <element name="Locatieoms" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN70" minOccurs="0"/>
     *         <element name="Postcd" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Postcd" minOccurs="0"/>
     *         <element name="Woonplaatsnaam" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}NaamAdresNederlandAN80" minOccurs="0"/>
     *         <element name="Gemeentenaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN40" minOccurs="0"/>
     *         <element name="Postbusnr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAdresNederlandN5" minOccurs="0"/>
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
        "locatieoms",
        "postcd",
        "woonplaatsnaam",
        "gemeentenaam",
        "postbusnr"
    })
    public static class Postbusadres {

        @XmlElement(name = "Locatieoms")
        protected String locatieoms;
        @XmlElement(name = "Postcd")
        protected String postcd;
        @XmlElement(name = "Woonplaatsnaam")
        protected String woonplaatsnaam;
        @XmlElement(name = "Gemeentenaam")
        protected String gemeentenaam;
        @XmlElement(name = "Postbusnr")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger postbusnr;

        /**
         * Gets the value of the locatieoms property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocatieoms() {
            return locatieoms;
        }

        /**
         * Sets the value of the locatieoms property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocatieoms(String value) {
            this.locatieoms = value;
        }

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
         * Gets the value of the woonplaatsnaam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWoonplaatsnaam() {
            return woonplaatsnaam;
        }

        /**
         * Sets the value of the woonplaatsnaam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWoonplaatsnaam(String value) {
            this.woonplaatsnaam = value;
        }

        /**
         * Gets the value of the gemeentenaam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGemeentenaam() {
            return gemeentenaam;
        }

        /**
         * Sets the value of the gemeentenaam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGemeentenaam(String value) {
            this.gemeentenaam = value;
        }

        /**
         * Gets the value of the postbusnr property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPostbusnr() {
            return postbusnr;
        }

        /**
         * Sets the value of the postbusnr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPostbusnr(BigInteger value) {
            this.postbusnr = value;
        }

    }

}
