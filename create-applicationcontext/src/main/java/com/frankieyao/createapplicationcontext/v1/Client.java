package com.frankieyao.createapplicationcontext.v1;

import org.springframework.boot.WebApplicationType;
import org.springframework.context.ConfigurableApplicationContext;

public class Client {
    public static void main(String[] args) {
        DefaultACFactoryV1 acFactory = new DefaultACFactoryV1();
        ConfigurableApplicationContext ac = acFactory.create(WebApplicationType.SERVLET);
        System.out.println(ac);
    }
}
