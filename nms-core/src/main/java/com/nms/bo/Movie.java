package com.nms.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MOVIE")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MOVIE_ID")
    protected int movieID;

    @Column(name="MOVIE_NM")
    protected String movieName;

    protected String duration;

    @Column(name="DATE_OF_BOOKING")
    protected Date dateofbooking;

    protected String show;

    @Column(name="NUMBER_OF_TICKETS")
    protected int nooftickets;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    protected Set<Screening> screening;

    @ManyToOne
    @JoinColumn(name="THEATER_ID", nullable = false)
    protected Theater theater;

}
