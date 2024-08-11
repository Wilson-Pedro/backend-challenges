package com.example.poi.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.poi.domain.CoordinateRequest;
import com.example.poi.domain.PointsOfInterest;
import com.example.poi.repositories.PointsOfInterestRepository;
import com.example.poi.services.PointsOfInterestService;

@Service
public class PointsOfInterestImpl implements PointsOfInterestService{

	@Autowired
	private PointsOfInterestRepository poiRepository;

	@Override
	public List<PointsOfInterest> findAll() {
		return poiRepository.findAll();
	}

	@Override
	public List<PointsOfInterest> findPoisByDistance(CoordinateRequest coordRequest) {
		int x1 = coordRequest.getX(), 
			y1 = coordRequest.getY(), 
			x2 = 0, y2 = 0;
		List<PointsOfInterest> poisByDistance = new ArrayList<>();
		for(PointsOfInterest obj : findAll()) {
			x2 = obj.getX();
			y2 = obj.getY();
			int result = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
			if(result <= coordRequest.getMaxDistance()) poisByDistance.add(obj);
		}
		return poisByDistance;
	}

}
