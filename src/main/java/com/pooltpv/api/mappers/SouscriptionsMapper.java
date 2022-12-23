package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.SouscriptionsDTO;
import com.pooltpv.api.dto.VehiculeDTO;
import com.pooltpv.api.entities.Polices;
import com.pooltpv.api.entities.Souscriptions;
import com.pooltpv.api.entities.Vehicule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(
        componentModel = "spring"
)
public interface SouscriptionsMapper {
     //@Mapping(target ="id", ignore= true )
     @Mapping(target ="garanties", ignore= true )
     SouscriptionsDTO policesToSouscriptionsDTO(Souscriptions souscriptions);
}

