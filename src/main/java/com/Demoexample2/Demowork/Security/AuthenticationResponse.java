package com.Demoexample2.Demowork.Security;

public class AuthenticationResponse {
	private final String jwt;

	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}
	public String getJwt() {
		return jwt;
	}

}
