package com.example.url.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.url.domain.dtos.UrlDTO;
import com.example.url.services.UrlService;
import com.example.url.web.apis.UrlAPI;

@RestController
public class UrlController implements UrlAPI {
	
	@Autowired
	private UrlService urlService;

	@Override
	public ResponseEntity<UrlDTO> shortenUrl(UrlDTO urlDto) {
		String url = urlService.shortenUrl(urlDto.getUrl());
		return ResponseEntity.ok(new UrlDTO(url));
	}
}
