package com.movie.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MOVIE")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MOVIEID")
    protected Long movieId;

    @Column(name = "MOVIENAME")
    protected String movie_name;

    @Column(name = "MOVIEGENRE")
    private String movie_genre;

    protected String duration;

    @Column(name = "DATEOFBOOKING")
    protected LocalDate dateofbooking;

    @Column(name = "`SHOW`")
    protected String show;

    @Column(name = "NUMBEROFTICKETS")
    protected int nooftickets;

//    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
//    @ToString.Exclude
//    protected Set<Screening> screening;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "MOVIE_THEATER",
//            joinColumns = {@JoinColumn(name = "MOVIEID")},
//            inverseJoinColumns = {@JoinColumn(name = "THEATERID")
//    })
//    protected List<Theater> theaters;

}
