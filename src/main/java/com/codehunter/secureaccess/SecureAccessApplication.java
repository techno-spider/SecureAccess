package com.codehunter.secureaccess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureAccessApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureAccessApplication.class, args);
		System.out.println("This is spring boot login app");
	}

}
