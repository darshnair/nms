package com.nms.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="THEATER")
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "THEATERID")
    protected int tid;

    @Column(name="THEATERNAME")
    protected String tname;

    @Column(name="THEATERADDRESS")
    protected String taddress;

    @Column(name = "THEATERMANAGER")
    protected String tmanager;

    @Column(name="THEATERSIZE")
    protected String tsize;

    @Column(name="THEATERCOST")
    protected float tcost;

    @Column(name = "THEATERTYPE")
    protected String ttype;

//    @ManyToMany(mappedBy = "theaters", cascade = CascadeType.ALL)
//    private List<Movie> movies;

}
