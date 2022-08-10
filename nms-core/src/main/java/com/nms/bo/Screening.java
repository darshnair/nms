package com.nms.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="SCREENING")
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SCREEN_ID")
    protected int screenid;

    protected LocalDate date;

    @Column(name = "SHOW_STARTTIME")
    protected LocalTime showstartTime;

    @Column(name="SHOW_ENDTIME")
    protected LocalTime showendtime;

    @Column(name="IS_FULL")
    protected boolean isfull;

    protected double price;

    @ManyToOne
    @JoinColumn(name="MOVIE_ID", nullable = false)
    protected Movie movie;

    @OneToMany(mappedBy = "screening", cascade = CascadeType.ALL)
    protected Set<TicketBooking> bookings;

}
