package com.frankieyao.springcore.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class UserAware implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("AC in UserAware: " + applicationContext);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name in UserAware: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory in UserAware: " + beanFactory);
    }

}
