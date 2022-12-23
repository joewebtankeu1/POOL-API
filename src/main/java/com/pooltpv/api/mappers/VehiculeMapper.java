package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.VehiculeDTO;
import com.pooltpv.api.entities.Vehicule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(
        componentModel = "spring"
)
public interface VehiculeMapper {
     @Mapping(target ="attributs", ignore= true )
     VehiculeDTO vehiculeToVehiculeDTO(Vehicule vehicule);
}

