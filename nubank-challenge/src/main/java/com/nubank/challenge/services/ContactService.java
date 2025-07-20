package com.nubank.challenge.services;

import com.nubank.challenge.domain.dto.ContactDto;
import com.nubank.challenge.domain.entities.Contact;

public interface ContactService {
	
	Contact save (ContactDto contactDto);

}
