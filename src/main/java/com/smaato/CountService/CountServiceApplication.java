package com.smaato.CountService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountServiceApplication.class, args);
	}

}
