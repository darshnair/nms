package com.nms.bo;

import java.util.Date;
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

	public Movie(int movieID, String movieName, String duration, Date dateofbooking, String show, int nooftickets,
			Set<Screening> screening, Theater theater) {
		super();
		this.movieID = movieID;
		this.movieName = movieName;
		this.duration = duration;
		this.dateofbooking = dateofbooking;
		this.show = show;
		this.nooftickets = nooftickets;
		this.screening = screening;
		this.theater = theater;
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Date getDateofbooking() {
		return dateofbooking;
	}

	public void setDateofbooking(Date dateofbooking) {
		this.dateofbooking = dateofbooking;
	}

	public String getShow() {
		return show;
	}

	public void setShow(String show) {
		this.show = show;
	}

	public int getNooftickets() {
		return nooftickets;
	}

	public void setNooftickets(int nooftickets) {
		this.nooftickets = nooftickets;
	}

	public Set<Screening> getScreening() {
		return screening;
	}

	public void setScreening(Set<Screening> screening) {
		this.screening = screening;
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	@Override
	public String toString() {
		return "Movie [movieID=" + movieID + ", movieName=" + movieName + ", duration=" + duration + ", dateofbooking="
				+ dateofbooking + ", show=" + show + ", nooftickets=" + nooftickets + ", screening=" + screening
				+ ", theater=" + theater + "]";
	}

}
