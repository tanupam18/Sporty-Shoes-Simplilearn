package com.company.name.shoes.sporty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SportShoe {

	public static void main(String[] args) {
		SpringApplication.run(SportShoe.class, args);

	}

}
