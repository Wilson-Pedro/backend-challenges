package com.example.password.domain;

import java.io.Serializable;

public class Password implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String password;
	
	public Password() {
	}
	
	public Password(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
