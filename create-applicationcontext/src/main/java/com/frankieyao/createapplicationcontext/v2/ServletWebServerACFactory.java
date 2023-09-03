package com.frankieyao.createapplicationcontext.v2;

import org.springframework.aot.AotDetector;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class ServletWebServerACFactory implements ACFactory {
    @Override
    public ConfigurableApplicationContext create(WebApplicationType webApplicationType) {
        return (WebApplicationType.SERVLET != webApplicationType) ? null : createContext();
    }

    private ConfigurableApplicationContext createContext() {
        if (!AotDetector.useGeneratedArtifacts()) {
            return new AnnotationConfigServletWebServerApplicationContext();
        }
        return new ServletWebServerApplicationContext();
    }
}
