package com.tplnt.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TplntGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TplntGatewayApplication.class, args);
	}

}
