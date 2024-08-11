package com.example.poi.web.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.poi.domain.CoordinateRequest;
import com.example.poi.domain.PointsOfInterest;
import com.example.poi.services.PointsOfInterestService;
import com.example.poi.web.api.PointsOfInterestAPI;

@RestController
public class PointsOfInterestController implements PointsOfInterestAPI{

	@Autowired
	private PointsOfInterestService poiService;

	@Override
	public ResponseEntity<List<PointsOfInterest>> findAll() {
		return ResponseEntity.ok(poiService.findAll());
	}

	@Override
	public ResponseEntity<List<PointsOfInterest>> findPoisByDistance(CoordinateRequest coordRequest) {
		List<PointsOfInterest> list = poiService.findPoisByDistance(coordRequest);
		return ResponseEntity.ok(list);
	}
}
