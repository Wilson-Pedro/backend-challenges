package com.example.usermc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserMcApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMcApplication.class, args);
	}

}
