package com.pooltpv.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Intermediaire {
    @Id
    @Column(name = "CODEINTE")
    private String codeInte;
    @Column(name = "RAISOCIN")
    private String raisonSociale;
    @Column(name = "CODTYPIN")
    private String codeTypeInte;
    @Column(name = "CODEVILL")
    private String codeVille;

}
