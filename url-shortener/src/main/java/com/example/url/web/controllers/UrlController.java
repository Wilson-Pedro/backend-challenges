package com.example.url.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.url.domain.Url;
import com.example.url.domain.dtos.UrlDTO;
import com.example.url.services.UrlService;
import com.example.url.web.apis.UrlAPI;

@RestController
public class UrlController implements UrlAPI {
	
	@Autowired
	private UrlService urlService;

	@Override
	public ResponseEntity<UrlDTO> shortenUrl(UrlDTO urlDto) {
		String urlShortener = urlService.shortenUrl(urlDto.getUrl());
		urlService.save(new Url(null, urlDto.getUrl(), urlShortener));
		return ResponseEntity.ok(new UrlDTO(urlShortener));
	}
}
