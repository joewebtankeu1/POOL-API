package com.pooltpv.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Vehicule {
    @Id
    @Column(name = "U_CLE")
    private String  id1;
    @Column(name = "IMM")
    private String  IMM;
    @Column(name = "CHA")
    private String  CHA;
    @Column(name = "TYP")
    private String  TYP;
    @Column(name = "PUF")
    private String  PUF;
    @Column(name = "ANF")
    private String  ANF;
    @Column(name = "DMC")
    private String  DMC;
    @Column(name = "VAL")
    private String  VAL;
    @Column(name = "PTA")
    private String  PTA;
    @Column(name = "PLA")
    private String  PLA;
    @Column(name = "COH")
    private String  COH;
    @Column(name = "NPC")
    private String  NPC;
    @Column(name = "DPC")
    private String  DPC;
    @Column(name = "MAR")
    private String  MAR;
    @Column(name = "MOD")
    private String  MOD;
    @Column(name = "USA")
    private String  USA;
    @Column(name = "CAR")
    private String  CAR;
    @Column(name = "ENE")
    private String  ENE;
    @Column(name = "VAN")
    private String  VAN;

}
