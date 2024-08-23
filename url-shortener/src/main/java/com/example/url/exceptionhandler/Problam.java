package com.example.url.exceptionhandler;

import java.io.Serializable;

public class Problam implements Serializable {
	private static final long serialVersionUID = 1L;

	private String title;
	
	private Integer statusCode;
	
	private String sugestion;
	
	public Problam() {
	}

	public Problam(String title, Integer statusCode, String sugestion) {
		this.title = title;
		this.statusCode = statusCode;
		this.sugestion = sugestion;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getSugestion() {
		return sugestion;
	}

	public void setSugestion(String sugestion) {
		this.sugestion = sugestion;
	}
}
