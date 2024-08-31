package com.example.usermc.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.usermc.domain.records.Credentials;
import com.example.usermc.services.UserService;
import com.example.usermc.web.apis.UserAPI;

@RestController
public class UserController implements UserAPI {
	
	@Autowired
	private UserService userService;

	@Override
	public ResponseEntity<String> authenticate(Credentials credentials) {
		return ResponseEntity.ok("OK");
	}
	
}
