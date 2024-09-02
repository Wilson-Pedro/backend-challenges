package com.example.tokenmc.services;

import com.example.tokenmc.domain.Token;

public interface TokenService {

	Token generateToken(String userId);
}
