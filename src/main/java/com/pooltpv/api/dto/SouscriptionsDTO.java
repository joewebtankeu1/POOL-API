package com.pooltpv.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor
@JsonPropertyOrder({"garanties"})
public class SouscriptionsDTO {
    private String id;
    private List<GarantieDTO> garanties;
}
