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
public class GenreAuto {

    @Column(name = "CODGENAU")
    private String codeGenreAuto;
    @Id
    @Column(name = "LIBGENAU")
    private String libeGenreAuto;

}
