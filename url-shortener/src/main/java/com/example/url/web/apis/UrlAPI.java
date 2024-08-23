package com.example.url.web.apis;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.url.domain.dtos.ShortenedUrlDTO;
import com.example.url.domain.dtos.UrlDTO;

public interface UrlAPI {

	@PostMapping(produces = "application/json", path="/shorten-url")
	ResponseEntity<UrlDTO> shortenUrl(@RequestBody UrlDTO urlDto);
	
	@GetMapping(produces = "application/json", path="/shorten-url")
	ResponseEntity<UrlDTO> findUrlByShortenedUrl(@RequestBody ShortenedUrlDTO urlDto);
}
