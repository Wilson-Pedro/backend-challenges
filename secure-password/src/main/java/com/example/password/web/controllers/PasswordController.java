package com.example.password.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.password.domain.Password;
import com.example.password.services.PasswordService;
import com.example.password.web.apis.PasswordAPI;

@RestController
public class PasswordController implements PasswordAPI {
	
	@Autowired
	PasswordService passwordService;

	@Override
	public ResponseEntity<Object> validatePassword(Password password) {
		return null;
	}

}
