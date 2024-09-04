package com.example.usermc.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.usermc.domain.records.Credentials;
import com.example.usermc.domain.records.Token;

@FeignClient(name = "Token-mc", url="http://localhost:8081")
public interface TokenService {

	@PostMapping("/tokens/generateToken")
	Token generateToken(Credentials credentials);
}
