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
public class Usage {
    @Id
    @Column(name = "CODUSAAU")
    private String codeUsage;
    @Column(name = "LIBUSAAU")
    private String libeUsage;

}
