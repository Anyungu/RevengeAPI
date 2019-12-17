package com.anyungu.revenge.revengeAPI.exceptions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

@SuppressWarnings("serial")
public class CustomException extends RuntimeException implements GraphQLError {

	private Integer code;

	private String message;

	public CustomException(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	@Override
	public Map<String, Object> getExtensions() {

		Map<String, Object> customAttributes = new LinkedHashMap<>();

		customAttributes.put("internalCode", this.code);
		customAttributes.put("errorMessage", this.message);

		return customAttributes;

	}

	@Override
	@JsonIgnore
	public StackTraceElement[] getStackTrace() {
		return super.getStackTrace();
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	@Override
	public List<SourceLocation> getLocations() {

		return null;
	}

	@Override
	public ErrorType getErrorType() {

		return null;
	}

}
