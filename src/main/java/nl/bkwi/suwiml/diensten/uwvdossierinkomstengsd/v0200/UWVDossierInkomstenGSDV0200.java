
package nl.bkwi.suwiml.diensten.uwvdossierinkomstengsd.v0200;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "UWVDossierInkomstenGSD-v0200", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200", wsdlLocation = "file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/Diensten/UWVDossierInkomstenGSD/v0200-b02/Impl/BKWI.wsdl")
public class UWVDossierInkomstenGSDV0200
    extends Service
{

    private static final URL UWVDOSSIERINKOMSTENGSDV0200_WSDL_LOCATION;
    private static final WebServiceException UWVDOSSIERINKOMSTENGSDV0200_EXCEPTION;
    private static final QName UWVDOSSIERINKOMSTENGSDV0200_QNAME = new QName("http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200", "UWVDossierInkomstenGSD-v0200");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/Diensten/UWVDossierInkomstenGSD/v0200-b02/Impl/BKWI.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UWVDOSSIERINKOMSTENGSDV0200_WSDL_LOCATION = url;
        UWVDOSSIERINKOMSTENGSDV0200_EXCEPTION = e;
    }

    public UWVDossierInkomstenGSDV0200() {
        super(__getWsdlLocation(), UWVDOSSIERINKOMSTENGSDV0200_QNAME);
    }

    public UWVDossierInkomstenGSDV0200(WebServiceFeature... features) {
        super(__getWsdlLocation(), UWVDOSSIERINKOMSTENGSDV0200_QNAME, features);
    }

    public UWVDossierInkomstenGSDV0200(URL wsdlLocation) {
        super(wsdlLocation, UWVDOSSIERINKOMSTENGSDV0200_QNAME);
    }

    public UWVDossierInkomstenGSDV0200(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UWVDOSSIERINKOMSTENGSDV0200_QNAME, features);
    }

    public UWVDossierInkomstenGSDV0200(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UWVDossierInkomstenGSDV0200(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UWVIkvInfo
     */
    @WebEndpoint(name = "BrokerProductie")
    public UWVIkvInfo getBrokerProductie() {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200", "BrokerProductie"), UWVIkvInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UWVIkvInfo
     */
    @WebEndpoint(name = "BrokerProductie")
    public UWVIkvInfo getBrokerProductie(WebServiceFeature... features) {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200", "BrokerProductie"), UWVIkvInfo.class, features);
    }

    /**
     * 
     * @return
     *     returns UWVIkvInfo
     */
    @WebEndpoint(name = "BrokerIntegratietest")
    public UWVIkvInfo getBrokerIntegratietest() {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200", "BrokerIntegratietest"), UWVIkvInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UWVIkvInfo
     */
    @WebEndpoint(name = "BrokerIntegratietest")
    public UWVIkvInfo getBrokerIntegratietest(WebServiceFeature... features) {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/UWVDossierInkomstenGSD/v0200", "BrokerIntegratietest"), UWVIkvInfo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UWVDOSSIERINKOMSTENGSDV0200_EXCEPTION!= null) {
            throw UWVDOSSIERINKOMSTENGSDV0200_EXCEPTION;
        }
        return UWVDOSSIERINKOMSTENGSDV0200_WSDL_LOCATION;
    }

}
