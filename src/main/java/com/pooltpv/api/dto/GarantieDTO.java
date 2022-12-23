package com.pooltpv.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor @AllArgsConstructor
@JsonPropertyOrder({"id","code", "dateEffet","DateEcheance","prime"})
public class GarantieDTO {
    private String id;
    private String code;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateEffet;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date DateEcheance;
    private Double prime;

}
