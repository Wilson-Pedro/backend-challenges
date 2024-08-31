package com.example.usermc.services.impl;

import org.springframework.stereotype.Service;

import com.example.usermc.domain.records.Credentials;
import com.example.usermc.domain.records.Token;
import com.example.usermc.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public Token authenticateCredentials(Credentials credentials) {
		String username = credentials.username(), password = credentials.password();
		if(!username.toUpperCase().equals(password)) return new Token("Username or Password invalid!");
		return new Token(username);
	}

}
