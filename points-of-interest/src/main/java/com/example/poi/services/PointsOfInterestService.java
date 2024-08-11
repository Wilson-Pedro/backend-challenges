package com.example.poi.services;

import java.util.List;

import com.example.poi.domain.CoordinateRequest;
import com.example.poi.domain.PointsOfInterest;

public interface PointsOfInterestService {
	
	List<PointsOfInterest> findAll();
	
	List<PointsOfInterest> findPoisByDistance(CoordinateRequest coordRequest);

}
