package com.example.beerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BeerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerServiceApplication.class, args);
    }

}
