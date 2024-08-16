package com.example.password.exceptionhandler;

import com.example.password.domain.enums.PasswordValidation;

public class Validation {

	private String validation;
	
	private String description;
	
	public Validation (PasswordValidation passwordValidation) {
		this.validation = passwordValidation.getValidation();
		this.description = passwordValidation.getDescription();
	}

	public String getValidation() {
		return validation;
	}

	public void setValidation(String validation) {
		this.validation = validation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
