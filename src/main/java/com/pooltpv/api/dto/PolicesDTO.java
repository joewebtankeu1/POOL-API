package com.pooltpv.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor
@JsonPropertyOrder({"id",
        "tauxCommission","exercice","numPolice","CODTYPAV", "avenant","duree", "dateEmission"
       ,"dateEffet","dateExpiration","souscripteur","prime","immatriculation","puissance",
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
public class PolicesDTO {
    private String id;
    private String tauxCommission;
    private String exercice;
    private String numeroPolice;
    @JsonIgnore
    private String flotte;
    private TypeAvenantDTO numeroAvenant;
    private DureeDTO duree;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime dateEmission;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateEffet;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateEcheance;
    private SouscripteurDTO souscripteur;
    private PrimeDTO prime;
    private List<VehiculeDTO> vehicule;
    private SouscriptionsDTO souscriptions;

}
