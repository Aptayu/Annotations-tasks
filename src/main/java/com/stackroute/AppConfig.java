package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
    public class AppConfig {

    @Bean
    public BeanLifeCycleDemoBean BLdemobean(){
        return new BeanLifeCycleDemoBean();
    }
    }

