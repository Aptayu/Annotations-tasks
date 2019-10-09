package com.stackroute;

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
        Movie movie3 = (Movie) factory.getBean("movie2");
        Movie movie2 = (Movie) factory.getBean("movie2");
        System.out.println(movie3==movie2);
//        difference here is prototype creates a new object but upper two lines only created one object and second object
//        is only reference to the first object.

//        Movie movieprototype = (Movie) factory.getBean("moviePrototype");
//        System.out.println(movieprototype==movie3);
        Actor actor = factory.getBean(Actor.class);
        System.out.println(actor);
//        To see what bean name we have we need to implement beanNameAware interface in our main class.
        System.out.println(movie3.getBeanName());

    }
}
