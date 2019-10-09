package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
    public class AppConfig {

        @Bean(name = "movie1")
        public Movie movie1() {
            return new Movie(actor2());
        }
        @Bean(name = "moviePrototype")
        public Movie moviePrototype(){
            return new Movie(actorPrototype());
        }


        public Actor actor1() {
            return new Actor(30, "Ajay", "not defined");
        }
    @Bean
        public Actor actor2() {
            return new Actor(23, "woe", "not defined");
        }
        public Actor actor3() {
            return new Actor(36, "yes", "not defined");
        }
//    prototype
//
//    This scopes a single bean definition to have any number of object instances.
        @Bean
        @Scope("prototype")
        public Actor actorPrototype(){
            return new Actor(30, "Ajay", "not defined");
        }
    }

