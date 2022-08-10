package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PAYMENT")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PAYMENTID")
    protected int paymentid;

    @Column(name = "PAYAMOUNT")
    protected float payamount;

    @Column(name = "PAYDESC")
    protected String paydescription;

    @Column(name = "PAYDATE")
    protected LocalDate paydate;

    @ManyToOne
    @JoinColumn(name="USERID", nullable = false)
    protected User user;

}
