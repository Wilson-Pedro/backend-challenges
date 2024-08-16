package com.example.password.exceptionhandler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.password.domain.enums.PasswordValidation;
import com.example.password.services.exceptions.PasswordValidationException;

@ControllerAdvice
public class ApiExceptionHandler {
	
	@ExceptionHandler(PasswordValidationException.class)
	public ResponseEntity<ValidationError> passwordValidationErros(PasswordValidationException ex) {
		
		ValidationError validationError = new ValidationError();
		HttpStatus status = HttpStatus.BAD_REQUEST;
		List<Validation> validations = new ArrayList<>();
		
		for(PasswordValidation validation : ex.getPasswordValidation()) {
			validations.add(new Validation(validation));
		}
		
		validationError.setStatus(status);
		validationError.setStatusCode(status.value());
		validationError.setValidations(validations);

		
		return ResponseEntity.status(status).body(validationError);
		
	}
}
