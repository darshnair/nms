package com.movie.dto;

public class MovieGenre {

	private Long genreId;
	private String genreName;
	private Long movieId;
	
	public MovieGenre() {
	}

	public MovieGenre(Long genreId, String genreName, Long movieId) {
		this.genreId = genreId;
		this.genreName = genreName;
		this.movieId = movieId;
	}
	
	public MovieGenre(Long genreId, Long movieId) {
		super();
		this.genreId = genreId;
		this.movieId = movieId;
	}

	public Long getGenreId() {
		return genreId;
	}
	public void setGenreId(Long genreId) {
		this.genreId = genreId;
	}
	public String getGenreName() {
		return genreName;
	}
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
}
