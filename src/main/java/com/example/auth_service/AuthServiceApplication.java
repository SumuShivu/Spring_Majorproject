package com.example.auth_service;

import com.example.auth_service.entity.UserType;
import com.example.auth_service.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}

	// ✅ STEP 8.6 TEMPORARY TEST CODE
	@Bean
	CommandLineRunner runner(UserService userService) {
		return args -> {
			userService.createUser(
					"admin@webtrak.com",
					"admin123",
					UserType.ADMIN
			);
		};
	}
}

