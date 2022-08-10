package com.nms.genre.repository;

import com.nms.genre.entity.MovieGenre;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieGenreRepository extends PagingAndSortingRepository<MovieGenre, Long> {
}
