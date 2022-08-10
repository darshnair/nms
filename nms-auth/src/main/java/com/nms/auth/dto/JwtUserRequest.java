package com.nms.auth.dto;

public class JwtUserRequest {
	
	String username;
	String password;
	
	public JwtUserRequest() {
	}

	public JwtUserRequest(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "JwtUserRequest [username=" + username + ", password=" + password + "]";
	}

}
