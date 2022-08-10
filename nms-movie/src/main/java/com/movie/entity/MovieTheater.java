package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MOVIE_THEATER")
public class MovieTheater {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Column(name = "MOVIEID")
    protected Long movieId;

    @Column(name = "THEATERID")
    protected int tid;

}
