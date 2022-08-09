package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.movie.entity.Movie;
import com.movie.entity.MovieGenre;
import com.movie.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") Long movieId) {

		Movie movie = this.movieService.getMovie(movieId); // http://localhost:9001/nms-genre/movie/12345
        MovieGenre genre = this.restTemplate.getForObject("http://nms-genre/genre/movie/" + movie.getMovieId(), MovieGenre.class, movie.getMovieId());
        movie.setMovie_genre(genre.getGenreName());

        return movie;
    }

}
