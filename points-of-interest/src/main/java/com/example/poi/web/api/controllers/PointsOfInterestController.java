package com.example.poi.web.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.poi.domain.PointsOfInterest;
import com.example.poi.services.impl.PointsOfInterestImpl;
import com.example.poi.web.api.PointsOfInterestAPI;

@RestController
public class PointsOfInterestController implements PointsOfInterestAPI{

	@Autowired
	private PointsOfInterestImpl poiServiceImpl;

	@Override
	public ResponseEntity<List<PointsOfInterest>> findAll() {
		return ResponseEntity.ok(poiServiceImpl.findAll());
	}
}
