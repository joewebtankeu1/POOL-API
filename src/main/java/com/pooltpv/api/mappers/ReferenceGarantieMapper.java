package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.ReferenceGarantieDTO;
import com.pooltpv.api.entities.ReferenceGarantie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(
        componentModel = "spring"
)
public interface ReferenceGarantieMapper {
   @Mapping(source="codeGarantie",target ="code" )
   @Mapping(source="libeGarantie",target ="libelle" )
   ReferenceGarantieDTO referenceGarantieToReferenceGarantieDTO(ReferenceGarantie referenceGarantie);
}

