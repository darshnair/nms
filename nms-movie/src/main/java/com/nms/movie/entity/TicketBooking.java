package com.nms.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TICKET_BOOKING")
public class TicketBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="BOOKINGID")
    protected int bookId;

    @Column(name="USERNAME")
    protected String uname;

    @Column(name = "TICKETNAME")
    protected String tname;

    @Column(name="SHOWDATE")
    protected Date showdate;

    @Column(name="SHOWTIME")
    protected LocalTime showtime;

    @Column(name="NUMBEROFTICKETS")
    protected int nooftickets;

    protected float price;

    @ManyToOne
    @JoinColumn(name="USERID", nullable = false)
    protected User user;

    @ManyToOne
    @JoinColumn(name="SCREENID", nullable = false)
    protected Screening screening;

    @ManyToOne
    @JoinColumn(name="SEATID", nullable = false)
    protected Seat seat;

}

