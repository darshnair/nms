package com.nms.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
