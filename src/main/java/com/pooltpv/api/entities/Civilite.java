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
public class Civilite {
    @Id
    @Column(name = "CODEQUAL")
    private String codeCivilite;

    @Column(name = "LIBEQUAL")
    private String libeCivilite;

}
