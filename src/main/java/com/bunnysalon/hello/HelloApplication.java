package com.bunnysalon.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		System.out.println("Application is starting...");
		SpringApplication.run(HelloApplication.class, args);
	}
}
