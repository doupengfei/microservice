package com.dpf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class UsersProviderHystrixApplication_1004 {
	public static void main(String[] args) {
        SpringApplication.run(UsersProviderHystrixApplication_1004.class, args);
    }
}
