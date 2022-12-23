package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.TypeAvenantDTO;
import com.pooltpv.api.entities.TypeAvenant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface TypeAvenantMapper {
     @Mapping(source="codeTypeAvenant",target ="code" )
     @Mapping(source="libTypeAvenant",target ="libelle" )
     TypeAvenantDTO typeAvenantToTypeAvenantDTO(TypeAvenant typeAvenant);


}

