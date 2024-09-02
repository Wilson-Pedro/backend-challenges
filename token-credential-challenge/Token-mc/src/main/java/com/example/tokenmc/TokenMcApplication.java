package com.example.tokenmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TokenMcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokenMcApplication.class, args);
	}

}
