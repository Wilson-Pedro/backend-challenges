package com.nubank.challenge.web.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nubank.challenge.domain.dto.ClientDto;

@RequestMapping("/clients")
public interface ClientAPI {

	@PostMapping("/")
	public ResponseEntity<ClientDto> save(@RequestBody ClientDto clientDto);
}
