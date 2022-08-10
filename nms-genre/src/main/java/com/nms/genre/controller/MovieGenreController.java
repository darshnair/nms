package com.nms.genre.controller;

import com.nms.genre.entity.MovieGenre;
import com.nms.genre.service.MovieGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/genre")
public class MovieGenreController {

	@Autowired
	private MovieGenreService movieGenreService;

	@GetMapping("/movie/{movieId}")
	public MovieGenre getMovieGenre(@PathVariable("movieId") Long movieId) {
		return movieGenreService.getMovieGenre(movieId);
	}
	
}
