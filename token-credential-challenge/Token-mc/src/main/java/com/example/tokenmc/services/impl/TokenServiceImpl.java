package com.example.tokenmc.services.impl;

import java.time.Instant;

import org.springframework.stereotype.Service;

import com.example.tokenmc.domain.Credentials;
import com.example.tokenmc.domain.Token;
import com.example.tokenmc.services.TokenService;

@Service
public class TokenServiceImpl implements TokenService {
	
	@Override
	public Token generateToken(Credentials credentials) {
		String token = credentials.username() + "_" + Instant.now();
		return new Token(token);
	}
}
