package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.CiviliteDTO;
import com.pooltpv.api.entities.Civilite;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(
        componentModel = "spring"
)
public interface CiviliteMapper {
    @Mapping(source="codeCivilite",target ="code" )
    @Mapping(source="libeCivilite",target ="libelle" )
     CiviliteDTO CiviliteToCiviliteDTO(Civilite civilite);
}

