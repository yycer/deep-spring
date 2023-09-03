package com.frankieyao.createapplicationcontext.v1;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class DefaultACFactoryV1 {

    public ConfigurableApplicationContext create(WebApplicationType webApplicationType) {
        return switch (webApplicationType) {
            case REACTIVE -> new AnnotationConfigReactiveWebServerApplicationContext();
            case SERVLET -> new AnnotationConfigServletWebServerApplicationContext();
            default -> new GenericApplicationContext();
        };
    }
}
