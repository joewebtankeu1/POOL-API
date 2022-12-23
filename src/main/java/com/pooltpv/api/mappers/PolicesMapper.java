package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.PolicesDTO;
import com.pooltpv.api.dto.RisquesDTO;
import com.pooltpv.api.entities.Polices;
import com.pooltpv.api.entities.Risques;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(
        componentModel = "spring"
)
public interface PolicesMapper {

    @Mapping(target ="duree", ignore= true )
    @Mapping(target ="numeroAvenant", ignore= true )
    @Mapping(target ="souscripteur", ignore= true )
    @Mapping(target ="prime", ignore= true )
    @Mapping(target ="vehicule", ignore= true )
    @Mapping(target ="souscriptions", ignore= true )
    PolicesDTO policesToPoliceDTO(Polices polices);
}

