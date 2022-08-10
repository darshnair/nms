package com.nms.auth.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nms.auth.helper.JwtUtil;
import com.nms.auth.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class LoginAuthenticationFilter extends OncePerRequestFilter{

	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private CustomUserDetailsService customerUserDetailsService;
	 
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		//get header
		String requestHeader = request.getHeader("Authorization");
		String username=null;
		String token=null;
		
		//Bearer start
		
		//null and format
		if(requestHeader!=null && requestHeader.startsWith("Bearer ")) {
			
			token= requestHeader.substring(7);
			
			try {
				
				username = this.jwtUtil.getUsernameFromToken(token);
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			UserDetails userDetails = this.customerUserDetailsService.loadUserByUsername(username);
			
			//validate
			if(username != null && SecurityContextHolder.getContext().getAuthentication() ==null) {
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken= new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			} else {
				System.out.println("Token is not validated .....");
			}

		}
		filterChain.doFilter(request, response);
	}

}
