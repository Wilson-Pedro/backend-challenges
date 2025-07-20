package com.nubank.challenge.domain.dto;

import com.nubank.challenge.domain.entities.Contact;

public class ContactDto {

	private Long id;
	
	private Long clientId;
	
	private String phone;
	
	private String email;
	
	private String createdAt;
	
	public ContactDto() {
	}

	public ContactDto(Contact contact) {
		this.id = contact.getId();
		this.clientId = contact.getClient().getId();
		this.phone = contact.getPhone();
		this.email = contact.getEmail();
		this.createdAt = contact.getCreatedAt();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
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

	public String getCreatedAt() {
		return createdAt;
	}
}
