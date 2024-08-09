package com.example.poi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.poi.domain.PointsOfInterest;

public interface PointsOfInterestRepository extends JpaRepository<PointsOfInterest, Long>{

}
