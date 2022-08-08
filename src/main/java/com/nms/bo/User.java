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
@Table(name="USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USER_ID")
	protected int uid;
	
	@Column(name="USER_NAME")
	protected String uname;
	
	protected String password;
	
	protected String gender;
	
	@Column(name="PH_NO")
	protected int phno;
	
	@Column(name="EMAIL_ID")
	protected String emailId;
    
	protected int age;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	protected Set<TicketBooking> bookings;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	protected Set<Payment> payment;

	public User(int uid, String uname, String password, String gender, int phno, String emailId, int age,
			Set<TicketBooking> bookings, Set<Payment> payment) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.gender = gender;
		this.phno = phno;
		this.emailId = emailId;
		this.age = age;
		this.bookings = bookings;
		this.payment = payment;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<TicketBooking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<TicketBooking> bookings) {
		this.bookings = bookings;
	}

	public Set<Payment> getPayment() {
		return payment;
	}

	public void setPayment(Set<Payment> payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", password=" + password + ", gender=" + gender + ", phno="
				+ phno + ", emailId=" + emailId + ", age=" + age + ", bookings=" + bookings + ", payment=" + payment
				+ "]";
	}

	
	
	
	
	
	

}
