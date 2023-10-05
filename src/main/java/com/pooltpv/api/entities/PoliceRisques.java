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
public class PoliceRisques {
    @Id
    @Column(name = "U_CLE_P")
    private String id;
    @Column(name = "CODE_CIE")
    private int codeCompagnie;
    @Column(name = "CODEINTE")
    private int codeIntermediaire;
    @Column(name = "NUMEPOLI")
    private String numPolice;
    @Column(name = "CODECATE")
    private int codeCategorie;
    @Column(name = "CODTYPAV")
    private int codeTypeAvenant;
    @Column(name = "MOUVEMENT")
    private String avenant;
    @Column(name = "NUMEAVEN")
    private int numAvenant;
    @Column(name = "NOMBRE_VEHICULE")
    private int nombreVehicule;
    @Column(name = "DATESOUS")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDateTime dateEmission;
    @Column(name = "DATEEFFE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateEffet;
    @Column(name = "DATEECHE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateExpiration;
    @Column(name = "CODEDURE")
    private String codeDuree;
    @Column(name = "CODEASSU")
    private String codeAssure;
    @Column(name = "RAISSOCI")
    private String nomAssure;
    @Column(name = "PRENASSU")
    private String prenomAssure;
    @Column(name = "ADREASSU")
    private String adresseAssure;
    @Column(name = "CODEPROF")
    private int codeProfession;
    @Column(name = "GENRASSU")
    private String genreAssure;
    @Column(name = "NUMEQUIT")
    private String numeroQuittance;
    @Column(name = "PRIMNETT")
    private int primeNette;
    @Column(name = "ACCEQUIT")
    private int accessoire;
    @Column(name = "TAXEQUI2")
    private int tva;
    @Column(name = "FC")
    private int fc;
    @Column(name = "CARTE_ROSE")
    private int carteRose;
    @Column(name = "TIMBGRAD")
    private int droitTimbre;
    @Column(name = "PRIMTOTA")
    private int primeTtc;

    @Column(name = "ETATQUIT")
    private String etatEncaissement;
    @Column(name = "MODEPAIE")
    private String modeEncaissement;

}
