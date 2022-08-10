package com.login_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.login_service.entity.Movie;

@RestController
@RequestMapping("/login")
public class Home {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{movieId}")
	public Movie login(@PathVariable("movieId") Long movieId) {
		
		Movie movie = this.restTemplate.getForObject("http://nms-movie/movie/"+movieId, Movie.class, movieId);
		
		String txt = "this is private page";
		txt += " this page is not allowed to unauthenticated user";
		return movie;
	}
	
}
