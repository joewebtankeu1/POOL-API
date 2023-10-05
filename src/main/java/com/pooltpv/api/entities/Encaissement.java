package com.pooltpv.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor

public class Encaissement {
    @Id
    @Column(name = "NUMEQUIT")
    private String numeQuittance;
    @Column(name = "NUMEENCA")
    private String NumeroEncaissement;
    @Column(name = "NUMEPOLI")
    private String numePolice;
    @Column(name = "NUMEAVEN")
    private int numeAvenant;
    @Column(name = "NATUMOUV")
    private String natureMouvement;
    @Column(name = "CODEASSU")
    private String codeAssure;
    @Column(name = "DATEENCA")
    private Date dateEncaissement;
    @Column(name = "MODEPAIE")
    private String modePaiement;
    @Column(name = "REFEENCA")
    private String refEncaissement;
    @Column(name = "NUMECHEQ")
    private String numeCheque;
    @Column(name = "MONTENCA")
    private int montantEncaisse;
    @Column(name = "PRIMTOTA")
    private int primeTotale;
    @Column(name = "SORTQUIT")
    private int statut;
}
