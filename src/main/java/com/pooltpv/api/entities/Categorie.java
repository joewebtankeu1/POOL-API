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
public class Categorie {
    @Id
    @Column(name = "CODECATE")
    private String codeCate;
    @Column(name = "LIBECATE")
    private String libeCate;

}
