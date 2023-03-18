package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.PoliceRisquesDTO;
import com.pooltpv.api.dto.RisquesDTO;
import com.pooltpv.api.entities.PoliceRisques;
import com.pooltpv.api.entities.Risques;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(
        componentModel = "spring"
)
public interface PoliceRisquesMapper {

    // @Mapping(target ="risques", ignore= true )
     PoliceRisquesDTO policeRisquesToPoliceRisquesDTO(PoliceRisques policeRisques);
}

