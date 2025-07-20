package com.nubank.challenge.services;

import com.nubank.challenge.domain.dto.ClientDto;
import com.nubank.challenge.domain.entities.Client;

public interface ClientService {
	
	Client save(ClientDto clientDto);

	Client findById(Long id);
}
