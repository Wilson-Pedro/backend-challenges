package com.nubank.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nubank.challenge.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
