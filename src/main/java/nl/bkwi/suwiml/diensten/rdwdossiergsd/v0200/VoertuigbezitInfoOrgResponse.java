
package nl.bkwi.suwiml.diensten.rdwdossiergsd.v0200;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
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
 *           <element name="OndernemingInst" maxOccurs="unbounded">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="Rechtspersoon" minOccurs="0">
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
 *         <element ref="{http://bkwi.nl/SuwiML/FWI/v0205}FWI"/>
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
    "content"
})
@XmlRootElement(name = "VoertuigbezitInfoOrgResponse")
public class VoertuigbezitInfoOrgResponse {

    @XmlElementRefs({
        @XmlElementRef(name = "OndernemingInst", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FWI", namespace = "http://bkwi.nl/SuwiML/FWI/v0205", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NietsGevonden", namespace = "http://bkwi.nl/SuwiML/FWI/v0205", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "FWI" is used by two different parts of a schema. See: 
     * line 136 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyReaction.xsd
     * line 134 of file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/Diensten/RDWDossierGSD/v0200-b02/BodyReaction.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names:Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link VoertuigbezitInfoOrgResponse.OndernemingInst }{@code >}
     * {@link JAXBElement }{@code <}{@link FWI }{@code >}
     * 
     * 
     * @return
     *     The value of the content property.
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
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

        @XmlElement(name = "Rechtspersoon")
        protected VoertuigbezitInfoOrgResponse.OndernemingInst.Rechtspersoon rechtspersoon;
        @XmlElement(name = "VestigingOndernemingInst")
        protected VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst vestigingOndernemingInst;
        @XmlElement(name = "Aansprakelijke")
        protected List<AansprakelijkeVerkort> aansprakelijke;

        /**
         * Gets the value of the rechtspersoon property.
         * 
         * @return
         *     possible object is
         *     {@link VoertuigbezitInfoOrgResponse.OndernemingInst.Rechtspersoon }
         *     
         */
        public VoertuigbezitInfoOrgResponse.OndernemingInst.Rechtspersoon getRechtspersoon() {
            return rechtspersoon;
        }

        /**
         * Sets the value of the rechtspersoon property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoertuigbezitInfoOrgResponse.OndernemingInst.Rechtspersoon }
         *     
         */
        public void setRechtspersoon(VoertuigbezitInfoOrgResponse.OndernemingInst.Rechtspersoon value) {
            this.rechtspersoon = value;
        }

        /**
         * Gets the value of the vestigingOndernemingInst property.
         * 
         * @return
         *     possible object is
         *     {@link VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst }
         *     
         */
        public VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst getVestigingOndernemingInst() {
            return vestigingOndernemingInst;
        }

        /**
         * Sets the value of the vestigingOndernemingInst property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst }
         *     
         */
        public void setVestigingOndernemingInst(VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst value) {
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
            protected VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging bezoekadresVestiging;
            @XmlElement(name = "CorrespondentieadresVestiging")
            protected VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging correspondentieadresVestiging;

            /**
             * Gets the value of the bezoekadresVestiging property.
             * 
             * @return
             *     possible object is
             *     {@link VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
             *     
             */
            public VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging getBezoekadresVestiging() {
                return bezoekadresVestiging;
            }

            /**
             * Sets the value of the bezoekadresVestiging property.
             * 
             * @param value
             *     allowed object is
             *     {@link VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging }
             *     
             */
            public void setBezoekadresVestiging(VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.BezoekadresVestiging value) {
                this.bezoekadresVestiging = value;
            }

            /**
             * Gets the value of the correspondentieadresVestiging property.
             * 
             * @return
             *     possible object is
             *     {@link VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
             *     
             */
            public VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging getCorrespondentieadresVestiging() {
                return correspondentieadresVestiging;
            }

            /**
             * Sets the value of the correspondentieadresVestiging property.
             * 
             * @param value
             *     allowed object is
             *     {@link VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging }
             *     
             */
            public void setCorrespondentieadresVestiging(VoertuigbezitInfoOrgResponse.OndernemingInst.VestigingOndernemingInst.CorrespondentieadresVestiging value) {
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
