package com.login_service.model;

public class JwtUserResponse {

	private String token;

	public JwtUserResponse() {
	}

	public JwtUserResponse(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
