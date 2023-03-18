package com.pooltpv.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor @AllArgsConstructor
@JsonPropertyOrder({"codeCompagnie","codeIntermediaire","numPolice","flotte","nombreVehicule", "avenant","numAvenant","dateEmission"
        ,"heureEmission","dateEffet","dateExpiration","numeroQuittance",
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
    private String flotte;
    private int nombreVehicule;
    private String avenant;
    private String numAvenant;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime dateEmission;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateEffet;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateExpiration;
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
