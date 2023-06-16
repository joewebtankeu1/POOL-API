package com.pooltpv.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor @AllArgsConstructor
@JsonPropertyOrder({"codeInte", "raisonSociale", "typeInte", "codeVille"})
public class IntermediaireDTO {
    private String codeInte;
    private String raisonSociale;
    private String typeInte;
    private String codeVille;
}
