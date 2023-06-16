package com.pooltpv.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor @AllArgsConstructor
@JsonPropertyOrder({"codeCompagnie","codeIntermediaire","numPolice","codeCategorie","flotte","nombreVehicule", "codeTypeAvenant", "avenant","numAvenant","dateEmission"
        ,"heureEmission","dateEffet","dateExpiration","codeDuree","codeAssure","nomAssure","prenomAssure","adresseAssure","codeProfession","genreAssure",
        "numeroQuittance",
        "primeNette",
        "accessoire",
        "tva",
        "fc",
        "carteRose",
        "droitTimbre",
        "primeTtc",
        "etatEncaissement",
        "modeEncaissement"})
public class PoliceRisquesDTO {

    private int codeCompagnie;
    private int codeIntermediaire;
    private String numPolice;
    private int codeCategorie;
    private String flotte;
    private int nombreVehicule;
    private int codeTypeAvenant;
    private String avenant;
    private int numAvenant;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime dateEmission;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateEffet;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateExpiration;
    private String codeDuree;
    private String codeAssure;
    private String nomAssure;
    private String prenomAssure;
    private String adresseAssure;
    private int codeProfession;
    private String genreAssure;
    private String numeroQuittance;
    private double primeNette;
    private double accessoire;
    private double tva;
    private double fc;
    private double carteRose;
    private double droitTimbre;
    private double primeTtc;
    private String etatEncaissement;
    private String modeEncaissement;
    //private RisquesDTO risques;

}
