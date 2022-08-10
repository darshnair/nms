package com.nms.movie.service;

import com.nms.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nms.movie.entity.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public Movie getMovie(Long movie_id) {
		return movieRepository.findById(movie_id).orElse(null);
	}

	public void saveMovie(Movie movie) {
		movieRepository.save(movie);
	}

}
