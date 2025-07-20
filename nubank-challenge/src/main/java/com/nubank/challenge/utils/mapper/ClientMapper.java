package com.nubank.challenge.utils.mapper;

import java.util.List;

import com.nubank.challenge.domain.dto.ContactMindDto;
import com.nubank.challenge.domain.entities.Contact;

public class ClientMapper {

	public static List<ContactMindDto> toMinDto(List<Contact> list) {
		if(!list.isEmpty()) {
			return list.stream().map(ContactMindDto::new).toList();
		}
		return null;
	}
}
