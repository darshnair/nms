package com.nms.auth.controller;

import com.nms.auth.helper.JwtUtil;
import com.nms.auth.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nms.auth.model.JwtUserRequest;
import com.nms.auth.model.JwtUserResponse;

@RestController
public class LoginController{

	@Autowired
	private CustomUserDetailsService customService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	//@Qualifier("authenticationManagerBean")
	private AuthenticationManager authenticationManager;
	
	@RequestMapping(value="/token", method= RequestMethod.POST)
	public ResponseEntity<?> generateToken(@RequestBody JwtUserRequest jwtRequest) throws Exception {
		
		System.out.println(jwtRequest);
		
		try {
			this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
			
		} catch(UsernameNotFoundException e) {
			e.printStackTrace();
			throw new Exception("Bad Credentials");
		} catch(BadCredentialsException e) {
			e.printStackTrace();
			throw new Exception("Bad Credentials");
		}

		// fine area...
		UserDetails userDetails = this.customService.loadUserByUsername(jwtRequest.getUsername());
		
		String token = this.jwtUtil.generateToken(userDetails);
		
		System.out.println("JWT"+token);
		
		//{"token::"value"}
		
		return ResponseEntity.ok(new JwtUserResponse(token));

	}

}
