package com.example.url.services;

import java.util.List;

import com.example.url.domain.URL;

public interface UrlService {
	
	URL shortenUrl(String url);
	
	URL save(URL url);
	
	URL save(String url);
	
	URL findByUrlShortener(String shortenedUrl);
	
	String prepareShortenUrl(String url);
	
	List<URL> findAll();
	
	void validateUrlExpiration(URL url);

}
