package com.pooltpv.api.service;


import com.pooltpv.api.dto.ReferenceGarantieDTO;
import com.pooltpv.api.entities.ReferenceGarantie;
import com.pooltpv.api.mappers.ReferenceGarantieMapper;
import com.pooltpv.api.repositories.ReferenceGarantieRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Transactional
public class ReferenceGarantieServiceImpl implements ReferenceGarantieService {
    private ReferenceGarantieRepository referenceGarantieRepository;
    private ReferenceGarantieMapper referenceGarantieMapper = Mappers.getMapper(ReferenceGarantieMapper.class);

    public ReferenceGarantieServiceImpl(ReferenceGarantieRepository referenceGarantieRepository) {
        this.referenceGarantieRepository = referenceGarantieRepository;
    }


    @Override
    public List<ReferenceGarantieDTO> listReferenceGarantieTO() throws NoSuchElementException {

        List<ReferenceGarantieDTO> referenceGarantieDTOS = referenceGarantieRepository.findReferenceGarantie()
                .stream()
                .map(referenceGarantie -> referenceGarantieMapper.referenceGarantieToReferenceGarantieDTO(referenceGarantie))
                .collect(Collectors.toList());
        return referenceGarantieDTOS;


    }
}
