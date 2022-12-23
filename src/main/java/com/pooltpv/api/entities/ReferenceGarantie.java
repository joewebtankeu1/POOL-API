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
public class ReferenceGarantie {
    @Id
    @Column(name = "CODEGARA")
    private String codeGarantie;

    @Column(name = "LIBEGARA")
    private String libeGarantie;

}
