package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.example.*")
public class JCloudConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(JCloudConsumerFeignApplication.class, args);
	}

}
