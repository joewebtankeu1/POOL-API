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
public class ReferenceVehicule {
    @Id
    @Column(name = "MARQVEHI")
    private String marque;
    @Column(name = "TYPEMOTE")
    private String codeEnergie;
    @Column(name = "TYPEVEHI")
    private String typeVeh;
    @Column(name = "PUISVEHI")
    private String puissance;
    @Column(name = "NOMBPLAC")
    private String nbrePlaces;

}
