package com.example.poi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.poi.repositories.PointsOfInterestRepository;
import com.example.poi.services.PointsOfInterestService;

@Service
public class PointsOfInterestImpl implements PointsOfInterestService{

	@Autowired
	private PointsOfInterestRepository poiRepository;
}
