package com.pooltpv.api.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Souscriptions {
    @Id
    @Column(name = "U_CLE")
    private String  id;
    @Column(name = "DATEFFET")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateEffet;

    @Column(name = "DATEECHE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateEcheance;
    @Column(name = "RC")
    private double rc;

    @Column(name = "DR")
    private double dr;

    @Column(name = "IC")
    private double ipt;

    @Column(name = "BDG")
    private double bdg;

    @Column(name = "INC")
    private double inc;
    @Column(name = "VOL")
    private double vol;
    @Column(name = "DTC")
    private double dtc;

}
