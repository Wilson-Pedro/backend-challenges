package com.example.loans.domain;

import java.io.Serializable;
import java.util.List;

public class Response implements Serializable {
	private static final long serialVersionUID = 1L;

	private String customer;
	
	private List<Loan> loans;
	
	public Response() {
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public List<Loan> getLoans() {
		return loans;
	}

	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
}
