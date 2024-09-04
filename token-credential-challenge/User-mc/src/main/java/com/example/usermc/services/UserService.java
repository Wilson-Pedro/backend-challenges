package com.example.usermc.services;

import com.example.usermc.domain.records.Credentials;

public interface UserService {

	void authenticateCredentials(Credentials credentials);
}
