package com.frankieyao.createapplicationcontext.v2;

import org.springframework.aot.AotDetector;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext;
import org.springframework.boot.web.reactive.context.ReactiveWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class ReactiveWebServerACFactory implements ACFactory {

    @Override
    public ConfigurableApplicationContext create(WebApplicationType webApplicationType) {
        return (WebApplicationType.REACTIVE != webApplicationType) ? null : createContext();
    }

    private ConfigurableApplicationContext createContext() {
        if (!AotDetector.useGeneratedArtifacts()) {
            return new AnnotationConfigReactiveWebServerApplicationContext();
        }
        return new ReactiveWebServerApplicationContext();
    }
}
