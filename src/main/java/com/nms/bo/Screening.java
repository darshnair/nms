package com.nms.bo;

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

	public Screening(int screenid, LocalDate date, LocalTime showstartTime, LocalTime showendtime, boolean isfull,
			double price, Movie movie, Set<TicketBooking> bookings) {
		super();
		this.screenid = screenid;
		this.date = date;
		this.showstartTime = showstartTime;
		this.showendtime = showendtime;
		this.isfull = isfull;
		this.price = price;
		this.movie = movie;
		this.bookings = bookings;
	}

	public int getScreenid() {
		return screenid;
	}

	public void setScreenid(int screenid) {
		this.screenid = screenid;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getShowstartTime() {
		return showstartTime;
	}

	public void setShowstartTime(LocalTime showstartTime) {
		this.showstartTime = showstartTime;
	}

	public LocalTime getShowendtime() {
		return showendtime;
	}

	public void setShowendtime(LocalTime showendtime) {
		this.showendtime = showendtime;
	}

	public boolean isIsfull() {
		return isfull;
	}

	public void setIsfull(boolean isfull) {
		this.isfull = isfull;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Set<TicketBooking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<TicketBooking> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "Screening [screenid=" + screenid + ", date=" + date + ", showstartTime=" + showstartTime
				+ ", showendtime=" + showendtime + ", isfull=" + isfull + ", price=" + price + ", movie=" + movie
				+ ", bookings=" + bookings + "]";
	}
	
	
}
