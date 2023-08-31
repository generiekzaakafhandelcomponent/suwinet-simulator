
package nl.bkwi.suwiml.diensten.kadasterdossiergsd.v0300;

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
@WebServiceClient(name = "KadasterDossierGSD-v0300", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300", wsdlLocation = "file:/Users/paul/tmp/suwitense/src/main/resources/suwinet/Diensten/KadasterDossierGSD/v0300-b02/Impl/BKWI.wsdl")
public class KadasterDossierGSDV0300
    extends Service
{

    private static final URL KADASTERDOSSIERGSDV0300_WSDL_LOCATION;
    private static final WebServiceException KADASTERDOSSIERGSDV0300_EXCEPTION;
    private static final QName KADASTERDOSSIERGSDV0300_QNAME = new QName("http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300", "KadasterDossierGSD-v0300");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/paul/tmp/suwitense/src/main/resources/suwinet/Diensten/KadasterDossierGSD/v0300-b02/Impl/BKWI.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        KADASTERDOSSIERGSDV0300_WSDL_LOCATION = url;
        KADASTERDOSSIERGSDV0300_EXCEPTION = e;
    }

    public KadasterDossierGSDV0300() {
        super(__getWsdlLocation(), KADASTERDOSSIERGSDV0300_QNAME);
    }

    public KadasterDossierGSDV0300(WebServiceFeature... features) {
        super(__getWsdlLocation(), KADASTERDOSSIERGSDV0300_QNAME, features);
    }

    public KadasterDossierGSDV0300(URL wsdlLocation) {
        super(wsdlLocation, KADASTERDOSSIERGSDV0300_QNAME);
    }

    public KadasterDossierGSDV0300(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, KADASTERDOSSIERGSDV0300_QNAME, features);
    }

    public KadasterDossierGSDV0300(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public KadasterDossierGSDV0300(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns KadasterInfo
     */
    @WebEndpoint(name = "BrokerProductie")
    public KadasterInfo getBrokerProductie() {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300", "BrokerProductie"), KadasterInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KadasterInfo
     */
    @WebEndpoint(name = "BrokerProductie")
    public KadasterInfo getBrokerProductie(WebServiceFeature... features) {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300", "BrokerProductie"), KadasterInfo.class, features);
    }

    /**
     * 
     * @return
     *     returns KadasterInfo
     */
    @WebEndpoint(name = "BrokerIntegratietest")
    public KadasterInfo getBrokerIntegratietest() {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300", "BrokerIntegratietest"), KadasterInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KadasterInfo
     */
    @WebEndpoint(name = "BrokerIntegratietest")
    public KadasterInfo getBrokerIntegratietest(WebServiceFeature... features) {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/KadasterDossierGSD/v0300", "BrokerIntegratietest"), KadasterInfo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (KADASTERDOSSIERGSDV0300_EXCEPTION!= null) {
            throw KADASTERDOSSIERGSDV0300_EXCEPTION;
        }
        return KADASTERDOSSIERGSDV0300_WSDL_LOCATION;
    }

}