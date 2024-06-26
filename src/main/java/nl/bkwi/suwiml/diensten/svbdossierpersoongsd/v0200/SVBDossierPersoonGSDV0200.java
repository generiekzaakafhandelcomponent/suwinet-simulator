
package nl.bkwi.suwiml.diensten.svbdossierpersoongsd.v0200;

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
@WebServiceClient(name = "SVBDossierPersoonGSD-v0200", targetNamespace = "http://bkwi.nl/SuwiML/Diensten/SVBDossierPersoonGSD/v0200", wsdlLocation = "file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/SVBDossierPersoonGSD/Diensten/SVBDossierPersoonGSD/v0200-b01/Impl/BKWI.wsdl")
public class SVBDossierPersoonGSDV0200
    extends Service
{

    private static final URL SVBDOSSIERPERSOONGSDV0200_WSDL_LOCATION;
    private static final WebServiceException SVBDOSSIERPERSOONGSDV0200_EXCEPTION;
    private static final QName SVBDOSSIERPERSOONGSDV0200_QNAME = new QName("http://bkwi.nl/SuwiML/Diensten/SVBDossierPersoonGSD/v0200", "SVBDossierPersoonGSD-v0200");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/paul/denhaag/suwitense/src/main/resources/suwinet/SVBDossierPersoonGSD/Diensten/SVBDossierPersoonGSD/v0200-b01/Impl/BKWI.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SVBDOSSIERPERSOONGSDV0200_WSDL_LOCATION = url;
        SVBDOSSIERPERSOONGSDV0200_EXCEPTION = e;
    }

    public SVBDossierPersoonGSDV0200() {
        super(__getWsdlLocation(), SVBDOSSIERPERSOONGSDV0200_QNAME);
    }

    public SVBDossierPersoonGSDV0200(WebServiceFeature... features) {
        super(__getWsdlLocation(), SVBDOSSIERPERSOONGSDV0200_QNAME, features);
    }

    public SVBDossierPersoonGSDV0200(URL wsdlLocation) {
        super(wsdlLocation, SVBDOSSIERPERSOONGSDV0200_QNAME);
    }

    public SVBDossierPersoonGSDV0200(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SVBDOSSIERPERSOONGSDV0200_QNAME, features);
    }

    public SVBDossierPersoonGSDV0200(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SVBDossierPersoonGSDV0200(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SVBInfo
     */
    @WebEndpoint(name = "BrokerProductie")
    public SVBInfo getBrokerProductie() {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/SVBDossierPersoonGSD/v0200", "BrokerProductie"), SVBInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SVBInfo
     */
    @WebEndpoint(name = "BrokerProductie")
    public SVBInfo getBrokerProductie(WebServiceFeature... features) {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/SVBDossierPersoonGSD/v0200", "BrokerProductie"), SVBInfo.class, features);
    }

    /**
     * 
     * @return
     *     returns SVBInfo
     */
    @WebEndpoint(name = "BrokerIntegratietest")
    public SVBInfo getBrokerIntegratietest() {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/SVBDossierPersoonGSD/v0200", "BrokerIntegratietest"), SVBInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SVBInfo
     */
    @WebEndpoint(name = "BrokerIntegratietest")
    public SVBInfo getBrokerIntegratietest(WebServiceFeature... features) {
        return super.getPort(new QName("http://bkwi.nl/SuwiML/Diensten/SVBDossierPersoonGSD/v0200", "BrokerIntegratietest"), SVBInfo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SVBDOSSIERPERSOONGSDV0200_EXCEPTION!= null) {
            throw SVBDOSSIERPERSOONGSDV0200_EXCEPTION;
        }
        return SVBDOSSIERPERSOONGSDV0200_WSDL_LOCATION;
    }

}
