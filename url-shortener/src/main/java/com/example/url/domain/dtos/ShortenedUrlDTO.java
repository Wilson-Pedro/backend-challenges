package com.example.url.domain.dtos;

public class ShortenedUrlDTO {

	private String shortenedUrl;
	
	public ShortenedUrlDTO() {
	}
	
	public ShortenedUrlDTO(String shortenedUrl) {
		this.shortenedUrl = shortenedUrl;
	}

	public String getShortenedUrl() {
		return shortenedUrl;
	}

	public void setShortenedUrl(String shortenedUrl) {
		this.shortenedUrl = shortenedUrl;
	}
}
