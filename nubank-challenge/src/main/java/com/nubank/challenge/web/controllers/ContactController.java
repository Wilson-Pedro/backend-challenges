package com.nubank.challenge.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.nubank.challenge.domain.dto.ContactDto;
import com.nubank.challenge.domain.entities.Contact;
import com.nubank.challenge.services.ContactService;
import com.nubank.challenge.web.api.ContactAPI;

@RestController
public class ContactController implements ContactAPI {
	
	@Autowired
	ContactService contactService;

	@Override
	public ResponseEntity<ContactDto> save(ContactDto contactDto) {
		Contact contactSaved = contactService.save(contactDto);
		return ResponseEntity.status(201).body(new ContactDto(contactSaved));
	}

}
