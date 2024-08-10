package com.example.poi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.poi.domain.PointsOfInterest;
import com.example.poi.repositories.PointsOfInterestRepository;

@SpringBootApplication
public class PointsOfInterestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PointsOfInterestApplication.class, args);
	}
	
	@Autowired
	PointsOfInterestRepository poiRRepository;

	@Override
	public void run(String... args) throws Exception {
		
		PointsOfInterest poi1 = new PointsOfInterest(null, "Lanchonete", 27, 12);
		PointsOfInterest poi2 = new PointsOfInterest(null, "Posto", 31, 18);
		PointsOfInterest poi3 = new PointsOfInterest(null, "Joalheria", 15, 12);
		PointsOfInterest poi4 = new PointsOfInterest(null, "Floricultura", 19, 21);
		PointsOfInterest poi5 = new PointsOfInterest(null, "Pub", 12, 8);
		PointsOfInterest poi6 = new PointsOfInterest(null, "Supermercador", 23, 6);
		PointsOfInterest poi7 = new PointsOfInterest(null, "Churrascaria", 28, 2);
		
		poiRRepository.saveAll(List.of(poi1, poi2, poi3, poi4, poi5, poi6, poi7));
	}

}
