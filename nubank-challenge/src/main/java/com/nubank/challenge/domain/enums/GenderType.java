package com.nubank.challenge.domain.enums;

import java.util.stream.Stream;

public enum GenderType {

	MALE(1, "male"),
	FEMALE(2, "femele");
	
	private Integer cod;
	
	private String gender;

	private GenderType(Integer cod, String gender) {
		this.cod = cod;
		this.gender = gender;
	}

	public Integer getCod() {
		return cod;
	}

	public String getGender() {
		return gender;
	}
	
	public static GenderType toEnum(String gender) {
		return Stream.of(GenderType.values())
				.filter(x -> x.getGender().equals(gender.toLowerCase()))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Gender invalid: " + gender));
	}
	
	public static GenderType toEnum(Integer cod) {
		return Stream.of(GenderType.values())
				.filter(x -> x.getCod().equals(cod))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Cod invalid: " + cod));
	}
}
