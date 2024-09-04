package com.example.usermc.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.usermc.services.exceptions.AuthenticationException;

@ControllerAdvice
public class ApiExceptionHandler {
	
	@ExceptionHandler(AuthenticationException.class)
	public ResponseEntity<Problam> authenticationException() {
		
		HttpStatus status = HttpStatus.BAD_REQUEST;
		
		Problam problam = new Problam();
		problam.setTitle("Username or Password invalid!");
		problam.setStatusCode(status.value());
		
		return ResponseEntity.status(status).body(problam);
	}

}
