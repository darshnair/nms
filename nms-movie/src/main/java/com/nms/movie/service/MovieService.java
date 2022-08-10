package com.nms.movie.service;

import com.nms.movie.entity.Movie;

public interface MovieService {

	Movie getMovie(Long movie_id);

	void saveMovie(Movie movie);
	
}
