package com.example.url.domain;

public class ShortenedUrlRequest {

	private String shortenedUrl;
	
	public ShortenedUrlRequest() {
	}
	
	public ShortenedUrlRequest(String shortenedUrl) {
		this.shortenedUrl = shortenedUrl;
	}

	public String getShortenedUrl() {
		return shortenedUrl;
	}

	public void setShortenedUrl(String shortenedUrl) {
		this.shortenedUrl = shortenedUrl;
	}
}
