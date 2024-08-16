package com.example.password.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.password.domain.enums.PasswordValidation;
import com.example.password.services.PasswordService;
import com.example.password.services.exceptions.PasswordValidationException;

@Service
public class PasswordServiceImpl implements PasswordService {

	@Override
	public void validatePassword(String password) {
		List<PasswordValidation> validations = getValidations(password);
		if(!validations.isEmpty()) throw new PasswordValidationException(validations);
	}
	
	@Override
	public List<PasswordValidation> getValidations(String password) {
		List<PasswordValidation> validations = new ArrayList<>();
		if(password.length() < 8) {
			validations.add(PasswordValidation.PASSWORD_LENGTH);
			
		} if(!containsStringCase(password, password.toUpperCase())) {
			validations.add(PasswordValidation.UPPER_CASE);
			
		} if(!containsStringCase(password, password.toLowerCase())) {
			validations.add(PasswordValidation.LOWER_CASE);
			
		} if(!containsNumber(password)) {
			validations.add(PasswordValidation.NUMBER);
			
		} if(!containsSpeciaCharacter(password)) {
			validations.add(PasswordValidation.SPECIAL_CHARACTER);
		}
		
		return validations;
	}

	private boolean containsStringCase(String password, String stringCase) {
		boolean containsStringCase = false;
		for(int i = 0; i < password.length(); i++) {
			if(password.charAt(i) == stringCase.charAt(i)) {
				containsStringCase = true;
			}
		}
		return containsStringCase;
	}
	
	private boolean containsNumber(String password) {
		List<String> numbers = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
		boolean containsNumber = false;
		for(int i = 0; i < numbers.size(); i++) {
			if(password.indexOf(numbers.get(i)) != -1) {
				containsNumber = true;
			}
		}
		return containsNumber;
	}
	
	private boolean containsSpeciaCharacter(String password) {
		List<String> numbers = List.of("!", "@", "#", "$", "%", "¨", "&", "*", "(", ")", ".", ",");
		boolean containsNumber = false;
		for(int i = 0; i < numbers.size(); i++) {
			if(password.indexOf(numbers.get(i)) != -1) {
				containsNumber = true;
			}
		}
		return containsNumber;
	}
	
//	private boolean containsNumberOrSpecialCharacter(String password) {
//		// TODO Auto-generated method stub
//		return false;
//	}
}
