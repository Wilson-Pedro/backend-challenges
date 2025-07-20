package com.nubank.challenge.domain.entities;

import org.hibernate.annotations.CreationTimestamp;

import com.nubank.challenge.domain.dto.ClientDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_CLIENT")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String cpf;
	
	private String gender;
	
	@CreationTimestamp
	private String createdAt;
	
	public Client() {
	}

	public Client(Long id, String name, String cpf, String gender, String createdAt) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.gender = gender;
		this.createdAt = createdAt;
	}
	
	public Client(ClientDto clientDto) {
		this.name = clientDto.getName();
		this.cpf = clientDto.getCpf();
		this.gender = clientDto.getGender();
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
