package com.springcloud.eureka.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {


    public static void main(String[] args) {
        RestTemplate restTemplate=new RestTemplate();

        SpringApplication.run(EurekaserverApplication.class, args);
    }

}
