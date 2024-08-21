package com.example.url.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.url.repositories.UrlRepository;
import com.example.url.services.UrlService;

@Service
public class UrlServiceImpl implements UrlService {
	
	public static List<String> WORDS = List.of(
		    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
		    "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
		    "V", "W", "X", "Y", "Z"
	);
	
	public static List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
	
	public static Random RANDOM = new Random();

	@Autowired
	private UrlRepository urlRepository;

	@Override
	public String shortenUrl(String url) {
		String urlShorten = "", https = "";
		if(url != null) {
			https = substringHttp(url);
			urlShorten = generateUrlShorthen(https, url);
		}
		return urlShorten;
	}

	private String substringHttp(String url) {
		String http = "";
		if(url.startsWith("https")) http = url.substring(0, 8);
		else if(url.startsWith("http"))http = url.substring(0, 7);
		return http;
	}
	
	private String generateUrlShorthen(String http, String url) {
		String urlShorten = "";
		int randomNumber = 0;
		List<String> words = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			randomNumber = RANDOM.nextInt(26);
			words.add(WORDS.get(randomNumber));
		}
		
		String join = words.get(0) + words.get(1) + words.get(2) + words.get(3) + words.get(4);
		
		urlShorten = http + "xxx.com/" + join;
		
		return urlShorten;
	}
}
