package com.dpf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class UserConsumerApplication_80 {
	 public static void main(String[] args) {
	        SpringApplication.run(UserConsumerApplication_80.class,args);
	    }
}
