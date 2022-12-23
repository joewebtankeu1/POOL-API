package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.SouscripteurDTO;
import com.pooltpv.api.entities.Souscripteur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface SouscripteurMapper {
     @Mapping(source = "codeAssure",target = "reference")
     @Mapping(target ="civilite", ignore= true )
     SouscripteurDTO souscripteurToSouscripteurDTO(Souscripteur souscripteur);


}

