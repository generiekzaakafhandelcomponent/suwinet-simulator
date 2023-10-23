
package nl.bkwi.suwiml.diensten.duodossierpersoongsd.v0300;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import nl.bkwi.suwiml.fwi.v0205.FWI;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.bkwi.suwiml.diensten.duodossierpersoongsd.v0300 package. 
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

    private static final QName _FWI_QNAME = new QName("http://bkwi.nl/SuwiML/FWI/v0205", "FWI");

    private static final QName _DUOPersoonsInfoResponseClientSuwi_QNAME = new QName("", "ClientSuwi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.bkwi.suwiml.diensten.duodossierpersoongsd.v0300
     * 
     */
    public ObjectFactory() {
    }

    @XmlElementDecl(namespace = "http://bkwi.nl/SuwiML/FWI/v0205", name = "FWI")
    public JAXBElement<FWI> createFWI(FWI value) {
        return new JAXBElement<>(_FWI_QNAME, FWI.class, null, value);
    }

    /**
     * Create an instance of {@link DUOPersoonsInfoResponse }
     * 
     * @return
     *     the new instance of {@link DUOPersoonsInfoResponse }
     */
    public DUOPersoonsInfoResponse createDUOPersoonsInfoResponse() {
        return new DUOPersoonsInfoResponse();
    }

    /**
     * Create an instance of {@link DUOPersoonsInfoResponse.ClientSuwi }
     * 
     * @return
     *     the new instance of {@link DUOPersoonsInfoResponse.ClientSuwi }
     */
    public DUOPersoonsInfoResponse.ClientSuwi createDUOPersoonsInfoResponseClientSuwi() {
        return new DUOPersoonsInfoResponse.ClientSuwi();
    }

    /**
     * Create an instance of {@link DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst }
     * 
     * @return
     *     the new instance of {@link DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst }
     */
    public DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst createDUOPersoonsInfoResponseClientSuwiOnderwijsovereenkomst() {
        return new DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst();
    }

    /**
     * Create an instance of {@link DUOPersoonsInfo }
     * 
     * @return
     *     the new instance of {@link DUOPersoonsInfo }
     */
    public DUOPersoonsInfo createDUOPersoonsInfo() {
        return new DUOPersoonsInfo();
    }

    /**
     * Create an instance of {@link Beroepspraktijkovereenkomst }
     * 
     * @return
     *     the new instance of {@link Beroepspraktijkovereenkomst }
     */
    public Beroepspraktijkovereenkomst createBeroepspraktijkovereenkomst() {
        return new Beroepspraktijkovereenkomst();
    }

    /**
     * Create an instance of {@link InhoudOpleidingDuo }
     * 
     * @return
     *     the new instance of {@link InhoudOpleidingDuo }
     */
    public InhoudOpleidingDuo createInhoudOpleidingDuo() {
        return new InhoudOpleidingDuo();
    }

    /**
     * Create an instance of {@link InhoudVak }
     * 
     * @return
     *     the new instance of {@link InhoudVak }
     */
    public InhoudVak createInhoudVak() {
        return new InhoudVak();
    }

    /**
     * Create an instance of {@link Brin }
     * 
     * @return
     *     the new instance of {@link Brin }
     */
    public Brin createBrin() {
        return new Brin();
    }

    /**
     * Create an instance of {@link ResultaatExamen }
     * 
     * @return
     *     the new instance of {@link ResultaatExamen }
     */
    public ResultaatExamen createResultaatExamen() {
        return new ResultaatExamen();
    }

    /**
     * Create an instance of {@link DUOPersoonsInfoResponse.ClientSuwi.ResultaatOpleidingGeregistrDuo }
     * 
     * @return
     *     the new instance of {@link DUOPersoonsInfoResponse.ClientSuwi.ResultaatOpleidingGeregistrDuo }
     */
    public DUOPersoonsInfoResponse.ClientSuwi.ResultaatOpleidingGeregistrDuo createDUOPersoonsInfoResponseClientSuwiResultaatOpleidingGeregistrDuo() {
        return new DUOPersoonsInfoResponse.ClientSuwi.ResultaatOpleidingGeregistrDuo();
    }

    /**
     * Create an instance of {@link DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst.DeelnameOpleidingGeregistrDuo }
     * 
     * @return
     *     the new instance of {@link DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst.DeelnameOpleidingGeregistrDuo }
     */
    public DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst.DeelnameOpleidingGeregistrDuo createDUOPersoonsInfoResponseClientSuwiOnderwijsovereenkomstDeelnameOpleidingGeregistrDuo() {
        return new DUOPersoonsInfoResponse.ClientSuwi.Onderwijsovereenkomst.DeelnameOpleidingGeregistrDuo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DUOPersoonsInfoResponse.ClientSuwi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DUOPersoonsInfoResponse.ClientSuwi }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ClientSuwi", scope = DUOPersoonsInfoResponse.class)
    public JAXBElement<DUOPersoonsInfoResponse.ClientSuwi> createDUOPersoonsInfoResponseClientSuwi(DUOPersoonsInfoResponse.ClientSuwi value) {
        return new JAXBElement<>(_DUOPersoonsInfoResponseClientSuwi_QNAME, DUOPersoonsInfoResponse.ClientSuwi.class, DUOPersoonsInfoResponse.class, value);
    }

}
