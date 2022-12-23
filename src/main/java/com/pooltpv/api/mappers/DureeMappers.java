package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.DureeDTO;
import com.pooltpv.api.entities.Duree;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DureeMappers {
    @Mapping(source="codeDuree",target ="code" )
    @Mapping(source="libeDuree",target ="libelle" )
    DureeDTO dureeToDureeDTO(Duree duree);


}

