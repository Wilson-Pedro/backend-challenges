package com.example.url.domain;

import com.example.url.domain.dtos.UrlDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_URL")
public class UrlRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String url;
	
	public UrlRequest() {
	}
	
	public UrlRequest(Long id, String url) {
		this.id = id;
		this.url = url;
	}
	
	public UrlRequest(UrlDTO urlDto) {
		this.url = urlDto.getUrl();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
