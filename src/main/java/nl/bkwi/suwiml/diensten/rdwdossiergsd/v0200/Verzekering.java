
package nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Verzekering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Verzekering">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdSrtDekking" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdSrtDekking" minOccurs="0"/>
 *         <element name="Polisnr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Polisnr" minOccurs="0"/>
 *         <element name="DatBVerzekering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="DatEVerzekering" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *         <element name="Verzekeringsmaatschappij" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="CdVerzekeringsmaatschappijRdw" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdVerzekeringsmaatschappijRdw" minOccurs="0"/>
 *                   <element name="NaamVerzekeringsmaatschappijRdw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
 *                   <element name="AdresVerzekeringsmaatschappijRdw" minOccurs="0">
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
 *                   <element name="Gevolmachtigde" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="CdGevolmachtigde" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdGevolmachtigde" minOccurs="0"/>
 *                             <element name="NaamGevolmachtigde" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
 *                             <element name="AdresGevolmachtigde" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
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
@XmlType(name = "Verzekering", propOrder = {
    "cdSrtDekking",
    "polisnr",
    "datBVerzekering",
    "datEVerzekering",
    "verzekeringsmaatschappij"
})
public class Verzekering {

    @XmlElement(name = "CdSrtDekking")
    protected String cdSrtDekking;
    @XmlElement(name = "Polisnr")
    protected String polisnr;
    @XmlElement(name = "DatBVerzekering")
    protected String datBVerzekering;
    @XmlElement(name = "DatEVerzekering")
    protected String datEVerzekering;
    @XmlElement(name = "Verzekeringsmaatschappij")
    protected Verzekering.Verzekeringsmaatschappij verzekeringsmaatschappij;

    /**
     * Gets the value of the cdSrtDekking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdSrtDekking() {
        return cdSrtDekking;
    }

    /**
     * Sets the value of the cdSrtDekking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdSrtDekking(String value) {
        this.cdSrtDekking = value;
    }

    /**
     * Gets the value of the polisnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolisnr() {
        return polisnr;
    }

    /**
     * Sets the value of the polisnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolisnr(String value) {
        this.polisnr = value;
    }

    /**
     * Gets the value of the datBVerzekering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatBVerzekering() {
        return datBVerzekering;
    }

    /**
     * Sets the value of the datBVerzekering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatBVerzekering(String value) {
        this.datBVerzekering = value;
    }

    /**
     * Gets the value of the datEVerzekering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatEVerzekering() {
        return datEVerzekering;
    }

    /**
     * Sets the value of the datEVerzekering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatEVerzekering(String value) {
        this.datEVerzekering = value;
    }

    /**
     * Gets the value of the verzekeringsmaatschappij property.
     * 
     * @return
     *     possible object is
     *     {@link Verzekering.Verzekeringsmaatschappij }
     *     
     */
    public Verzekering.Verzekeringsmaatschappij getVerzekeringsmaatschappij() {
        return verzekeringsmaatschappij;
    }

    /**
     * Sets the value of the verzekeringsmaatschappij property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verzekering.Verzekeringsmaatschappij }
     *     
     */
    public void setVerzekeringsmaatschappij(Verzekering.Verzekeringsmaatschappij value) {
        this.verzekeringsmaatschappij = value;
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
     *         <element name="CdVerzekeringsmaatschappijRdw" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}CdVerzekeringsmaatschappijRdw" minOccurs="0"/>
     *         <element name="NaamVerzekeringsmaatschappijRdw" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
     *         <element name="AdresVerzekeringsmaatschappijRdw" minOccurs="0">
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
     *         <element name="Gevolmachtigde" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="CdGevolmachtigde" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdGevolmachtigde" minOccurs="0"/>
     *                   <element name="NaamGevolmachtigde" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
     *                   <element name="AdresGevolmachtigde" minOccurs="0">
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
    @XmlType(name = "", propOrder = {
        "cdVerzekeringsmaatschappijRdw",
        "naamVerzekeringsmaatschappijRdw",
        "adresVerzekeringsmaatschappijRdw",
        "gevolmachtigde"
    })
    public static class Verzekeringsmaatschappij {

        @XmlElement(name = "CdVerzekeringsmaatschappijRdw")
        protected String cdVerzekeringsmaatschappijRdw;
        @XmlElement(name = "NaamVerzekeringsmaatschappijRdw")
        protected String naamVerzekeringsmaatschappijRdw;
        @XmlElement(name = "AdresVerzekeringsmaatschappijRdw")
        protected Verzekering.Verzekeringsmaatschappij.AdresVerzekeringsmaatschappijRdw adresVerzekeringsmaatschappijRdw;
        @XmlElement(name = "Gevolmachtigde")
        protected Verzekering.Verzekeringsmaatschappij.Gevolmachtigde gevolmachtigde;

        /**
         * Gets the value of the cdVerzekeringsmaatschappijRdw property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCdVerzekeringsmaatschappijRdw() {
            return cdVerzekeringsmaatschappijRdw;
        }

        /**
         * Sets the value of the cdVerzekeringsmaatschappijRdw property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCdVerzekeringsmaatschappijRdw(String value) {
            this.cdVerzekeringsmaatschappijRdw = value;
        }

        /**
         * Gets the value of the naamVerzekeringsmaatschappijRdw property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNaamVerzekeringsmaatschappijRdw() {
            return naamVerzekeringsmaatschappijRdw;
        }

        /**
         * Sets the value of the naamVerzekeringsmaatschappijRdw property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNaamVerzekeringsmaatschappijRdw(String value) {
            this.naamVerzekeringsmaatschappijRdw = value;
        }

        /**
         * Gets the value of the adresVerzekeringsmaatschappijRdw property.
         * 
         * @return
         *     possible object is
         *     {@link Verzekering.Verzekeringsmaatschappij.AdresVerzekeringsmaatschappijRdw }
         *     
         */
        public Verzekering.Verzekeringsmaatschappij.AdresVerzekeringsmaatschappijRdw getAdresVerzekeringsmaatschappijRdw() {
            return adresVerzekeringsmaatschappijRdw;
        }

        /**
         * Sets the value of the adresVerzekeringsmaatschappijRdw property.
         * 
         * @param value
         *     allowed object is
         *     {@link Verzekering.Verzekeringsmaatschappij.AdresVerzekeringsmaatschappijRdw }
         *     
         */
        public void setAdresVerzekeringsmaatschappijRdw(Verzekering.Verzekeringsmaatschappij.AdresVerzekeringsmaatschappijRdw value) {
            this.adresVerzekeringsmaatschappijRdw = value;
        }

        /**
         * Gets the value of the gevolmachtigde property.
         * 
         * @return
         *     possible object is
         *     {@link Verzekering.Verzekeringsmaatschappij.Gevolmachtigde }
         *     
         */
        public Verzekering.Verzekeringsmaatschappij.Gevolmachtigde getGevolmachtigde() {
            return gevolmachtigde;
        }

        /**
         * Sets the value of the gevolmachtigde property.
         * 
         * @param value
         *     allowed object is
         *     {@link Verzekering.Verzekeringsmaatschappij.Gevolmachtigde }
         *     
         */
        public void setGevolmachtigde(Verzekering.Verzekeringsmaatschappij.Gevolmachtigde value) {
            this.gevolmachtigde = value;
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
        public static class AdresVerzekeringsmaatschappijRdw {

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
         *         <element name="CdGevolmachtigde" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}CdGevolmachtigde" minOccurs="0"/>
         *         <element name="NaamGevolmachtigde" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70" minOccurs="0"/>
         *         <element name="AdresGevolmachtigde" minOccurs="0">
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
            "cdGevolmachtigde",
            "naamGevolmachtigde",
            "adresGevolmachtigde"
        })
        public static class Gevolmachtigde {

            @XmlElement(name = "CdGevolmachtigde")
            protected String cdGevolmachtigde;
            @XmlElement(name = "NaamGevolmachtigde")
            protected String naamGevolmachtigde;
            @XmlElement(name = "AdresGevolmachtigde")
            protected Verzekering.Verzekeringsmaatschappij.Gevolmachtigde.AdresGevolmachtigde adresGevolmachtigde;

            /**
             * Gets the value of the cdGevolmachtigde property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdGevolmachtigde() {
                return cdGevolmachtigde;
            }

            /**
             * Sets the value of the cdGevolmachtigde property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdGevolmachtigde(String value) {
                this.cdGevolmachtigde = value;
            }

            /**
             * Gets the value of the naamGevolmachtigde property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNaamGevolmachtigde() {
                return naamGevolmachtigde;
            }

            /**
             * Sets the value of the naamGevolmachtigde property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNaamGevolmachtigde(String value) {
                this.naamGevolmachtigde = value;
            }

            /**
             * Gets the value of the adresGevolmachtigde property.
             * 
             * @return
             *     possible object is
             *     {@link Verzekering.Verzekeringsmaatschappij.Gevolmachtigde.AdresGevolmachtigde }
             *     
             */
            public Verzekering.Verzekeringsmaatschappij.Gevolmachtigde.AdresGevolmachtigde getAdresGevolmachtigde() {
                return adresGevolmachtigde;
            }

            /**
             * Sets the value of the adresGevolmachtigde property.
             * 
             * @param value
             *     allowed object is
             *     {@link Verzekering.Verzekeringsmaatschappij.Gevolmachtigde.AdresGevolmachtigde }
             *     
             */
            public void setAdresGevolmachtigde(Verzekering.Verzekeringsmaatschappij.Gevolmachtigde.AdresGevolmachtigde value) {
                this.adresGevolmachtigde = value;
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
            public static class AdresGevolmachtigde {

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

    }

}
