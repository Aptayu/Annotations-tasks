package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean destroyed");
    }

    public void customInit(){
        System.out.println("bean created");
    }
    public void customDestroy(){
        System.out.println("bean destroyed");
    }
}