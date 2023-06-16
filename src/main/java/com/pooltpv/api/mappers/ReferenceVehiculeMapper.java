package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.ReferenceVehiculeDTO;
import com.pooltpv.api.entities.ReferenceVehicule;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface ReferenceVehiculeMapper {

    public ReferenceVehiculeDTO referenceVehiculeToReferenceVehiculeDTO(ReferenceVehicule referenceVehicule);
}

