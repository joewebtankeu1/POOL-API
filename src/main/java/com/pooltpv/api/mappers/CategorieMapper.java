package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.CategorieDTO;
import com.pooltpv.api.entities.Categorie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface CategorieMapper {
    @Mapping(source="codeCate",target ="code" )
    @Mapping(source="libeCate",target ="libelle" )
    public CategorieDTO categorieToCategorieDTO(Categorie categorie);
}

