package com.nk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private String message = "RESOURCE NOT FOUND";

	public ResourceNotFoundException() {

	}

	public ResourceNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

}
