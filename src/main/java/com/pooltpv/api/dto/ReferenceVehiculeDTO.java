package com.pooltpv.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@NoArgsConstructor @AllArgsConstructor
@JsonPropertyOrder({"marque", "typeVeh", "codeEnergie", "puissance", "nombrePlace"})
public class ReferenceVehiculeDTO {
    private String marque;
    private String codeEnergie;
    private String typeVeh;
    private String puissance;
    private String nbrePlaces;
}
