package com.example.loans.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loans.domain.Client;
import com.example.loans.domain.Response;
import com.example.loans.services.ClientService;

@RestController
@RequestMapping("/customer-loans")
public class ClientController {
	
	@Autowired
	private ClientService clientService;

	@PostMapping
	public ResponseEntity<Response> response(@RequestBody Client client) {
		Response response = clientService.generateResponse(client);
		
		return ResponseEntity.ok(response);
	}
}
