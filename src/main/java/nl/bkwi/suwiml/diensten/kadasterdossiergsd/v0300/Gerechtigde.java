
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gerechtigde complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Gerechtigde">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="NatuurlijkPersoon" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}NatuurlijkPersoon"/>
 *           <element name="NietNatuurlijkPersoon">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="OndernemingInst" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="InschrijvingsnrKvK" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}InschrijvingsnrKvK" minOccurs="0"/>
 *                               <element name="NaamOndernemingInst" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="HandelsnaamOrganisatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="OmsRechtsvorm" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}OmsRechtsvorm" minOccurs="0"/>
 *                               <element name="OmsStatutaireZetel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN24" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Rechtspersoon" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}Rechtspersoon" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="DomicilieAdres" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}AdresKadaster" minOccurs="0"/>
 *         <element name="Correspondentieadres" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}PostadresKadaster" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gerechtigde", propOrder = {
    "natuurlijkPersoon",
    "nietNatuurlijkPersoon",
    "domicilieAdres",
    "correspondentieadres"
})
public class Gerechtigde {

    @XmlElement(name = "NatuurlijkPersoon")
    protected NatuurlijkPersoon natuurlijkPersoon;
    @XmlElement(name = "NietNatuurlijkPersoon")
    protected Gerechtigde.NietNatuurlijkPersoon nietNatuurlijkPersoon;
    @XmlElement(name = "DomicilieAdres")
    protected AdresKadaster domicilieAdres;
    @XmlElement(name = "Correspondentieadres")
    protected PostadresKadaster correspondentieadres;

    /**
     * Gets the value of the natuurlijkPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link NatuurlijkPersoon }
     *     
     */
    public NatuurlijkPersoon getNatuurlijkPersoon() {
        return natuurlijkPersoon;
    }

    /**
     * Sets the value of the natuurlijkPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatuurlijkPersoon }
     *     
     */
    public void setNatuurlijkPersoon(NatuurlijkPersoon value) {
        this.natuurlijkPersoon = value;
    }

    /**
     * Gets the value of the nietNatuurlijkPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link Gerechtigde.NietNatuurlijkPersoon }
     *     
     */
    public Gerechtigde.NietNatuurlijkPersoon getNietNatuurlijkPersoon() {
        return nietNatuurlijkPersoon;
    }

    /**
     * Sets the value of the nietNatuurlijkPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gerechtigde.NietNatuurlijkPersoon }
     *     
     */
    public void setNietNatuurlijkPersoon(Gerechtigde.NietNatuurlijkPersoon value) {
        this.nietNatuurlijkPersoon = value;
    }

    /**
     * Gets the value of the domicilieAdres property.
     * 
     * @return
     *     possible object is
     *     {@link AdresKadaster }
     *     
     */
    public AdresKadaster getDomicilieAdres() {
        return domicilieAdres;
    }

    /**
     * Sets the value of the domicilieAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresKadaster }
     *     
     */
    public void setDomicilieAdres(AdresKadaster value) {
        this.domicilieAdres = value;
    }

    /**
     * Gets the value of the correspondentieadres property.
     * 
     * @return
     *     possible object is
     *     {@link PostadresKadaster }
     *     
     */
    public PostadresKadaster getCorrespondentieadres() {
        return correspondentieadres;
    }

    /**
     * Sets the value of the correspondentieadres property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostadresKadaster }
     *     
     */
    public void setCorrespondentieadres(PostadresKadaster value) {
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
     *         <element name="OndernemingInst" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="InschrijvingsnrKvK" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}InschrijvingsnrKvK" minOccurs="0"/>
     *                   <element name="NaamOndernemingInst" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="HandelsnaamOrganisatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="OmsRechtsvorm" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}OmsRechtsvorm" minOccurs="0"/>
     *                   <element name="OmsStatutaireZetel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN24" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Rechtspersoon" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}Rechtspersoon" minOccurs="0"/>
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
        "ondernemingInst",
        "rechtspersoon"
    })
    public static class NietNatuurlijkPersoon {

        @XmlElement(name = "OndernemingInst")
        protected Gerechtigde.NietNatuurlijkPersoon.OndernemingInst ondernemingInst;
        @XmlElement(name = "Rechtspersoon")
        protected Rechtspersoon rechtspersoon;

        /**
         * Gets the value of the ondernemingInst property.
         * 
         * @return
         *     possible object is
         *     {@link Gerechtigde.NietNatuurlijkPersoon.OndernemingInst }
         *     
         */
        public Gerechtigde.NietNatuurlijkPersoon.OndernemingInst getOndernemingInst() {
            return ondernemingInst;
        }

        /**
         * Sets the value of the ondernemingInst property.
         * 
         * @param value
         *     allowed object is
         *     {@link Gerechtigde.NietNatuurlijkPersoon.OndernemingInst }
         *     
         */
        public void setOndernemingInst(Gerechtigde.NietNatuurlijkPersoon.OndernemingInst value) {
            this.ondernemingInst = value;
        }

        /**
         * Gets the value of the rechtspersoon property.
         * 
         * @return
         *     possible object is
         *     {@link Rechtspersoon }
         *     
         */
        public Rechtspersoon getRechtspersoon() {
            return rechtspersoon;
        }

        /**
         * Sets the value of the rechtspersoon property.
         * 
         * @param value
         *     allowed object is
         *     {@link Rechtspersoon }
         *     
         */
        public void setRechtspersoon(Rechtspersoon value) {
            this.rechtspersoon = value;
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
         *         <element name="InschrijvingsnrKvK" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}InschrijvingsnrKvK" minOccurs="0"/>
         *         <element name="NaamOndernemingInst" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="HandelsnaamOrganisatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="OmsRechtsvorm" type="{http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300}OmsRechtsvorm" minOccurs="0"/>
         *         <element name="OmsStatutaireZetel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAdresNederlandAN24" minOccurs="0"/>
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
            "naamOndernemingInst",
            "omsRechtsvorm",
            "omsStatutaireZetel"
        })
        public static class OndernemingInst {

            @XmlElement(name = "InschrijvingsnrKvK")
            protected String inschrijvingsnrKvK;
            @XmlElement(name = "NaamOndernemingInst")
            protected Gerechtigde.NietNatuurlijkPersoon.OndernemingInst.NaamOndernemingInst naamOndernemingInst;
            @XmlElement(name = "OmsRechtsvorm")
            protected String omsRechtsvorm;
            @XmlElement(name = "OmsStatutaireZetel")
            protected String omsStatutaireZetel;

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
             * Gets the value of the naamOndernemingInst property.
             * 
             * @return
             *     possible object is
             *     {@link Gerechtigde.NietNatuurlijkPersoon.OndernemingInst.NaamOndernemingInst }
             *     
             */
            public Gerechtigde.NietNatuurlijkPersoon.OndernemingInst.NaamOndernemingInst getNaamOndernemingInst() {
                return naamOndernemingInst;
            }

            /**
             * Sets the value of the naamOndernemingInst property.
             * 
             * @param value
             *     allowed object is
             *     {@link Gerechtigde.NietNatuurlijkPersoon.OndernemingInst.NaamOndernemingInst }
             *     
             */
            public void setNaamOndernemingInst(Gerechtigde.NietNatuurlijkPersoon.OndernemingInst.NaamOndernemingInst value) {
                this.naamOndernemingInst = value;
            }

            /**
             * Gets the value of the omsRechtsvorm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOmsRechtsvorm() {
                return omsRechtsvorm;
            }

            /**
             * Sets the value of the omsRechtsvorm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOmsRechtsvorm(String value) {
                this.omsRechtsvorm = value;
            }

            /**
             * Gets the value of the omsStatutaireZetel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOmsStatutaireZetel() {
                return omsStatutaireZetel;
            }

            /**
             * Sets the value of the omsStatutaireZetel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOmsStatutaireZetel(String value) {
                this.omsStatutaireZetel = value;
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
             *         <element name="HandelsnaamOrganisatie" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN70"/>
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
                "handelsnaamOrganisatie"
            })
            public static class NaamOndernemingInst {

                @XmlElement(name = "HandelsnaamOrganisatie", required = true)
                protected String handelsnaamOrganisatie;

                /**
                 * Gets the value of the handelsnaamOrganisatie property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHandelsnaamOrganisatie() {
                    return handelsnaamOrganisatie;
                }

                /**
                 * Sets the value of the handelsnaamOrganisatie property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHandelsnaamOrganisatie(String value) {
                    this.handelsnaamOrganisatie = value;
                }

            }

        }

    }

}
