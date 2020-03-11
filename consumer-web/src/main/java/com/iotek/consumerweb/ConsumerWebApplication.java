package com.iotek.consumerweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//@EnableCircuitBreaker
//@EnableEurekaClient
//@SpringBootApplication
@SpringCloudApplication
@EnableFeignClients
public class ConsumerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerWebApplication.class, args);
    }

}
