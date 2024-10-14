package com.generalbook.bookshop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException {

	private String resourcename;
	private String feildname;
	private Object feildvalue;
	public ResourceNotFound(String resourcename, String feildname, Object feildvalue) {
		super();
		this.resourcename = resourcename;
		this.feildname = feildname;
		this.feildvalue = feildvalue;
	}
	
	
}
