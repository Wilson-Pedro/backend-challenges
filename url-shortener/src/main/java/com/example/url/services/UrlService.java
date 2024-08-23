package com.example.url.services;

import com.example.url.domain.Url;

public interface UrlService {
	
	Url save(Url url);
	
	String shortenUrl(String url);

}
