package com.pooltpv.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonPropertyOrder({"codeTypeAvenant", "libTypeAvenant"})
public class SouscripteurDTO {
    private String reference;
    private boolean personneMorale;
    private String operation;
    private String adresse;
    private String telephone;
    private String prenom;
    private String nom;
    private String email;
    private String sexe;
    private String dateNaissance;
    private String lieuNaissance;
    private CiviliteDTO civilite;
}
