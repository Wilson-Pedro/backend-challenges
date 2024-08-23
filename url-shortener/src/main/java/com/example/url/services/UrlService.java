package com.example.url.services;

import com.example.url.domain.Url;

public interface UrlService {
	
	Url save(Url url);
	
	Url findByUrlShortener(String shortenedUrl);
	
	String shortenUrl(String url);
	
	void validationUrl(Url url);

}
