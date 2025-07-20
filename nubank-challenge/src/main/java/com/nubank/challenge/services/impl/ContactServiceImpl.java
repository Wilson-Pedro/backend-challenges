package com.nubank.challenge.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubank.challenge.domain.dto.ContactDto;
import com.nubank.challenge.domain.entities.Contact;
import com.nubank.challenge.repositories.ContactRepository;
import com.nubank.challenge.services.ClientService;
import com.nubank.challenge.services.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Autowired
	private ClientService clientService;

	@Override
	public Contact save(ContactDto contactDto) {
		Contact contact = new Contact(contactDto);
		contact.setClient(clientService.findById(contactDto.getClientId()));
		return contactRepository.save(contact);
	}

}
