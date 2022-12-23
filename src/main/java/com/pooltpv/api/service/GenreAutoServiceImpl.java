package com.pooltpv.api.service;


import com.pooltpv.api.dto.GenreAutoDTO;
import com.pooltpv.api.entities.GenreAuto;
import com.pooltpv.api.mappers.GenreAutoMapper;
import com.pooltpv.api.repositories.GenreAutoRepository;
import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class GenreAutoServiceImpl implements GenreAutoService {
    private final GenreAutoRepository genreAutoRepository;
    private final GenreAutoMapper genreAutoMapper;

    @Override
    public List<GenreAutoDTO> listGenreAutoDTO() throws NoSuchElementException {


        List<GenreAutoDTO> genreAutoDTO = new ArrayList<>();
        for (GenreAuto genreAuto : genreAutoRepository.findGenreAuto()) {
            GenreAutoDTO autoDTO = genreAutoMapper.genreAutoToGenreAutoDTO(genreAuto);
            genreAutoDTO.add(autoDTO);
        }
        return genreAutoDTO;


    }
}
