package com.pooltpv.api.service;


import com.pooltpv.api.dto.ReferenceVehiculeDTO;
import com.pooltpv.api.entities.ReferenceVehicule;
import com.pooltpv.api.mappers.ReferenceVehiculeMapper;
import com.pooltpv.api.repositories.ReferenceVehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class ReferenceVehiculeServiceImpl implements ReferenceVehiculeService {
    private final ReferenceVehiculeRepository referenceVehiculeRepository;
    private final ReferenceVehiculeMapper referenceVehiculeMapper;

    @Override
    public Page<ReferenceVehiculeDTO> listeReferenceVehicule(Pageable pageable,int limit) throws NoSuchElementException {

            Page<ReferenceVehicule> page = referenceVehiculeRepository.findAll(pageable); // Page<User>
            return new PageImpl<ReferenceVehiculeDTO>(page.stream().map(referenceVehicule -> buildToReferenceVehiculeDTO(referenceVehicule)).collect(Collectors.toList()),pageable,page.getTotalElements());
    }

    private ReferenceVehiculeDTO buildToReferenceVehiculeDTO(ReferenceVehicule referenceVehicule) {
        ReferenceVehiculeDTO referenceVehiculeDTO = referenceVehiculeMapper.referenceVehiculeToReferenceVehiculeDTO(referenceVehicule);
        return referenceVehiculeDTO;
    }
}
