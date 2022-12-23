package com.pooltpv.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor @AllArgsConstructor
@JsonPropertyOrder({"numPolice", "avenant", "dateEmission"
        ,"heureEmission","dateEffet","dateExpiration","duree","immatriculation","puissance",
"energie","genre","libelleMarque","typeVeh","nbrePlaces","dateMc","poidsVide","valeurVenale",
"valeurNeuve","categorie","sousCategorie","numChassis", "nomClient", "numClient", "telClient", "adresseClient",
        "dateNaissance",
        "civilite",
        "sexe",
        "typePiece",
        "numPiece",
        "situationMat",
        "nationalite",
        "rc",
        "dr",
        "ipt",
        "tr",
        "inc",
        "vol",
        "volp",
        "volb",
        "volacc",
        "av",
        "primeNette",
        "dta",
        "primeTtc",
        "attestation",
        "carteRose"})
public class RisquesDTO {

    private String numPolice;

    @JsonIgnore
    private String flotte;

    private String avenant;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime dateEmission;

    @Temporal(TemporalType.TIME)
    private String heureEmission;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateEffet;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateExpiration;

    private String duree;

    private String immatriculation;

    private Integer puissance;

    private String energie;

    private String genreAuto;

    private String libelleMarque;

    private String typeVeh;

    private Integer nbrePlaces;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateMc;

    private int poidsVide;

    private BigDecimal valeurVenale;

    private BigDecimal valeurNeuve;

    private Integer categorie;

    private String sousCategorie;

    private String numChassis;

    private String nomClient;

    private String numClient;

    private String telClient;

    private String adresseClient;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateNaissance;

    @JsonIgnore
    private String qualite;

    private String civilite;

    private String sexe;

    private String typePiece;

    private String numPiece;

    private String situationMat;

    private String nationalite;

    private double rc;

    private double dr;

    private double ipt;

    private double tr;

    private double inc;

    private double vol;

    private double volp;

    private double volb;

    private double volacc;

    private double av;

    private double primeNette;

    private double dta;

    private double primeTtc;

    private String attestation;

    private String carteRose;

}
