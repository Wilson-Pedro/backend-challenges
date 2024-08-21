package com.example.url.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class UrlRandom {
	
	public static List<String> WORDS = List.of(
		    "A", "0", "B", "C", "D", "1", "E", "F", "G","2", "H", "I", "J", "3",
		    "K", "L", "4", "M", "N", "5", "O", "P", "6", "Q", "R", "7", "S", 
		    "T", "U", "8", "V", "W", "X", "9", "Y", "Z"
	);
	
	public static List<Integer> NUMBERS = List.of(5, 6, 7, 8, 9, 10);
	
	public static Random RANDOM = new Random();
	
	public String generateRandomUrl(String http, String url) {
		String randomUrl = getRandomCharactres();
		randomUrl = http + "xxx.com/" + randomUrl;
		
		return randomUrl;
	}

	private String getRandomCharactres() {
		String randomCharacteres = "";
		int randomNumber = 0, max = NUMBERS.get(RANDOM.nextInt(6));
		List<String> words = new ArrayList<>();
		for(int i = 0; i < max; i++) {
			randomNumber = RANDOM.nextInt(36);
			words.add(WORDS.get(randomNumber));
		}
		
		randomCharacteres = String.join("", words);
		return randomCharacteres;
	}
}
