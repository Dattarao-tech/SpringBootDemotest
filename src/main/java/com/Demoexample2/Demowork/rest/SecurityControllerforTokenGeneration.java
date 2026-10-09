package com.Demoexample2.Demowork.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Demoexample2.Demowork.Security.AuthenticateRequest;
import com.Demoexample2.Demowork.Security.AuthenticationResponse;
import com.Demoexample2.Demowork.Security.MyUserDetailsService;
import com.Demoexample2.Demowork.util.JwtUtil;
@RestController
public class SecurityControllerforTokenGeneration {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private  MyUserDetailsService  myUserDetailsService;
	
	@RequestMapping(value="/auth" , method =RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticateRequest  authenticateRequest) throws Exception{
	 
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticateRequest.getUsername(), authenticateRequest.getPassword()));			
	}
	catch (BadCredentialsException e){
		throw new Exception("incorrect username or password ",e);
	}
	 final UserDetails userDetails = myUserDetailsService.loadUserByUsername(authenticateRequest.getUsername());
	 
	final  String jwt=jwtUtil.generateToken(userDetails);
	  
	 return ResponseEntity.ok(new AuthenticationResponse(jwt));
	
	
	}	
}
