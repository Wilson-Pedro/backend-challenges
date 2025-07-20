package com.nubank.challenge.domain.dto;

import com.nubank.challenge.domain.entities.Contact;

public class ContactMindDto {

	private String phone;
	
	private String email;
	
	public ContactMindDto(Contact contact) {
		this.phone = contact.getPhone();
		this.email = contact.getEmail();
	}
	
	public ContactMindDto(ContactDto contactDto) {
		this.phone = contactDto.getPhone();
		this.email = contactDto.getEmail();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
