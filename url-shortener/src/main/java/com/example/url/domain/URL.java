package com.example.url.domain;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_URL")
public class URL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String url;
	
	private String urlShortener;
	
	private Instant urlExpiration;
	
	public URL() {
	}
	
	public URL(Long id, String url, String urlShortener, Instant urlExpiration) {
		this.id = id;
		this.url = url;
		this.urlShortener = urlShortener;
		this.urlExpiration = urlExpiration;
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

	public String getUrlShortener() {
		return urlShortener;
	}

	public void setUrlShortener(String urlShortener) {
		this.urlShortener = urlShortener;
	}

	public Instant getUrlExpiration() {
		return urlExpiration;
	}

	public void setUrlExpiration(Instant urlExpiration) {
		this.urlExpiration = urlExpiration;
	}
}
