package com.pooltpv.api.dto;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor @AllArgsConstructor
@JsonPropertyOrder({"CodeCie", "LibelleCie", "CodeAttest", "IsActivated"})
public class CompagnieDTO {
    
    private Integer  codeCie;
    private String libelleCie;
    private String codeAttest;
    private boolean  isActivated;
}
