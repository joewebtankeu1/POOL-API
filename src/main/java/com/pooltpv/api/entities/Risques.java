package com.pooltpv.api.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Risques {
    @Id
    @Column(name = "U_CLE_P")
    private String id;

    @Column(name = "NUMEPOLI")
    private String numPolice;

    @Column(name = "FLOTTE")
    private String flotte;

    @Column(name = "MOUVEMENT")
    private String avenant;

    @Column(name = "DATESOUS")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDateTime dateEmission;


    @Column(name = "HEURESOUS")
    @Temporal(TemporalType.TIME)
    private Date heureEmission;

    @Column(name = "DATEFFET")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateEffet;

    @Column(name = "DATEECHE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateExpiration;

    @Column(name = "DUREE")
    private String duree;

    @Column(name = "IMMATRICULATION")
    private String immatriculation;

    @Column(name = "ASPUISSANCE")
    private Integer puissance;

    @Column(name = "SE")
    private String energie;

    @Column(name = "GENRE")
    private String genreAuto;

    @Column(name = "MARQUE")
    private String libelleMarque;

    @Column(name = "TYPEVEHI")
    private String typeVeh;

    @Column(name = "PLACE")
    private Integer nbrePlaces;

    @Column(name = "DATE_PREM_MEC")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateMc;

    @Transient
    private int poidsVide;

    @Column(name = "ASVAL_VENALE")
    private BigDecimal valeurVenale;

    @Column(name = "VAL_NEUVE")
    private BigDecimal valeurNeuve;

    @Column(name = "CATEGORIE")
    private Integer categorie;

    @Column(name = "SOUS_CAT_NOM")
    private String sousCategorie;

    @Column(name = "CHASSIS")
    private String numChassis;

    @Column(name = "ASSURE_NOM")
    private String nomClient;


    @Column(name = "MOBILE")
    private String telclient;

    @Column(name = "LIBEVILL")
    private String adresseclient;

    @Column(name = "DATENAIS")
    private Date dateNaissance;

    @Column(name = "QUALITE")
    private String qualite;

    @Column(name = "SEXERISQ")
    private String civilite;

    @Transient
    private String sexe;

    @Transient
    private String typePiece;

    @Transient
    private String numPiece;

    @Transient
    private String situationMat;

    @Transient
    private String nationalite;

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

    @Column(name = "PRIME_NETTE")
    private double primeNette;

    @Column(name = "DROIT_TIMBRE")
    private double dta;

    @Column(name = "PRIMETTC")
    private double primeTtc;

    @Column(name = "ATTESTATION")
    private String attestation;

    @Transient
    private String carteRose;
}
