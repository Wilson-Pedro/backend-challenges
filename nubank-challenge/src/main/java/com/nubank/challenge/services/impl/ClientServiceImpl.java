package com.nubank.challenge.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubank.challenge.domain.dto.ClientDto;
import com.nubank.challenge.domain.entities.Client;
import com.nubank.challenge.repositories.ClientRepository;
import com.nubank.challenge.services.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Client save(ClientDto clientDto) {
		return clientRepository.save(new Client(clientDto));
	}

}
