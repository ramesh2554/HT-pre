package com.marks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MarkDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarkDetailsApplication.class, args);
	}

}
