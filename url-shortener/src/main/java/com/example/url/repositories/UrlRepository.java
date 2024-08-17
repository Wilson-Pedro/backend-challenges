package com.example.url.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.url.domain.UrlRequest;

public interface UrlRepository extends JpaRepository<UrlRequest, Long>{

}
