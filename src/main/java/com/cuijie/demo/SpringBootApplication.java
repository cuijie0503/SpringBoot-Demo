package com.cuijie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;


@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootApplication.class, args);

    }
    @Bean
    public Demo demo(){
        return new Demo();
    }
}
