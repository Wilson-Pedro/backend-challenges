package com.example.password.web.apis;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.password.domain.Password;

public interface PasswordAPI {

	@PostMapping(produces = "application/json", path="/validate-password")
	ResponseEntity<Object> validatePassword(@RequestBody Password password);
}
