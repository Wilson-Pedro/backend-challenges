package com.example.loans.domain;

import java.io.Serializable;
import java.util.Objects;

import com.example.loans.domain.enums.TypeLoan;

public class Loan implements Serializable {
	private static final long serialVersionUID = 1L;

	private TypeLoan type;
	private Integer interest_rate;
	
	public Loan(TypeLoan type) {
		this.type = type;
		this.interest_rate = type.getInterestRate();
	}

	public TypeLoan getType() {
		return type;
	}

	public void setType(TypeLoan type) {
		this.type = type;
	}

	public Integer getInterestRate() {
		return interest_rate;
	}

	public void setInterest_rate(Integer interest_rate) {
		this.interest_rate = interest_rate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(interest_rate, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		return Objects.equals(interest_rate, other.interest_rate) && type == other.type;
	}
}
