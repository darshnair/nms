package com.genre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genre.entity.MovieGenre;
import com.genre.service.MovieGenreService;


@RestController
@RequestMapping("/genre")
public class MovieGenreController {

	@Autowired
	private MovieGenreService movieGenreService;

	@GetMapping("/movie/{movieId}")
	public MovieGenre getMovieGenre(@PathVariable("movieId") Long movieId) {
		return this.movieGenreService.getMovieGenre(movieId);
	}
	
}
