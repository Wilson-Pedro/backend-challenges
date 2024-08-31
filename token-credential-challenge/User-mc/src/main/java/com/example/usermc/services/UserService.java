package com.example.usermc.services;

import com.example.usermc.domain.records.Credentials;
import com.example.usermc.domain.records.Token;

public interface UserService {

	Token authenticateCredentials(Credentials credentials);
}
