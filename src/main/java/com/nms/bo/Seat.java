package com.nms.bo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SEAT")
public class Seat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SEAT_ID")
	protected int seatid;
	
	@Column(name="SEAT_NUMBER")
	protected String seatnumber;
	
	@OneToMany(mappedBy = "seat", cascade = CascadeType.ALL)
	protected Set<TicketBooking> ticketbooking;

	public Seat(int seatid, String seatnumber, Set<TicketBooking> ticketbooking) {
		super();
		this.seatid = seatid;
		this.seatnumber = seatnumber;
		this.ticketbooking = ticketbooking;
	}

	public int getSeatid() {
		return seatid;
	}

	public void setSeatid(int seatid) {
		this.seatid = seatid;
	}

	public String getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(String seatnumber) {
		this.seatnumber = seatnumber;
	}

	public Set<TicketBooking> getTicketbooking() {
		return ticketbooking;
	}

	public void setTicketbooking(Set<TicketBooking> ticketbooking) {
		this.ticketbooking = ticketbooking;
	}

	@Override
	public String toString() {
		return "Seat [seatid=" + seatid + ", seatnumber=" + seatnumber + ", ticketbooking=" + ticketbooking + "]";
	}
	
	

}
