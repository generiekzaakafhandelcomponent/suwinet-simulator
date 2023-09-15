package com.ritense.suwitense.webservice.config;

import com.ritense.suwitense.webservice.endpoint.KadasterEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.SmartEndpointInterceptor;
import org.springframework.ws.server.endpoint.MethodEndpoint;

public class MyInterceptor implements SmartEndpointInterceptor {
    Logger logger = LoggerFactory.getLogger(MyInterceptor.class);
    @Override
    public boolean shouldIntercept(MessageContext messageContext, Object endpoint) {
        logger.info("shouldIntercept");
        if (endpoint instanceof MethodEndpoint) {
            MethodEndpoint methodEndpoint = (MethodEndpoint)endpoint;

            return methodEndpoint.getMethod().getDeclaringClass() == KadasterEndpoint.class;
        }
        return false;
    }
    
    @Override
    public boolean handleRequest(MessageContext messageContext, Object o) throws Exception {

        logger.info("handleRequest messageContext: " + messageContext.getRequest());
        if (o instanceof MethodEndpoint) {
            MethodEndpoint methodEndpoint = (MethodEndpoint) o;
        }
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext, Object o) throws Exception {
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext, Object o) throws Exception {
        return true;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Object o, Exception e) throws Exception {
    }
}