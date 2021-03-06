package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie3 = (Movie) factory.getBean("movie1");
        Movie movie2 = (Movie) factory.getBean("movie1");
        System.out.println(movie3==movie2);

        Movie movieprototype = (Movie) factory.getBean("moviePrototype");
        System.out.println(movieprototype==movie3);
    }
}
