package com.example.url.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.url.domain.ShortenedUrlRequest;
import com.example.url.domain.URL;
import com.example.url.domain.UrlRequest;
import com.example.url.domain.dtos.UrlDTO;
import com.example.url.services.UrlService;
import com.example.url.web.apis.UrlAPI;

@RestController
public class UrlController implements UrlAPI {
	
	@Autowired
	private UrlService urlService;

	@Override
	public ResponseEntity<UrlRequest> shortenUrl(UrlRequest urlDto) {
		URL url = urlService.shortenUrl(urlDto.getUrl());
		return ResponseEntity.ok(new UrlRequest(url.getUrlShortener()));
	}
	
	@Override
	public ResponseEntity<List<UrlDTO>> findAll() {
		List<UrlDTO> urlsDto = urlService.findAll()
				.stream().map(x -> new UrlDTO(x)).toList();
		return ResponseEntity.ok(urlsDto);
	}

	@Override
	public ResponseEntity<UrlRequest> findUrlByShortenedUrl(ShortenedUrlRequest urlDto) {
		String url = urlService.findByUrlShortener(urlDto.getShortenedUrl()).getUrl();
		return ResponseEntity.ok(new UrlRequest(url));
	}
}
