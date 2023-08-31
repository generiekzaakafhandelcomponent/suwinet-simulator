
package nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Aansprakelijke_verkort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Aansprakelijke_verkort">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatRegistratieAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum"/>
 *         <element name="DatEAansprakelijkheid" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="Voertuig" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6"/>
 *                   <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig" minOccurs="0"/>
 *                             <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                             <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aansprakelijke_verkort", propOrder = {
    "datRegistratieAansprakelijkheid",
    "datEAansprakelijkheid",
    "voertuig"
})
public class AansprakelijkeVerkort {

    @XmlElement(name = "DatRegistratieAansprakelijkheid", required = true)
    protected String datRegistratieAansprakelijkheid;
    @XmlElement(name = "DatEAansprakelijkheid")
    protected String datEAansprakelijkheid;
    @XmlElement(name = "Voertuig")
    protected AansprakelijkeVerkort.Voertuig voertuig;

    /**
     * Gets the value of the datRegistratieAansprakelijkheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatRegistratieAansprakelijkheid() {
        return datRegistratieAansprakelijkheid;
    }

    /**
     * Sets the value of the datRegistratieAansprakelijkheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatRegistratieAansprakelijkheid(String value) {
        this.datRegistratieAansprakelijkheid = value;
    }

    /**
     * Gets the value of the datEAansprakelijkheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatEAansprakelijkheid() {
        return datEAansprakelijkheid;
    }

    /**
     * Sets the value of the datEAansprakelijkheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatEAansprakelijkheid(String value) {
        this.datEAansprakelijkheid = value;
    }

    /**
     * Gets the value of the voertuig property.
     * 
     * @return
     *     possible object is
     *     {@link AansprakelijkeVerkort.Voertuig }
     *     
     */
    public AansprakelijkeVerkort.Voertuig getVoertuig() {
        return voertuig;
    }

    /**
     * Sets the value of the voertuig property.
     * 
     * @param value
     *     allowed object is
     *     {@link AansprakelijkeVerkort.Voertuig }
     *     
     */
    public void setVoertuig(AansprakelijkeVerkort.Voertuig value) {
        this.voertuig = value;
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
     *         <element name="KentekenVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NummerAN6"/>
     *         <element name="StatusVoertuig" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig" minOccurs="0"/>
     *                   <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                   <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "statusVoertuig"
    })
    public static class Voertuig {

        @XmlElement(name = "KentekenVoertuig", required = true)
        protected String kentekenVoertuig;
        @XmlElement(name = "StatusVoertuig")
        protected List<AansprakelijkeVerkort.Voertuig.StatusVoertuig> statusVoertuig;

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
         * Gets the value of the statusVoertuig property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the statusVoertuig property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatusVoertuig().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AansprakelijkeVerkort.Voertuig.StatusVoertuig }
         * 
         * 
         * @return
         *     The value of the statusVoertuig property.
         */
        public List<AansprakelijkeVerkort.Voertuig.StatusVoertuig> getStatusVoertuig() {
            if (statusVoertuig == null) {
                statusVoertuig = new ArrayList<>();
            }
            return this.statusVoertuig;
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
         *         <element name="CdStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdStatusVoertuig" minOccurs="0"/>
         *         <element name="DatBStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
         *         <element name="DatEStatusVoertuig" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
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
            "cdStatusVoertuig",
            "datBStatusVoertuig",
            "datEStatusVoertuig"
        })
        public static class StatusVoertuig {

            @XmlElement(name = "CdStatusVoertuig")
            protected String cdStatusVoertuig;
            @XmlElement(name = "DatBStatusVoertuig")
            protected String datBStatusVoertuig;
            @XmlElement(name = "DatEStatusVoertuig")
            protected String datEStatusVoertuig;

            /**
             * Gets the value of the cdStatusVoertuig property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdStatusVoertuig() {
                return cdStatusVoertuig;
            }

            /**
             * Sets the value of the cdStatusVoertuig property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdStatusVoertuig(String value) {
                this.cdStatusVoertuig = value;
            }

            /**
             * Gets the value of the datBStatusVoertuig property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatBStatusVoertuig() {
                return datBStatusVoertuig;
            }

            /**
             * Sets the value of the datBStatusVoertuig property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatBStatusVoertuig(String value) {
                this.datBStatusVoertuig = value;
            }

            /**
             * Gets the value of the datEStatusVoertuig property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatEStatusVoertuig() {
                return datEStatusVoertuig;
            }

            /**
             * Sets the value of the datEStatusVoertuig property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatEStatusVoertuig(String value) {
                this.datEStatusVoertuig = value;
            }

        }

    }

}
