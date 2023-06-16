package com.pooltpv.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor @AllArgsConstructor
@JsonPropertyOrder({"code", "libelle"})
public class UsageDTO {

    private String code;
    private String libelle;
}
