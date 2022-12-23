package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.GenreAutoDTO;
import com.pooltpv.api.entities.GenreAuto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(
        componentModel = "spring"
)
public interface GenreAutoMapper {
     @Mapping(source="codeGenreAuto",target ="code" )
     @Mapping(source="libeGenreAuto",target ="libelle" )
     GenreAutoDTO genreAutoToGenreAutoDTO(GenreAuto genreAuto);
}

