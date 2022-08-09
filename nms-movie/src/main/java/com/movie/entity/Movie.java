package com.movie.entity;

public class Movie {

	private Long movieId;
	private String movie_name;
	private String movie_genre;

	public Movie() {
	}

	public Movie(Long movieId, String movie_name, String movie_genre) {
		this.movieId = movieId;
		this.movie_name = movie_name;
		this.movie_genre = movie_genre;
	}

	public Movie(Long movieId, String movie_name) {
		super();
		this.movieId = movieId;
		this.movie_name = movie_name;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getMovie_genre() {
		return movie_genre;
	}

	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}

}
