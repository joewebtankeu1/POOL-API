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
@JsonPropertyOrder({"id","codeCompagnie","codeIntermediaire","numPolice","flotte","codeTypeAvenant", "avenant","numAvenant","dateEmission"
        ,"heureEmission","dateEffet","dateExpiration","codeDuree","duree","codeUsage","immatriculation","puissance",
"codeEnergie","codeGenreAuto","genre","libelleMarque","typeVeh","nbrePlaces","dateMc","poidsVide","valeurVenale",
"valeurNeuve","categorie","sousCategorie","numChassis","codeClient", "nomClient", "numClient", "telClient", "adresseClient","codeVille",
        "dateNaissance","codeCivil",
        "civilite",
        "codeProfession",
        "profession",
        "sexe",
        "typePiece",
        "numPiece",
        "situationMat",
        "nationalite",
        "rc",
        "dr",
        "bdg",
        "ipt",
        "inc",
        "vol",
        "volp",
        "volb",
        "volacc",
        "av",
        "primeNette",
        "droitTimbre",
        "primeTtc",
        "attestation",
        "carteRose"})
public class RisquesDTO {
    private String id;
    private int codeCompagnie;
    private int codeIntermediaire;
    private String numPolice;
    private String flotte;
    private String avenant;
    private int numAvenant;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime dateEmission;
    @Temporal(TemporalType.TIME)
    private Date heureEmission;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateEffet;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateExpiration;

    private String codeDuree;

    private String duree;

    private String codeUsage;
    private String immatriculation;

    private Integer puissance;

    private String codeEnergie;

    private String codeGenreAuto;
    private String genre;

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
    private String codeClient;
    private String nomClient;
    private String numClient;

    private String telClient;

    private String adresseClient;
    private String codeVille;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateNaissance;

    @JsonIgnore
    private String qualite;
    private String codeCivil;
    private String civilite;
    private String codeProfession;
    private String profession;

    private String sexe;

    private String typePiece;

    private String numPiece;

    private String situationMat;

    private String nationalite;

    private Long rc;

    private Long dr;

    private Long ipt;
    private Long bdg;

    private Long inc;

    private Long vol;
    private Long dta;
    private Long dtc;
    private Long primeNette;

    private Long droitTimbre;

    private Long primeTtc;

    private String attestation;

    private String carteRose;
    private int codeTypeAvenant;

}
