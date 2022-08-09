package com.genre.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.genre.entity.MovieGenre;

@Service
public class MovieGenreServiceImpl implements MovieGenreService {

	// fake genre
	List<MovieGenre> list = List.of(
			new MovieGenre(2345L, "Comedy", 12345L),
			new MovieGenre(23435L, "Thriller", 12346L),
			new MovieGenre(23435L, "Action", 123452L)
			);

	@Override
	public MovieGenre getMovieGenre(Long movieId) {
		return this.list.stream().filter(movieGenre -> movieGenre.getMovieId().equals(movieId)).findAny().orElse(null);
	}

}
