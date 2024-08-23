package com.example.url.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.url.services.exceptions.ExistingUrlException;

@ControllerAdvice
public class ApiExceptionHandler {

	@ExceptionHandler(ExistingUrlException.class)
	public ResponseEntity<Problam> existingUrlException() {
		
		HttpStatus status = HttpStatus.BAD_REQUEST;
		
		Problam problam = new Problam();
		problam.setTitle("This URL already has a shortened URL.");
		problam.setStatusCode(status.value());
		problam.setSugestion("Please, use another URL that does not have a shortened URL.");
		
		return ResponseEntity.status(status).body(problam);
	}
}
