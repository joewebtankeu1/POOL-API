package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.EncaissementDTO;
import com.pooltpv.api.dto.PrimeDTO;
import com.pooltpv.api.entities.Encaissement;
import com.pooltpv.api.entities.Prime;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface EncaissementMapper {

     @Mapping(source="dateEncaissement",target ="dateEncaissement" )
     EncaissementDTO encaissementToEncaissementDTO(Encaissement encaissement);


}

