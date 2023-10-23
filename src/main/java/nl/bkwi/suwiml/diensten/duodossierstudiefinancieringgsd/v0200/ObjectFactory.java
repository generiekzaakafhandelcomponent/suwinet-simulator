
package nl.bkwi.suwiml.diensten.duodossierstudiefinancieringgsd.v0200;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.bkwi.suwiml.diensten.duodossierstudiefinancieringgsd.v0200 package. 
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

    private static final QName _DUOStudiefinancieringInfoResponseClientSuwi_QNAME = new QName("", "ClientSuwi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.bkwi.suwiml.diensten.duodossierstudiefinancieringgsd.v0200
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DUOStudiefinancieringInfoResponse }
     * 
     * @return
     *     the new instance of {@link DUOStudiefinancieringInfoResponse }
     */
    public DUOStudiefinancieringInfoResponse createDUOStudiefinancieringInfoResponse() {
        return new DUOStudiefinancieringInfoResponse();
    }

    /**
     * Create an instance of {@link DUOStudiefinancieringInfoResponse.ClientSuwi }
     * 
     * @return
     *     the new instance of {@link DUOStudiefinancieringInfoResponse.ClientSuwi }
     */
    public DUOStudiefinancieringInfoResponse.ClientSuwi createDUOStudiefinancieringInfoResponseClientSuwi() {
        return new DUOStudiefinancieringInfoResponse.ClientSuwi();
    }

    /**
     * Create an instance of {@link DUOStudiefinancieringInfo }
     * 
     * @return
     *     the new instance of {@link DUOStudiefinancieringInfo }
     */
    public DUOStudiefinancieringInfo createDUOStudiefinancieringInfo() {
        return new DUOStudiefinancieringInfo();
    }

    /**
     * Create an instance of {@link DUOStudiefinancieringInfoResponse.ClientSuwi.Studiefinanciering }
     * 
     * @return
     *     the new instance of {@link DUOStudiefinancieringInfoResponse.ClientSuwi.Studiefinanciering }
     */
    public DUOStudiefinancieringInfoResponse.ClientSuwi.Studiefinanciering createDUOStudiefinancieringInfoResponseClientSuwiStudiefinanciering() {
        return new DUOStudiefinancieringInfoResponse.ClientSuwi.Studiefinanciering();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DUOStudiefinancieringInfoResponse.ClientSuwi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DUOStudiefinancieringInfoResponse.ClientSuwi }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ClientSuwi", scope = DUOStudiefinancieringInfoResponse.class)
    public JAXBElement<DUOStudiefinancieringInfoResponse.ClientSuwi> createDUOStudiefinancieringInfoResponseClientSuwi(DUOStudiefinancieringInfoResponse.ClientSuwi value) {
        return new JAXBElement<>(_DUOStudiefinancieringInfoResponseClientSuwi_QNAME, DUOStudiefinancieringInfoResponse.ClientSuwi.class, DUOStudiefinancieringInfoResponse.class, value);
    }

}
