package com.example.password.services.exceptions;

import java.util.ArrayList;
import java.util.List;

import com.example.password.domain.enums.PasswordValidation;

public class PasswordValidationException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	List<PasswordValidation> passwordValidation = new ArrayList<>();

	public PasswordValidationException(List<PasswordValidation> passwordValidation) {
		super();
		this.passwordValidation = passwordValidation;
	}

	public List<PasswordValidation> getPasswordValidation() {
		return passwordValidation;
	}
} 
