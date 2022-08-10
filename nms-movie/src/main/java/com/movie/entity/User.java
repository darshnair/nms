package com.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="USERID")
    protected int uid;

    @Column(name="USERNAME")
    protected String uname;

    protected String password;

    protected String gender;

    @Column(name="PHNO")
    protected int phno;

    @Column(name="EMAILID")
    protected String emailId;

    protected int age;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    protected Set<TicketBooking> bookings;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    protected Set<Payment> payment;

}
