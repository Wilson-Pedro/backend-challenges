package com.example.url.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.url.domain.Url;

public interface UrlRepository extends JpaRepository<Url, Long>{

	boolean existsByUrl(String url);
	
	boolean existsByUrlShortener(String url);
	
	Url findByUrlShortener(String shortenedUrl);
}
