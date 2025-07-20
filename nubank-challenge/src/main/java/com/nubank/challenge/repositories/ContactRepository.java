package com.nubank.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nubank.challenge.domain.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
