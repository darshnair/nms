package com.movie.service;

import com.movie.entity.Movie;

public interface MovieService {

	Movie getMovie(Long movie_id);

	void saveMovie(Movie movie);
	
}
