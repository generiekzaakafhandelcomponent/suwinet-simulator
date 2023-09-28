
package nl.bkwi.suwiml.diensten.brpdossierpersoongsd.v0200;

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
@WebServiceClient(name = "BRPDossierPersoonGSD-v0200", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200", wsdlLocation = "file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/BRPDossierPersoonGSD/Diensten/BRPDossierPersoonGSD/v0200-b02/Impl/BKWI.wsdl")
public class BRPDossierPersoonGSDV0200
    extends Service
{

    private static final URL BRPDOSSIERPERSOONGSDV0200_WSDL_LOCATION;
    private static final WebServiceException BRPDOSSIERPERSOONGSDV0200_EXCEPTION;
    private static final QName BRPDOSSIERPERSOONGSDV0200_QNAME = new QName("http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200", "BRPDossierPersoonGSD-v0200");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/BRPDossierPersoonGSD/Diensten/BRPDossierPersoonGSD/v0200-b02/Impl/BKWI.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BRPDOSSIERPERSOONGSDV0200_WSDL_LOCATION = url;
        BRPDOSSIERPERSOONGSDV0200_EXCEPTION = e;
    }

    public BRPDossierPersoonGSDV0200() {
        super(__getWsdlLocation(), BRPDOSSIERPERSOONGSDV0200_QNAME);
    }

    public BRPDossierPersoonGSDV0200(WebServiceFeature... features) {
        super(__getWsdlLocation(), BRPDOSSIERPERSOONGSDV0200_QNAME, features);
    }

    public BRPDossierPersoonGSDV0200(URL wsdlLocation) {
        super(wsdlLocation, BRPDOSSIERPERSOONGSDV0200_QNAME);
    }

    public BRPDossierPersoonGSDV0200(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BRPDOSSIERPERSOONGSDV0200_QNAME, features);
    }

    public BRPDossierPersoonGSDV0200(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BRPDossierPersoonGSDV0200(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BRPInfo
     */
    @WebEndpoint(name = "BrokerProductie")
    public BRPInfo getBrokerProductie() {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200", "BrokerProductie"), BRPInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BRPInfo
     */
    @WebEndpoint(name = "BrokerProductie")
    public BRPInfo getBrokerProductie(WebServiceFeature... features) {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200", "BrokerProductie"), BRPInfo.class, features);
    }

    /**
     * 
     * @return
     *     returns BRPInfo
     */
    @WebEndpoint(name = "BrokerIntegratieTest")
    public BRPInfo getBrokerIntegratieTest() {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200", "BrokerIntegratieTest"), BRPInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BRPInfo
     */
    @WebEndpoint(name = "BrokerIntegratieTest")
    public BRPInfo getBrokerIntegratieTest(WebServiceFeature... features) {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/BRPDossierPersoonGSD/v0200", "BrokerIntegratieTest"), BRPInfo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BRPDOSSIERPERSOONGSDV0200_EXCEPTION!= null) {
            throw BRPDOSSIERPERSOONGSDV0200_EXCEPTION;
        }
        return BRPDOSSIERPERSOONGSDV0200_WSDL_LOCATION;
    }

}