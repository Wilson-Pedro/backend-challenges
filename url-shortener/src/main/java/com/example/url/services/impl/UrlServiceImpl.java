package com.example.url.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.url.repositories.UrlRepository;
import com.example.url.services.UrlService;

public class UrlServiceImpl implements UrlService {

	@Autowired
	private UrlRepository urlRepository;

	@Override
	public String shortenUrl(String url) {
		return null;
	}
}
