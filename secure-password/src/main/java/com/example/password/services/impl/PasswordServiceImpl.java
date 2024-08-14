package com.example.password.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.password.services.PasswordService;

@Service
public class PasswordServiceImpl implements PasswordService {

	@Override
	public void validatePassword(String password) {
		if(password.length() < 8) {
			throw new RuntimeException("The password must be at least eight characters long!");
		
		} else if(!containsStringCase(password, password.toUpperCase())) {
			throw new RuntimeException("The password must contain at least one uppercase character!");
		
		} else if(!containsStringCase(password, password.toLowerCase())) {
			throw new RuntimeException("The password must contain at least one lowercase character!");
		
		} else if(!containsNumber(password)) {
			throw new RuntimeException("The password must contain at least one Number!");
			
		} else if(!containsSpeciaCharacter(password)) {
			throw new RuntimeException("The password must contain at least one Special Character!");
		}
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
