package com.example.url.services.exceptions;

public class ExistingUrlException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private String urlShortener;

	public ExistingUrlException(String urlShortener) {

		this.urlShortener = urlShortener;
	}

	public String getUrlShortener() {
		return urlShortener;
	}
}
