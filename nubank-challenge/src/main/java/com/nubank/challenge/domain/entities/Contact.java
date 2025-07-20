package com.nubank.challenge.domain.entities;

import org.hibernate.annotations.CreationTimestamp;

import com.nubank.challenge.domain.dto.ContactDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_CONCAT")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	private String phone;
	
	private String email;
	
	@CreationTimestamp
	private String createdAt;
	
	public Contact() {
	}

	public Contact(Long id, Client client, String phone, String email) {
		this.id = id;
		this.client = client;
		this.phone = phone;
		this.email = email;
	}
	
	public Contact(ContactDto contactDto) {
		this.phone = contactDto.getPhone();
		this.email = contactDto.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
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
