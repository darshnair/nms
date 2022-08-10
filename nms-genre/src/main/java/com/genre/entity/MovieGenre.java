package com.genre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE_GENRE")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MovieGenre {

	@Id
	@Column(name = "GENRE_ID", nullable = false)
	private Long genreId;

	@Column(name = "GENRE_NAME")
	private String genreName;

	@Column(name = "MOVIE_ID")
	private Long movieId;
	
}
