package com.nms.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
