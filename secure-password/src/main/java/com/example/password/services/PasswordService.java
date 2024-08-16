package com.example.password.services;

import java.util.List;

import com.example.password.domain.enums.PasswordValidation;

public interface PasswordService {
	
	void validatePassword(String password);
	
	List<PasswordValidation> getValidations(String password);

}
