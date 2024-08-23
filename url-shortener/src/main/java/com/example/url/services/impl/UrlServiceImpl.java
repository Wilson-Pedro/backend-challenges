package com.example.url.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.url.domain.Url;
import com.example.url.random.UrlRandom;
import com.example.url.repositories.UrlRepository;
import com.example.url.services.UrlService;
import com.example.url.services.exceptions.ExistingUrlException;

@Service
public class UrlServiceImpl implements UrlService {

	@Autowired
	private UrlRepository urlRepository;
	
	@Autowired
	private UrlRandom urlRandom;
	
	@Override
	public Url save(Url url) {
		validationUrl(url);
		return urlRepository.save(url);
	}

	@Override
	public String shortenUrl(String url) {
		String urlShorten = "", https = "";
		if(url != null) {
			https = substringHttp(url);
			urlShorten = urlRandom.generateRandomUrl(https, urlShorten);
		}
		return urlShorten;
	}

	private String substringHttp(String url) {
		String http = "";
		if(url.startsWith("https")) http = url.substring(0, 8);
		else if(url.startsWith("http"))http = url.substring(0, 7);
		return http;
	}
	
	@Override
	public void validationUrl(Url url) {
		if(urlRepository.existsByUrl(url.getUrl())) throw new ExistingUrlException();
	}
}
