package com.example.url.web.apis;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.url.domain.URL;
import com.example.url.domain.dtos.ShortenedUrlDTO;
import com.example.url.domain.dtos.UrlDTO;

@RequestMapping("/urls")
public interface UrlAPI {

	@PostMapping(produces = "application/json", path="/shorten-url")
	ResponseEntity<UrlDTO> shortenUrl(@RequestBody UrlDTO urlDto);
	
	@GetMapping(produces = "application/json", path="")
	ResponseEntity<List<URL>> findAll();
	
	@GetMapping(produces = "application/json", path="/shorten-url")
	ResponseEntity<UrlDTO> findUrlByShortenedUrl(@RequestBody ShortenedUrlDTO urlDto);
}
