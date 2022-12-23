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
public class TypeAvenant {
    @Id
    @Column(name = "CODTYPAV")
    private String codeTypeAvenant;

    @Column(name = "LIBTYPAV")
    private String libTypeAvenant;

}
