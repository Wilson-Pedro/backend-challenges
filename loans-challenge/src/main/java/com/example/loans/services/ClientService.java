package com.example.loans.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.loans.domain.Client;
import com.example.loans.domain.Loan;
import com.example.loans.domain.Response;
import com.example.loans.domain.enums.TypeLoan;

@Service
public class ClientService {

	public Response generateResponse(Client client) {
		Response response = new Response();
		List<Loan> loans = insertLoans(client.getAge(), client.getIncome(), client.getLocation());
		response.setCustomer(client.getName());
		response.setLoans(loans);
		return response;
	}

	private List<Loan> insertLoans(Integer age, Integer income, String location) {
		List<Loan> loans = new ArrayList<>();
		boolean validation = income >= 3000 && income <= 5000 && age < 30 && location.toUpperCase().equals("SP");
		
		if(income <= 3000 || validation) {
			loans.add(new Loan(TypeLoan.PERSONAL));
			loans.add(new Loan(TypeLoan.GUARANTEED));
		}
		if(income >= 5000) {
			loans.add(new Loan(TypeLoan.CONSIGMENT));
		}
		return loans;
	}

}
