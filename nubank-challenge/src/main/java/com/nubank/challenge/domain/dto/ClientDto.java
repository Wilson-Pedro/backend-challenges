package com.nubank.challenge.domain.dto;

import com.nubank.challenge.domain.entities.Client;

public class ClientDto {

	private Long id;
	
	private String name;
	
	private String cpf;
	
	private String gender;
	
	private String createdAt;
	
	public ClientDto() {
	}

	public ClientDto(Client client) {
		this.id = client.getId();
		this.name = client.getName();
		this.cpf = client.getCpf();
		this.gender = client.getGenderType().getGender();
		this.createdAt = client.getCreatedAt();
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

	public String getCreatedAt() {
		return createdAt;
	}
}
