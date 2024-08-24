package com.example.url.services;

import java.util.List;

import com.example.url.domain.URL;

public interface UrlService {
	
	URL save(URL url);
	
	URL save(String url);
	
	URL findByUrlShortener(String shortenedUrl);
	
	String prepareShortenUrl(String url);
	
	List<URL> findAll();
	
	void validationUrl(URL url);

}
