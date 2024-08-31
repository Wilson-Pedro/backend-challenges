package com.example.usermc.web.apis;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.usermc.domain.records.Credentials;
import com.example.usermc.domain.records.Token;

@RequestMapping("/users")
public interface UserAPI {

	@PostMapping("/authenticate")
	ResponseEntity<Token> authenticate(@RequestBody Credentials credentials);
}
