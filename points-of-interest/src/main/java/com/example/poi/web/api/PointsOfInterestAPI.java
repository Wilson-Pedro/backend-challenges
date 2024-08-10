package com.example.poi.web.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.poi.domain.PointsOfInterest;

@RequestMapping("/POIs")
public interface PointsOfInterestAPI {

	@GetMapping(produces = "application/json", path = "")
	ResponseEntity<List<PointsOfInterest>> findAll();
}
