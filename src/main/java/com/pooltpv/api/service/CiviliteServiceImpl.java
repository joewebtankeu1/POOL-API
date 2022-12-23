package com.pooltpv.api.service;


import com.pooltpv.api.dto.CiviliteDTO;
import com.pooltpv.api.mappers.CiviliteMapper;
import com.pooltpv.api.repositories.CiviliteRepository;
import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class CiviliteServiceImpl implements CiviliteService {
    private final CiviliteRepository civiliteRepository;
    private final CiviliteMapper civiliteMapper;

    @Override
    public List<CiviliteDTO> listCiviliteDTO() throws NoSuchElementException {

        List<CiviliteDTO> civiliteDTOS = civiliteRepository.findSCivilite()
                .stream()
                .map(civilite -> civiliteMapper.CiviliteToCiviliteDTO(civilite))
                .collect(Collectors.toList());
        return civiliteDTOS;

    }
}
