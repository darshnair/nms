package com.genre.service;

import com.genre.repository.MovieGenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genre.entity.MovieGenre;

@Service
public class MovieGenreServiceImpl implements MovieGenreService {

	@Autowired
	private MovieGenreRepository movieGenreRepository;

	@Override
	public MovieGenre getMovieGenre(Long movieId) {
		return movieGenreRepository.findById(movieId).orElse(null);
	}

}
