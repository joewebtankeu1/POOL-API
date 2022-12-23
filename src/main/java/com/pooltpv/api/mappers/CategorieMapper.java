package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.CategorieDTO;
import com.pooltpv.api.entities.Categorie;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategorieMapper {
    CategorieMapper INSTANCE = Mappers.getMapper(CategorieMapper.class);
    public CategorieDTO catorieToCategorieDTO(Categorie categorie);
}

