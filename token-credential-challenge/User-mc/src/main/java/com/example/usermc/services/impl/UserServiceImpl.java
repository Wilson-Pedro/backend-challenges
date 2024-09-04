package com.example.usermc.services.impl;

import org.springframework.stereotype.Service;

import com.example.usermc.domain.records.Credentials;
import com.example.usermc.services.UserService;
import com.example.usermc.services.exceptions.AuthenticationException;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void authenticateCredentials(Credentials credentials) {
		String username = credentials.username(), password = credentials.password();
		if(!username.toUpperCase().equals(password)) throw new AuthenticationException();
	}

}
