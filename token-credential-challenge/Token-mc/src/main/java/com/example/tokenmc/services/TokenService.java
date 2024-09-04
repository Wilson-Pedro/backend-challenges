package com.example.tokenmc.services;

import com.example.tokenmc.domain.Credentials;
import com.example.tokenmc.domain.Token;

public interface TokenService {

	Token generateToken(Credentials credentials);
}
