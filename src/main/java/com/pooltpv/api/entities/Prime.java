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
public class Prime {
    @Id
    @Column(name = "NUMEQUIT")
    private String numeQuittance;
    @Column(name = "accessoire")
    private double fraisAccessoire;
    @Column(name = "tva")
    private double taxeValeurAjoutee;
}
