package com.example.poi.web.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.poi.services.impl.PointsOfInterestImpl;
import com.example.poi.web.api.PointsOfInterestAPI;

@RestController
public class PointsOfInterestController implements PointsOfInterestAPI{

	@Autowired
	private PointsOfInterestImpl poiServiceImpl;
}
