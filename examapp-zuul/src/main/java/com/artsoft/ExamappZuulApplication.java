package com.artsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ExamappZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamappZuulApplication.class, args);
	}

}
