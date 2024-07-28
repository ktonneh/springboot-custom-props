package com.thexpertdev.orderapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({CustomProperties.class})
public class OrderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderAppApplication.class, args);
	}

}
