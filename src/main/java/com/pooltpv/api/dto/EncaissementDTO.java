package com.pooltpv.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"numeQuittance","NumeroEncaissement","numePolice","numeAvenant","natureMouvement"
        ,"codeAssure","dateEncaissement","modePaiement","refEncaissement","montantEncaisse","primeTotale","statut"})
public class EncaissementDTO {
    private String numeQuittance;
    private String NumeroEncaissement;
    private String numePolice;
    private int numeAvenant;
    private String natureMouvement;
    private String codeAssure;
    private String dateEncaissement;
    private String modePaiement;
    private String refEncaissement;
    private int montantEncaisse;
    private int primeTotale;
    private int statut;
}
