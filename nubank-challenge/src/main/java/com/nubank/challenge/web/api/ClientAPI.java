package com.nubank.challenge.web.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nubank.challenge.domain.dto.ClientDto;

@RequestMapping("/clients")
public interface ClientAPI {

	@PostMapping("/")
	public ResponseEntity<ClientDto> save(@RequestBody ClientDto clientDto);
	
	@GetMapping
	public ResponseEntity<List<ClientDto>> findAll();
	
	@GetMapping("/{id}")
	public ResponseEntity<ClientDto> findById(@PathVariable Long id);
}
