package com.pooltpv.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"numeQuittance","fraisAccessoire","taxeValeurAjoutee"})
public class PrimeDTO {

    private String numeQuittance;

    private double fraisAccessoire;

    private double taxeValeurAjoutee;
}
