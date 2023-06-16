package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.IntermediaireDTO;
import com.pooltpv.api.entities.Intermediaire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface IntermediaireMapper {
    @Mapping(source="codeTypeInte",target ="typeInte" )
    IntermediaireDTO intermediaireToIntermediaireDTO(Intermediaire intermediaire);
}

