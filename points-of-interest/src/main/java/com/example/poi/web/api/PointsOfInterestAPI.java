package com.example.poi.web.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.poi.domain.CoordinateRequest;
import com.example.poi.domain.PointsOfInterest;

@RequestMapping("/POIs")
public interface PointsOfInterestAPI {

	@GetMapping(produces = "application/json", path = "")
	ResponseEntity<List<PointsOfInterest>> findAll();
	
	@GetMapping(produces = "application/json", path = "/byDistance")
	ResponseEntity<List<PointsOfInterest>> findPoisByDistance(@RequestBody CoordinateRequest coordRequest);
	
}