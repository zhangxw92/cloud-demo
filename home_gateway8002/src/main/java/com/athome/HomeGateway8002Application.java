package com.athome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HomeGateway8002Application {

    public static void main(String[] args) {
        SpringApplication.run(HomeGateway8002Application.class, args);
    }

}
