package com.example.password.exceptionhandler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ValidationError {

	private HttpStatus status;
	
	private Integer statusCode;
	
	private List<Validation> validations = new ArrayList<>();
	
	public ValidationError() {
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public List<Validation> getValidations() {
		return validations;
	}

	public void setValidations(List<Validation> validations) {
		this.validations = validations;
	}
}
