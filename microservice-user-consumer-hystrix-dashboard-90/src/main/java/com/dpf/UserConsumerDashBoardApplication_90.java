package com.dpf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@SpringBootApplication
@EnableHystrixDashboard
public class UserConsumerDashBoardApplication_90 {
	public static void main(String[] args) {
        SpringApplication.run(UserConsumerDashBoardApplication_90.class, args);
    }
}
