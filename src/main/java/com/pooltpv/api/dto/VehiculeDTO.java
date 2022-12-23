package com.pooltpv.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.pooltpv.api.entities.Categorie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor
@JsonPropertyOrder({"IMM","CHA","attributs"})
public class VehiculeDTO {
    private String id1;
    private String IMM;
    private String CHA;
    private List<AttributsDTO> attributs;
}
