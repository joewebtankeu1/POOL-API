package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.PrimeDTO;
import com.pooltpv.api.entities.Prime;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface PrimeMapper {

     PrimeDTO primeToPrimeDTO(Prime prime);


}

