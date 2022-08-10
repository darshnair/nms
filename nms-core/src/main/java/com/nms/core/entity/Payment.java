package com.nms.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
