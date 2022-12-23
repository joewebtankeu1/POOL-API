package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.EnergieDTO;
import com.pooltpv.api.entities.Energie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(
        componentModel = "spring"
)
public interface EnergieMapper {
    @Mapping(source="codeEnergie",target ="code" )
    @Mapping(source="libeEnergie",target ="libelle" )
    EnergieDTO energieToEnergieDTO(Energie energie);
}

