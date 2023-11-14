package com.ritense.suwitense.webservice.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.xml.xsd.XsdSchemaCollection;
import org.springframework.xml.xsd.commons.CommonsXsdSchemaCollection;

import java.util.List;

@EnableWs
@Configuration
public class SVBDossierPersoonGSDWebServiceConfig extends WsConfigurerAdapter {
    Logger logger = LoggerFactory.getLogger(SVBDossierPersoonGSDWebServiceConfig.class);

    @Value("${classpath:suwinet/SVBDossierPersoonGSD/Diensten/SVBDossierPersoonGSD/v0200-b01/Body*.xsd}")
    private Resource[] dienstenResources;

    @Bean
    public XsdSchemaCollection getSVBDossierPersoonGSD() {
        CommonsXsdSchemaCollection xsds = new CommonsXsdSchemaCollection(dienstenResources);
        xsds.setInline(true);
        return xsds;
    }

    @Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {
        logger.info("SVBDossierPersoonGSD WebServiceConfig adding PayloadValidatingInterceptor");
        PayloadValidatingInterceptor validatingInterceptor = new PayloadValidatingInterceptor();
        validatingInterceptor.setValidateRequest(false);
        validatingInterceptor.setValidateResponse(false);
        try {
            validatingInterceptor.setXsdSchemaCollection(getSVBDossierPersoonGSD());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        interceptors.add(validatingInterceptor);
    }

    @Bean(name = "SVBDossierPersoonGSD")
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/SVBDossierPersoonGSD-v0200/*");
    }
}