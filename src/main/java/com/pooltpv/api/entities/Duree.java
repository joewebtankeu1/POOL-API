package com.pooltpv.api.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Duree {
    @Id
    @Column(name = "codedure")
    private String codeDuree;

    @Column(name = "libedure")
    private String libeDuree;

}
