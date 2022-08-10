package com.genre.repository;

import com.genre.entity.MovieGenre;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieGenreRepository extends PagingAndSortingRepository<MovieGenre, Long> {
}
