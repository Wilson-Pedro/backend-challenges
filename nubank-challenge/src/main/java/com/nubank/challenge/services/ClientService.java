package com.nubank.challenge.services;

import java.util.List;

import com.nubank.challenge.domain.dto.ClientDto;
import com.nubank.challenge.domain.entities.Client;

public interface ClientService {
	
	Client save(ClientDto clientDto);
	
	Client save(Client client);

	Client findById(Long id);
	
	List<Client> findAll();
}
