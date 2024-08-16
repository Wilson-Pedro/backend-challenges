package com.example.password.domain.enums;

public enum PasswordValidation {

	PASSWORD_LENGTH("Password Length", "The password must be at least eight characters long!"),
	UPPER_CASE("Upper Case", "The password must contain at least one uppercase character!"),
	LOWER_CASE("Lower Case", "The password must contain at least one lowercase character!"),
	NUMBER("Number", "The password must contain at least one Number!"),
	SPECIAL_CHARACTER("Special Character", "The password must contain at least one Special Character!");
	
	private String validation;
	private String description;
	
	private PasswordValidation (String validation, String description) {
		this.validation = validation;
		this.description = description;
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
