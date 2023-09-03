package com.frankieyao.createapplicationcontext.v2;

import org.springframework.aot.AotDetector;
import org.springframework.boot.WebApplicationType;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class DefaultACFactory implements ACFactory {
    @Override
    public ConfigurableApplicationContext create(WebApplicationType webApplicationType) {
        return getFromSpringFactories(webApplicationType, ACFactory::create, this::createDefaultAC);
    }
    private <T> T getFromSpringFactories(WebApplicationType webApplicationType,
                                         BiFunction<ACFactory, WebApplicationType, T> action,
                                         Supplier<T> defaultResult) {
        for (ACFactory candidate : mockACFactoryList()) {
            T result = action.apply(candidate, webApplicationType);
            if (result != null) {
                return result;
            }
        }
        return (defaultResult != null) ? defaultResult.get() : null;
    }

    private ConfigurableApplicationContext createDefaultAC() {
        if (!AotDetector.useGeneratedArtifacts()) {
            return new AnnotationConfigApplicationContext();
        }
        return new GenericApplicationContext();
    }

    private List<ACFactory> mockACFactoryList() {
        return new ArrayList<>(Arrays.asList(new ReactiveWebServerACFactory(), new ServletWebServerACFactory()));
    }
}
