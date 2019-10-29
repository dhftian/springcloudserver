package com.bjsxt.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudOrderProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudOrderProviderApplication.class, args);
	}
}
