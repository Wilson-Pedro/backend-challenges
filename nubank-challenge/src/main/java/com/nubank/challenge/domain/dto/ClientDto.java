package com.nubank.challenge.domain.dto;

import java.util.ArrayList;
import java.util.List;

import com.nubank.challenge.domain.entities.Client;
import com.nubank.challenge.domain.entities.Contact;

public class ClientDto {

	private Long id;
	
	private String name;
	
	private String cpf;
	
	private String gender;
	
	private List<ContactMindDto> contacts = new ArrayList<>();
	
	private String createdAt;
	
	public ClientDto() {
	}

	public ClientDto(Client client) {
		this.id = client.getId();
		this.name = client.getName();
		this.cpf = client.getCpf();
		this.gender = client.getGenderType().getGender();
		this.contacts = toMinDto(client.getContacts());
		this.createdAt = client.getCreatedAt();
	}
	
	private static List<ContactMindDto> toMinDto(List<Contact> list) {
		if(!list.isEmpty()) {
			return list.stream().map(ContactMindDto::new).toList();
		}
		return null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<ContactMindDto> getContacts() {
		return contacts;
	}

	public void setContacts(List<ContactMindDto> contacts) {
		this.contacts = contacts;
	}

	public String getCreatedAt() {
		return createdAt;
	}
}
