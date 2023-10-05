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
    @Column(name = "U_CLE")
    private String id;
    @Column(name = "CODEPROF")
    private int codeProfession;
    @Column(name = "CODE_CIE")
    private int codeCompagnie;
    @Column(name = "CODEINTESOUS")
    private int codeIntermediaire;
    @Column(name = "NUMEPOLI")
    private String numPolice;

    @Column(name = "FLOTTE")
    private String flotte;

    @Column(name = "MOUVEMENT")
    private String avenant;

    @Column(name = "NUM_NUMEAVEN")
    private int numAvenant;

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
    private String codeDuree;
    @Column(name = "LIBEDURE")
    private String duree;
    @Column(name = "CODUSAAU")
    private String codeUsage;

    @Column(name = "IMMATRICULATION")
    private String immatriculation;

    @Column(name = "ASPUISSANCE")
    private Integer puissance;

    @Column(name = "SE")
    private String codeEnergie;

    @Column(name = "CODGENAU")
    private String codeGenreAuto;
    @Column(name = "GENRE")
    private String genre;

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
    @Column(name = "CODEASSU")
    private String codeClient;

    @Column(name = "ASSURE_NOM")
    private String nomClient;

    @Column(name = "MOBILE")
    private String telClient;
    @Column(name = "ADREASSU")
    private String adresseclient;
    @Column(name = "CODEVILL")
    private String codeVille;

    @Column(name = "DATENAIS")
    private Date dateNaissance;

    @Column(name = "QUALITE")
    private String qualite;

    @Column(name = "CODECIVIL")
    private String codeCivil;

    @Column(name = "CIVILITES")
    private String civilite;
    @Column(name = "PROFESSION")
    private String profession;
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
    private Long rc;

    @Column(name = "DR")
    private Long dr;

    @Column(name = "IC")
    private Long ipt;

    @Column(name = "BDG")
    private Long bdg;

    @Column(name = "INC")
    private Long inc;

    @Column(name = "VOL")
    private Long vol;
    @Column(name = "DTA")
    private Long dta;
    @Column(name = "DTC")
    private Long dtc;
    @Column(name = "PRIME_NETTE")
    private Long primeNette;

    @Column(name = "DROIT_TIMBRE")
    private Long droitTimbre;

    @Column(name = "PRIMETTC")
    private Long primeTtc;

    @Column(name = "ATTESTATION")
    private String attestation;

    @Transient
    private String carteRose;

    @Column(name = "CODTYPAV")
    private int codeTypeAvenant;


}
