package com.example.tokenmc.web.apis;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.tokenmc.domain.Credentials;
import com.example.tokenmc.domain.Token;

@RequestMapping("/tokens")
public interface TokenAPI {

	@PostMapping(produces="application/json", path="/generateToken")
	Token generateToken(@RequestBody Credentials username);
}
