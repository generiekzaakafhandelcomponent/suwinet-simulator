package com.ritense.suwitense.webservice.responseeditor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResponseEditorWebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/responses", "/responses/");
        registry.addViewController("/responses/").setViewName("forward:/responses/index.html");
    }
}
