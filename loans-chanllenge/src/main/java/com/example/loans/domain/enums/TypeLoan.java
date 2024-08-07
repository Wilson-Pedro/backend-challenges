package com.example.loans.domain.enums;

public enum TypeLoan {

	PERSONAL(4),
	CONSIGMENT(2),
	GUARANTEED(3);
	
	private Integer interest_rate;
	
	private TypeLoan() {
	}

	private TypeLoan(Integer interest_rate) {
		this.interest_rate = interest_rate;
	}

	public Integer getInterestRate() {
		return interest_rate;
	}
}
