
package nl.bkwi.suwiml.fwi.v0205;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.bkwi.suwiml.fwi.v0205 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {
    private static final QName _NietsGevonden_QNAME = new QName("http://bkwi.nl/SuwiML/FWI/v0205", "NietsGevonden");
    private static final QName _Fout_QNAME = new QName("http://bkwi.nl/SuwiML/FWI/v0205", "Fout");
    private static final QName _NietGerechtigd_QNAME = new QName("http://bkwi.nl/SuwiML/FWI/v0205", "NietGerechtigd");
    private static final QName _NietVanToepassing_QNAME = new QName("http://bkwi.nl/SuwiML/FWI/v0205", "NietVanToepassing");
    private static final QName _FWIFout_QNAME = new QName("", "Fout");
    private static final QName _FWIWaarschuwing_QNAME = new QName("", "Waarschuwing");
    private static final QName _FWIInformatie_QNAME = new QName("", "Informatie");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.bkwi.suwiml.fwi.v0205
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Melding }
     * 
     * @return
     *     the new instance of {@link Melding }
     */
    public Melding createMelding() {
        return new Melding();
    }

    /**
     * Create an instance of {@link FWI }
     * 
     * @return
     *     the new instance of {@link FWI }
     */
    public FWI createFWI() {
        return new FWI();
    }

    /**
     * Create an instance of {@link Melding.Bron }
     * 
     * @return
     *     the new instance of {@link Melding.Bron }
     */
    public Melding.Bron createMeldingBron() {
        return new Melding.Bron();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://bkwi.nl/SuwiML/FWI/v0205", name = "NietsGevonden")
    public JAXBElement<Object> createNietsGevonden(Object value) {
        return new JAXBElement<>(_NietsGevonden_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Melding }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Melding }{@code >}
     */
    @XmlElementDecl(namespace = "http://bkwi.nl/SuwiML/FWI/v0205", name = "Fout")
    public JAXBElement<Melding> createFout(Melding value) {
        return new JAXBElement<>(_Fout_QNAME, Melding.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://bkwi.nl/SuwiML/FWI/v0205", name = "NietGerechtigd")
    public JAXBElement<Object> createNietGerechtigd(Object value) {
        return new JAXBElement<>(_NietGerechtigd_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://bkwi.nl/SuwiML/FWI/v0205", name = "NietVanToepassing")
    public JAXBElement<Object> createNietVanToepassing(Object value) {
        return new JAXBElement<>(_NietVanToepassing_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Melding }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Melding }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Fout", scope = FWI.class)
    public JAXBElement<Melding> createFWIFout(Melding value) {
        return new JAXBElement<>(_FWIFout_QNAME, Melding.class, FWI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Melding }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Melding }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Waarschuwing", scope = FWI.class)
    public JAXBElement<Melding> createFWIWaarschuwing(Melding value) {
        return new JAXBElement<>(_FWIWaarschuwing_QNAME, Melding.class, FWI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Melding }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Melding }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Informatie", scope = FWI.class)
    public JAXBElement<Melding> createFWIInformatie(Melding value) {
        return new JAXBElement<>(_FWIInformatie_QNAME, Melding.class, FWI.class, value);
    }

}
