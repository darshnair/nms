package com.nms.bo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PAYMENT_ID")
	protected int paymentid;
	
	@Column(name = "PAY_AMOUNT")
	protected float payamount;
	
	@Column(name = "PAY_DESC")
	protected String paydescription;
	
	@Column(name = "PAY_DATE")
	protected LocalDate paydate;
	
	@ManyToOne
	@JoinColumn(name="USER_ID", nullable = false)
	protected User user;

	public Payment(int paymentid, float payamount, String paydescription, LocalDate paydate, User user) {
		super();
		this.paymentid = paymentid;
		this.payamount = payamount;
		this.paydescription = paydescription;
		this.paydate = paydate;
		this.user = user;
	}

	public int getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}

	public float getPayamount() {
		return payamount;
	}

	public void setPayamount(float payamount) {
		this.payamount = payamount;
	}

	public String getPaydescription() {
		return paydescription;
	}

	public void setPaydescription(String paydescription) {
		this.paydescription = paydescription;
	}

	public LocalDate getPaydate() {
		return paydate;
	}

	public void setPaydate(LocalDate paydate) {
		this.paydate = paydate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Payment [paymentid=" + paymentid + ", payamount=" + payamount + ", paydescription=" + paydescription
				+ ", paydate=" + paydate + ", user=" + user + "]";
	}
	
	

}
