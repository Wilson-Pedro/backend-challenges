package com.example.url.services.impl;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.url.domain.URL;
import com.example.url.random.UrlRandom;
import com.example.url.repositories.UrlRepository;
import com.example.url.services.UrlService;
import com.example.url.services.exceptions.ExistingUrlException;
import com.example.url.services.exceptions.UrlNotFoundException;

@Service
public class UrlServiceImpl implements UrlService {

	@Autowired
	private UrlRepository urlRepository;
	
	@Autowired
	private UrlRandom urlRandom;
	
	@Override
	public URL save(URL url) {
		validationUrl(url);
		return urlRepository.save(url);
	}
	
	@Override
	public URL save(String url) {
		String shortenUrl = prepareShortenUrl(url);
		URL newURL = new URL(null, url, shortenUrl, generateExpiration());
		return save(newURL);
	}
	
	@Override
	public List<URL> findAll() {
		return urlRepository.findAll();
	}
	
	@Override
	public URL findByUrlShortener(String shortenedUrl) {
		if(!urlRepository.existsByUrlShortener(shortenedUrl)) throw new UrlNotFoundException();
		return urlRepository.findByUrlShortener(shortenedUrl);
	}
	
	@Override
	public void validationUrl(URL url) {
		if(urlRepository.existsByUrl(url.getUrl())) throw new ExistingUrlException();
	}
	
	@Override
	public String prepareShortenUrl(String url) {
		String urlShorten = "", randomUrl = "", http = "";
		if(url != null) {
			http = substringHttp(url);
			randomUrl = urlRandom.generateRandomUrl();
		}
		urlShorten = http + "xxx.com/" + randomUrl;
		return urlShorten;
	}
	
	public Instant generateExpiration() {
		return Instant.now().plusSeconds(10L);
	}

	private String substringHttp(String url) {
		String http = "";
		if(url.startsWith("https")) http = url.substring(0, 8);
		else if(url.startsWith("http"))http = url.substring(0, 7);
		return http;
	}
}
