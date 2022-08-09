package com.movie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.entity.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	
	// fake movie list
	
	List<Movie> list = List.of(
			new Movie(12345L, "ABCD"),
			new Movie(12346L, "Sherlock"),
			new Movie(123452L, "AT 56")
			);
	
	
	@Override
	public Movie getMovie(Long movie_id) {
		
		return this.list.stream().filter(movie -> movie.getMovieId().equals(movie_id)).findAny().orElse(null);
	}

}
