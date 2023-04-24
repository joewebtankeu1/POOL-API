package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.RisquesDTO;
import com.pooltpv.api.entities.Risques;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(
        componentModel = "spring"
)
public interface RisquesMapper {
     RisquesDTO risquesToRisquesDTO(Risques risques);
}

