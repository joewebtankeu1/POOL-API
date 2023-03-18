package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.CategorieDTO;
import com.pooltpv.api.entities.Categorie;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface CategorieMapper {
    public CategorieDTO categorieToCategorieDTO(Categorie categorie);
}

