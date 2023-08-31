
package nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Voertuigverplichtingennemer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Voertuigverplichtingennemer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rechtspersoon" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AdresVoertuigverplichtingennemer" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="FeitelijkAdres" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Correspondentieadres" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
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
@XmlType(name = "Voertuigverplichtingennemer", propOrder = {
    "rechtspersoon",
    "adresVoertuigverplichtingennemer"
})
public class Voertuigverplichtingennemer {

    @XmlElement(name = "Rechtspersoon")
    protected Voertuigverplichtingennemer.Rechtspersoon rechtspersoon;
    @XmlElement(name = "AdresVoertuigverplichtingennemer")
    protected Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer adresVoertuigverplichtingennemer;

    /**
     * Gets the value of the rechtspersoon property.
     * 
     * @return
     *     possible object is
     *     {@link Voertuigverplichtingennemer.Rechtspersoon }
     *     
     */
    public Voertuigverplichtingennemer.Rechtspersoon getRechtspersoon() {
        return rechtspersoon;
    }

    /**
     * Sets the value of the rechtspersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voertuigverplichtingennemer.Rechtspersoon }
     *     
     */
    public void setRechtspersoon(Voertuigverplichtingennemer.Rechtspersoon value) {
        this.rechtspersoon = value;
    }

    /**
     * Gets the value of the adresVoertuigverplichtingennemer property.
     * 
     * @return
     *     possible object is
     *     {@link Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer }
     *     
     */
    public Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer getAdresVoertuigverplichtingennemer() {
        return adresVoertuigverplichtingennemer;
    }

    /**
     * Sets the value of the adresVoertuigverplichtingennemer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer }
     *     
     */
    public void setAdresVoertuigverplichtingennemer(Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer value) {
        this.adresVoertuigverplichtingennemer = value;
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
     *         <element name="FeitelijkAdres" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Correspondentieadres" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
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
        "feitelijkAdres",
        "correspondentieadres"
    })
    public static class AdresVoertuigverplichtingennemer {

        @XmlElement(name = "FeitelijkAdres")
        protected Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.FeitelijkAdres feitelijkAdres;
        @XmlElement(name = "Correspondentieadres")
        protected Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.Correspondentieadres correspondentieadres;

        /**
         * Gets the value of the feitelijkAdres property.
         * 
         * @return
         *     possible object is
         *     {@link Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.FeitelijkAdres }
         *     
         */
        public Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.FeitelijkAdres getFeitelijkAdres() {
            return feitelijkAdres;
        }

        /**
         * Sets the value of the feitelijkAdres property.
         * 
         * @param value
         *     allowed object is
         *     {@link Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.FeitelijkAdres }
         *     
         */
        public void setFeitelijkAdres(Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.FeitelijkAdres value) {
            this.feitelijkAdres = value;
        }

        /**
         * Gets the value of the correspondentieadres property.
         * 
         * @return
         *     possible object is
         *     {@link Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.Correspondentieadres }
         *     
         */
        public Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.Correspondentieadres getCorrespondentieadres() {
            return correspondentieadres;
        }

        /**
         * Sets the value of the correspondentieadres property.
         * 
         * @param value
         *     allowed object is
         *     {@link Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.Correspondentieadres }
         *     
         */
        public void setCorrespondentieadres(Voertuigverplichtingennemer.AdresVoertuigverplichtingennemer.Correspondentieadres value) {
            this.correspondentieadres = value;
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
         *         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
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
            "straatadres"
        })
        public static class Correspondentieadres {

            @XmlElement(name = "Straatadres")
            protected StraatadresVerkort straatadres;

            /**
             * Gets the value of the straatadres property.
             * 
             * @return
             *     possible object is
             *     {@link StraatadresVerkort }
             *     
             */
            public StraatadresVerkort getStraatadres() {
                return straatadres;
            }

            /**
             * Sets the value of the straatadres property.
             * 
             * @param value
             *     allowed object is
             *     {@link StraatadresVerkort }
             *     
             */
            public void setStraatadres(StraatadresVerkort value) {
                this.straatadres = value;
            }

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
         *         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
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
            "straatadres"
        })
        public static class FeitelijkAdres {

            @XmlElement(name = "Straatadres")
            protected StraatadresVerkort straatadres;

            /**
             * Gets the value of the straatadres property.
             * 
             * @return
             *     possible object is
             *     {@link StraatadresVerkort }
             *     
             */
            public StraatadresVerkort getStraatadres() {
                return straatadres;
            }

            /**
             * Sets the value of the straatadres property.
             * 
             * @param value
             *     allowed object is
             *     {@link StraatadresVerkort }
             *     
             */
            public void setStraatadres(StraatadresVerkort value) {
                this.straatadres = value;
            }

        }

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
     *         <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200"/>
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
        "naamRechtspersoon"
    })
    public static class Rechtspersoon {

        @XmlElement(name = "NaamRechtspersoon", required = true)
        protected String naamRechtspersoon;

        /**
         * Gets the value of the naamRechtspersoon property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNaamRechtspersoon() {
            return naamRechtspersoon;
        }

        /**
         * Sets the value of the naamRechtspersoon property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNaamRechtspersoon(String value) {
            this.naamRechtspersoon = value;
        }

    }

}
