package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SEAT")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SEATID")
    protected int seatid;

    @Column(name="SEATNUMBER")
    protected String seatnumber;

    @OneToMany(mappedBy = "seat", cascade = CascadeType.ALL)
    protected Set<TicketBooking> ticketbooking;

}

