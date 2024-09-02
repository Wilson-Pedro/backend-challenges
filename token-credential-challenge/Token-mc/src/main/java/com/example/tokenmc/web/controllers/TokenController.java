package com.example.tokenmc.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.tokenmc.services.TokenService;
import com.example.tokenmc.web.apis.TokenAPI;

@RestController
public class TokenController implements TokenAPI{

	@Autowired
	private TokenService tokenService;
}
