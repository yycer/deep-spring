package com.frankieyao.createapplicationcontext.v2;

import org.springframework.boot.WebApplicationType;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public interface ACFactory {

    default ConfigurableEnvironment createEnvironment(WebApplicationType webApplicationType) {
        return null;
    }

    ConfigurableApplicationContext create(WebApplicationType webApplicationType);
}
