package com.example.url.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.url.domain.URL;
import com.example.url.domain.dtos.ShortenedUrlDTO;
import com.example.url.domain.dtos.UrlDTO;
import com.example.url.services.UrlService;
import com.example.url.web.apis.UrlAPI;

@RestController
public class UrlController implements UrlAPI {
	
	@Autowired
	private UrlService urlService;

	@Override
	public ResponseEntity<UrlDTO> shortenUrl(UrlDTO urlDto) {
		String urlShortener = urlService.prepareShortenUrl(urlDto.getUrl());
		urlService.save(urlDto.getUrl());
		return ResponseEntity.ok(new UrlDTO(urlShortener));
	}
	
	@Override
	public ResponseEntity<List<URL>> findAll() {
		return ResponseEntity.ok(urlService.findAll());
	}

	@Override
	public ResponseEntity<UrlDTO> findUrlByShortenedUrl(ShortenedUrlDTO urlDto) {
		String url = urlService.findByUrlShortener(urlDto.getShortenedUrl()).getUrl();
		return ResponseEntity.ok(new UrlDTO(url));
	}
}
