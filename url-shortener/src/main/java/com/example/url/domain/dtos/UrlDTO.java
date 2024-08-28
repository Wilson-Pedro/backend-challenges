package com.example.url.domain.dtos;

import java.io.Serializable;

import com.example.url.domain.URL;

public class UrlDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String url;
	
	private String urlShortener;
	
	
	public UrlDTO() {
	}
	
	public UrlDTO(URL url) {
		id = url.getId();
		this.url = url.getUrl();
		urlShortener = url.getUrlShortener();
	}
	
	public UrlDTO(Long id, String url, String urlShortener) {
		this.id = id;
		this.url = url;
		this.urlShortener = urlShortener;
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
}
