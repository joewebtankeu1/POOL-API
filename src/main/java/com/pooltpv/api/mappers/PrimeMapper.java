package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.PrimeDTO;
import com.pooltpv.api.dto.SouscripteurDTO;
import com.pooltpv.api.entities.Prime;
import com.pooltpv.api.entities.Souscripteur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface PrimeMapper {

     PrimeDTO prmeToPrimeDTO(Prime prime);


}

