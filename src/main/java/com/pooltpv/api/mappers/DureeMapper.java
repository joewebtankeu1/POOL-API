package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.DureeDTO;
import com.pooltpv.api.entities.Duree;
import com.pooltpv.api.service.DureeService;
import com.pooltpv.api.service.DureeServiceImpl;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;


@Mapper(
        componentModel = "spring"
)
public interface DureeMapper {
    @Mapping(source="codeDuree",target ="code" )
    @Mapping(source="libeDuree",target ="libelle" )
    public DureeDTO dureeToDureeDTO(Duree duree);
}

