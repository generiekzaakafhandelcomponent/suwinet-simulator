
package nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import nl.bkwi.suwiml.fwi.v0205.FWI;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <sequence>
 *           <element name="ClientSuwi" maxOccurs="unbounded" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr"/>
 *                     <element name="Voorletters" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorletters" minOccurs="0"/>
 *                     <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
 *                     <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
 *                     <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
 *                     <element name="RdwAdres" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="FeitelijkAdres" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Aansprakelijke" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Aansprakelijke_verkort" maxOccurs="unbounded" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="OndernemingInst" maxOccurs="unbounded" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="Rechtspersoon">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="NaamRechtspersoon" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamAN200"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="VestigingOndernemingInst" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="BezoekadresVestiging" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="CorrespondentieadresVestiging" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres_verkort" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Aansprakelijke" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Aansprakelijke_verkort" maxOccurs="unbounded" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element ref="{http://bkwi.nl/SuwiML/FWI/v0205}FWI" minOccurs="0"/>
 *         </sequence>
 *         <element ref="{http://bkwi.nl/SuwiML/FWI/v0205}NietsGevonden"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientSuwi",
    "ondernemingInst",
    "fwi",
    "nietsGevonden"
})
@XmlRootElement(name = "VoertuigbezitInfoPersoonResponse")
public class VoertuigbezitInfoPersoonResponse {

    @XmlElement(name = "ClientSuwi")
    protected List<VoertuigbezitInfoPersoonResponse.ClientSuwi> clientSuwi;
    @XmlElement(name = "OndernemingInst")
    protected List<VoertuigbezitInfoPersoonResponse.OndernemingInst> ondernemingInst;
    @XmlElement(name = "FWI", namespace = "http://bkwi.nl/SuwiML/FWI/v0205")
    protected FWI fwi;
    @XmlElement(name = "NietsGevonden", namespace = "http://bkwi.nl/SuwiML/FWI/v0205")
    protected Object nietsGevonden;

    /**
     * Gets the value of the clientSuwi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clientSuwi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientSuwi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoertuigbezitInfoPersoonResponse.ClientSuwi }
     * 
     * 
     * @return
     *     The value of the clientSuwi property.
     */
    public List<VoertuigbezitInfoPersoonResponse.ClientSuwi> getClientSuwi() {
        if (clientSuwi == null) {
            clientSuwi = new ArrayList<>();
        }
        return this.clientSuwi;
    }

    /**
     * Gets the value of the ondernemingInst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ondernemingInst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOndernemingInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoertuigbezitInfoPersoonResponse.OndernemingInst }
     * 
     * 
     * @return
     *     The value of the ondernemingInst property.
     */
    public List<VoertuigbezitInfoPersoonResponse.OndernemingInst> getOndernemingInst() {
        if (ondernemingInst == null) {
            ondernemingInst = new ArrayList<>();
        }
        return this.ondernemingInst;
    }

    /**
     * Gets the value of the fwi property.
     * 
     * @return
     *     possible object is
     *     {@link FWI }
     *     
     */
    public FWI getFWI() {
        return fwi;
    }

    /**
     * Sets the value of the fwi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FWI }
     *     
     */
    public void setFWI(FWI value) {
        this.fwi = value;
    }

    /**
     * Gets the value of the nietsGevonden property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNietsGevonden() {
        return nietsGevonden;
    }

    /**
     * Sets the value of the nietsGevonden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNietsGevonden(Object value) {
        this.nietsGevonden = value;
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
     *         <element name="Burgerservicenr" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Burgerservicenr"/>
     *         <element name="Voorletters" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorletters" minOccurs="0"/>
     *         <element name="Voorvoegsel" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Voorvoegsels" minOccurs="0"/>
     *         <element name="SignificantDeelVanDeAchternaam" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}NaamPersoonA200" minOccurs="0"/>
     *         <element name="Geboortedat" type="{http://bkwi.nl/SuwiML/Basisschema/v0801}Datum" minOccurs="0"/>
     *         <element name="RdwAdres" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="FeitelijkAdres" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres" minOccurs="0"/>
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
     *         <element name="Aansprakelijke" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Aansprakelijke_verkort" maxOccurs="unbounded" minOccurs="0"/>
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
        "burgerservicenr",
        "voorletters",
        "voorvoegsel",
        "significantDeelVanDeAchternaam",
        "geboortedat",
        "rdwAdres",
        "aansprakelijke"
    })
    public static class ClientSuwi {

        @XmlElement(name = "Burgerservicenr", required = true)
        protected String burgerservicenr;
        @XmlElement(name = "Voorletters")
        protected String voorletters;
        @XmlElement(name = "Voorvoegsel")
        protected String voorvoegsel;
        @XmlElement(name = "SignificantDeelVanDeAchternaam")
        protected String significantDeelVanDeAchternaam;
        @XmlElement(name = "Geboortedat")
        protected String geboortedat;
        @XmlElement(name = "RdwAdres")
        protected List<VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres> rdwAdres;
        @XmlElement(name = "Aansprakelijke")
        protected List<AansprakelijkeVerkort> aansprakelijke;

        /**
         * Gets the value of the burgerservicenr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBurgerservicenr() {
            return burgerservicenr;
        }

        /**
         * Sets the value of the burgerservicenr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBurgerservicenr(String value) {
            this.burgerservicenr = value;
        }

        /**
         * Gets the value of the voorletters property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVoorletters() {
            return voorletters;
        }

        /**
         * Sets the value of the voorletters property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVoorletters(String value) {
            this.voorletters = value;
        }

        /**
         * Gets the value of the voorvoegsel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVoorvoegsel() {
            return voorvoegsel;
        }

        /**
         * Sets the value of the voorvoegsel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVoorvoegsel(String value) {
            this.voorvoegsel = value;
        }

        /**
         * Gets the value of the significantDeelVanDeAchternaam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSignificantDeelVanDeAchternaam() {
            return significantDeelVanDeAchternaam;
        }

        /**
         * Sets the value of the significantDeelVanDeAchternaam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSignificantDeelVanDeAchternaam(String value) {
            this.significantDeelVanDeAchternaam = value;
        }

        /**
         * Gets the value of the geboortedat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeboortedat() {
            return geboortedat;
        }

        /**
         * Sets the value of the geboortedat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeboortedat(String value) {
            this.geboortedat = value;
        }

        /**
         * Gets the value of the rdwAdres property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the rdwAdres property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRdwAdres().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres }
         * 
         * 
         * @return
         *     The value of the rdwAdres property.
         */
        public List<VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres> getRdwAdres() {
            if (rdwAdres == null) {
                rdwAdres = new ArrayList<>();
            }
            return this.rdwAdres;
        }

        /**
         * Gets the value of the aansprakelijke property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the aansprakelijke property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAansprakelijke().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AansprakelijkeVerkort }
         * 
         * 
         * @return
         *     The value of the aansprakelijke property.
         */
        public List<AansprakelijkeVerkort> getAansprakelijke() {
            if (aansprakelijke == null) {
                aansprakelijke = new ArrayList<>();
            }
            return this.aansprakelijke;
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
         *                   <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres" minOccurs="0"/>
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
            "feitelijkAdres"
        })
        public static class RdwAdres {

            @XmlElement(name = "FeitelijkAdres")
            protected VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres.FeitelijkAdres feitelijkAdres;

            /**
             * Gets the value of the feitelijkAdres property.
             * 
             * @return
             *     possible object is
             *     {@link VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres.FeitelijkAdres }
             *     
             */
            public VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres.FeitelijkAdres getFeitelijkAdres() {
                return feitelijkAdres;
            }

            /**
             * Sets the value of the feitelijkAdres property.
             * 
             * @param value
             *     allowed object is
             *     {@link VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres.FeitelijkAdres }
             *     
             */
            public void setFeitelijkAdres(VoertuigbezitInfoPersoonResponse.ClientSuwi.RdwAdres.FeitelijkAdres value) {
                this.feitelijkAdres = value;
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
             *         <element name="Straatadres" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Straatadres" minOccurs="0"/>
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
                protected Straatadres straatadres;

                /**
                 * Gets the value of the straatadres property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Straatadres }
                 *     
                 */
                public Straatadres getStraatadres() {
                    return straatadres;
                }

                /**
                 * Sets the value of the straatadres property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Straatadres }
                 *     
                 */
                public void setStraatadres(Straatadres value) {
                    this.straatadres = value;
                }

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
     *         <element name="Rechtspersoon">
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
     *         <element name="VestigingOndernemingInst" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="BezoekadresVestiging" minOccurs="0">
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
     *                   <element name="CorrespondentieadresVestiging" minOccurs="0">
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
     *         <element name="Aansprakelijke" type="{http://bkwi.nl/SuwiML/Diensten/RDWDossierGSD/v0200}Aansprakelijke_verkort" maxOccurs="unbounded" minOccurs="0"/>
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
        "rechtspersoon",
        "vestigingOndernemingInst",
        "aansprakelijke"
    })
    public static class OndernemingInst {

        @XmlElement(name = "Rechtspersoon", required = true)
        protected VoertuigbezitInfoPersoonResponse.OndernemingInst.Rechtspersoon rechtspersoon;
        @XmlElement(name = "VestigingOndernemingInst")
        protected VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst vestigingOndernemingInst;
        @XmlElement(name = "Aansprakelijke")
        protected List<AansprakelijkeVerkort> aansprakelijke;

        /**
         * Gets the value of the rechtspersoon property.
         * 
         * @return
         *     possible object is
         *     {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.Rechtspersoon }
         *     
         */
        public VoertuigbezitInfoPersoonResponse.OndernemingInst.Rechtspersoon getRechtspersoon() {
            return rechtspersoon;
        }

        /**
         * Sets the value of the rechtspersoon property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.Rechtspersoon }
         *     
         */
        public void setRechtspersoon(VoertuigbezitInfoPersoonResponse.OndernemingInst.Rechtspersoon value) {
            this.rechtspersoon = value;
        }

        /**
         * Gets the value of the vestigingOndernemingInst property.
         * 
         * @return
         *     possible object is
         *     {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst }
         *     
         */
        public VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst getVestigingOndernemingInst() {
            return vestigingOndernemingInst;
        }

        /**
         * Sets the value of the vestigingOndernemingInst property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst }
         *     
         */
        public void setVestigingOndernemingInst(VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst value) {
            this.vestigingOndernemingInst = value;
        }

        /**
         * Gets the value of the aansprakelijke property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the aansprakelijke property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAansprakelijke().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AansprakelijkeVerkort }
         * 
         * 
         * @return
         *     The value of the aansprakelijke property.
         */
        public List<AansprakelijkeVerkort> getAansprakelijke() {
            if (aansprakelijke == null) {
                aansprakelijke = new ArrayList<>();
            }
            return this.aansprakelijke;
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
         *         <element name="BezoekadresVestiging" minOccurs="0">
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
         *         <element name="CorrespondentieadresVestiging" minOccurs="0">
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
            "bezoekadresVestiging",
            "correspondentieadresVestiging"
        })
        public static class VestigingOndernemingInst {

            @XmlElement(name = "BezoekadresVestiging")
            protected VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging bezoekadresVestiging;
            @XmlElement(name = "CorrespondentieadresVestiging")
            protected VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging correspondentieadresVestiging;

            /**
             * Gets the value of the bezoekadresVestiging property.
             * 
             * @return
             *     possible object is
             *     {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
             *     
             */
            public VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging getBezoekadresVestiging() {
                return bezoekadresVestiging;
            }

            /**
             * Sets the value of the bezoekadresVestiging property.
             * 
             * @param value
             *     allowed object is
             *     {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
             *     
             */
            public void setBezoekadresVestiging(VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging value) {
                this.bezoekadresVestiging = value;
            }

            /**
             * Gets the value of the correspondentieadresVestiging property.
             * 
             * @return
             *     possible object is
             *     {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
             *     
             */
            public VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging getCorrespondentieadresVestiging() {
                return correspondentieadresVestiging;
            }

            /**
             * Sets the value of the correspondentieadresVestiging property.
             * 
             * @param value
             *     allowed object is
             *     {@link VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
             *     
             */
            public void setCorrespondentieadresVestiging(VoertuigbezitInfoPersoonResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging value) {
                this.correspondentieadresVestiging = value;
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
            public static class BezoekadresVestiging {

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
            public static class CorrespondentieadresVestiging {

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
