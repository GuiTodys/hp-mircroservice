package com.microservice.hpmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HpmicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HpmicroserviceApplication.class, args);
    }

}
