package com.frankieyao.createapplicationcontext.v2;

import org.springframework.boot.WebApplicationType;
import org.springframework.context.ConfigurableApplicationContext;

public class Client {
    public static void main(String[] args) {
        DefaultACFactory acFactory = new DefaultACFactory();
        ConfigurableApplicationContext ac = acFactory.create(WebApplicationType.SERVLET);
        System.out.println(ac);
    }
}
