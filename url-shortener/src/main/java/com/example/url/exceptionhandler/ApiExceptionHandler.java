package com.example.url.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.url.services.exceptions.ExistingUrlException;
import com.example.url.services.exceptions.UrlNotFoundException;

@ControllerAdvice
public class ApiExceptionHandler {

	@ExceptionHandler(ExistingUrlException.class)
	public ResponseEntity<Problam> existingUrlException(ExistingUrlException ex) {
		
		HttpStatus status = HttpStatus.BAD_REQUEST;
		
		Problam problam = new Problam();
		problam.setTitle("This URL already has a shortened URL. UrlShortener: " + ex.getUrlShortener());
		problam.setStatusCode(status.value());
		problam.setSugestion("Please, use another URL that does not have a shortened URL.");
		
		return ResponseEntity.status(status).body(problam);
	}
	
	@ExceptionHandler(UrlNotFoundException.class)
	public ResponseEntity<Problam> urlNotFoundException() {
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		Problam problam = new Problam();
		problam.setTitle("Not Found Url");
		problam.setStatusCode(status.value());
		problam.setSugestion("Please, check if this URL is correct or if it is already registered.");
		
		return ResponseEntity.status(status).body(problam);
	}
}
