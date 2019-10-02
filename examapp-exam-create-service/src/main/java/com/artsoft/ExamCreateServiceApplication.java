package com.artsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ExamCreateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamCreateServiceApplication.class, args);
	}

}

