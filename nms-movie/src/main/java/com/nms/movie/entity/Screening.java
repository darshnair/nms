package com.nms.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="SCREENING")
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SCREENID")
    protected int screenid;

    protected LocalDate date;

    @Column(name = "SHOWSTARTTIME")
    protected LocalTime showstartTime;

    @Column(name="SHOWENDTIME")
    protected LocalTime showendtime;

    @Column(name="ISFULL")
    protected boolean isfull;

    protected double price;

//    @ManyToOne
//    @JoinColumn(name="MOVIEID", nullable = false)
//    protected Movie movie;
//
//    @OneToMany(mappedBy = "screening", cascade = CascadeType.ALL)
//    protected Set<TicketBooking> bookings;

}
