package com.nms.bo;

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

	public TicketBooking(int bookId, String uname, String tname, Date showdate, LocalTime showtime, int nooftickets,
			float price, User user, Screening screening, Seat seat) {
		super();
		this.bookId = bookId;
		this.uname = uname;
		this.tname = tname;
		this.showdate = showdate;
		this.showtime = showtime;
		this.nooftickets = nooftickets;
		this.price = price;
		this.user = user;
		this.screening = screening;
		this.seat = seat;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Date getShowdate() {
		return showdate;
	}

	public void setShowdate(Date showdate) {
		this.showdate = showdate;
	}

	public LocalTime getShowtime() {
		return showtime;
	}

	public void setShowtime(LocalTime showtime) {
		this.showtime = showtime;
	}

	public int getNooftickets() {
		return nooftickets;
	}

	public void setNooftickets(int nooftickets) {
		this.nooftickets = nooftickets;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
    
	public Screening getScreening() {
		return screening;
	}

	public void setScreening(Screening screening) {
		this.screening = screening;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "TicketBooking [bookId=" + bookId + ", uname=" + uname + ", tname=" + tname + ", showdate=" + showdate
				+ ", showtime=" + showtime + ", nooftickets=" + nooftickets + ", price=" + price + ", user=" + user
				+ ", screening=" + screening + ", seat=" + seat + "]";
	}

	

}
