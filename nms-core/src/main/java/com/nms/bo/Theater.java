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
@Table(name="THEATER")
public class Theater {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "THEATER_ID")
	protected int tid;
	
	@Column(name="THEATER_NAME")
	protected String tname;
	
	@Column(name="THEATER_ADDRESS")
	protected String taddress;
	
	@Column(name = "THEATER_MANAGER")
	protected String tmanager;
	
	@Column(name="THEATER_SIZE")
	protected String tsize;
	
	@Column(name="THEATER_COST")
	protected float tcost;
	
	@Column(name = "THEATER_TYPE")
	protected String ttype;
	
	@OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
	protected Set<Movie> movies;

	public Theater(int tid, String tname, String taddress, String tmanager, String tsize, float tcost, String ttype,
			Set<Movie> movies) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.taddress = taddress;
		this.tmanager = tmanager;
		this.tsize = tsize;
		this.tcost = tcost;
		this.ttype = ttype;
		this.movies = movies;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTaddress() {
		return taddress;
	}

	public void setTaddress(String taddress) {
		this.taddress = taddress;
	}

	public String getTmanager() {
		return tmanager;
	}

	public void setTmanager(String tmanager) {
		this.tmanager = tmanager;
	}

	public String getTsize() {
		return tsize;
	}

	public void setTsize(String tsize) {
		this.tsize = tsize;
	}

	public float getTcost() {
		return tcost;
	}

	public void setTcost(float tcost) {
		this.tcost = tcost;
	}

	public String getTtype() {
		return ttype;
	}

	public void setTtype(String ttype) {
		this.ttype = ttype;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Theater [tid=" + tid + ", tname=" + tname + ", taddress=" + taddress + ", tmanager=" + tmanager
				+ ", tsize=" + tsize + ", tcost=" + tcost + ", ttype=" + ttype + ", movies=" + movies + "]";
	}
	

	
}
