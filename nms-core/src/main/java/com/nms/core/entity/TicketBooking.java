package com.nms.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TICKET_BOOKING")
public class TicketBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="BOOKING_ID")
    protected int bookId;

    @Column(name="USER_NAME")
    protected String uname;

    @Column(name = "TICKET_NM")
    protected String tname;

    @Column(name="SHOW_DATE")
    protected Date showdate;

    @Column(name="SHOW_TIME")
    protected LocalTime showtime;

    @Column(name="NUMBER_OF_TICKETS")
    protected int nooftickets;

    protected float price;

    @ManyToOne
    @JoinColumn(name="USER_ID", nullable = false)
    protected User user;

    @ManyToOne
    @JoinColumn(name="SCREEN_ID", nullable = false)
    protected Screening screening;

    @ManyToOne
    @JoinColumn(name="SEAT_ID", nullable = false)
    protected Seat seat;

}

