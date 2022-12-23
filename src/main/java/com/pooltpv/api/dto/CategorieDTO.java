package com.pooltpv.api.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.pooltpv.api.entities.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import java.util.Collection;

@Data
@NoArgsConstructor @AllArgsConstructor
@JsonPropertyOrder({"codeSCate", "libeDure"})
public class CategorieDTO {
    public String codeCate;
    public String libeCate;
    private Collection<Vehicule> vehicules;
}
