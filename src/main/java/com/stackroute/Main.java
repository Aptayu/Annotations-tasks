package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




//What are we doing here: we are creating objects of the classes without using the new keyword or say without changing the
//source code. For that we wither take the help of the xml file or we just need annotations help. Here, while taking the
//the help of annotations we need some configuration class and in it we need @bean to identify beans.

public class Main {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        BeanLifeCycleDemoBean BLdemobean = factory.getBean(BeanLifeCycleDemoBean.class);
        BLdemobean.customInit();
        BLdemobean.customDestroy();


    }
}
