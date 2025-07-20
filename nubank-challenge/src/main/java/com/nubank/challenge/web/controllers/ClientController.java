package com.nubank.challenge.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nubank.challenge.domain.dto.ClientDto;
import com.nubank.challenge.domain.entities.Client;
import com.nubank.challenge.services.ClientService;
import com.nubank.challenge.web.api.ClientAPI;

@RestController
public class ClientController implements ClientAPI {
	
	@Autowired
	ClientService clientService;

	@Override
	public ResponseEntity<ClientDto> save(@RequestBody ClientDto clientDto) {
		Client clientSaved = clientService.save(clientDto);
		return ResponseEntity.status(201).body(new ClientDto(clientSaved));
	}

	@Override
	public ResponseEntity<List<ClientDto>> findAll() {
		List<Client> list = clientService.findAll();
		List<ClientDto> dtos = list.stream().map(ClientDto::new).toList();
		return ResponseEntity.ok(dtos);
	}

	@Override
	public ResponseEntity<ClientDto> findById(Long id) {
		Client client = clientService.findById(id);
		return ResponseEntity.ok(new ClientDto(client));
	}

}
