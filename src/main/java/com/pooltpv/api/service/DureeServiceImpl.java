package com.pooltpv.api.service;

import com.pooltpv.api.dto.DureeDTO;
import com.pooltpv.api.entities.Duree;
import com.pooltpv.api.mappers.DureeMapper;
import com.pooltpv.api.mappers.DureeMappers;
import com.pooltpv.api.repositories.DureeRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Transactional
public class DureeServiceImpl implements DureeService {
    private DureeRepository dureeRepository;

    private DureeMapper dureeMapper = Mappers.getMapper(DureeMapper.class);;
    public DureeServiceImpl(DureeRepository dureeRepository) {
        this.dureeRepository = dureeRepository;

    }


    @Override
    public List<DureeDTO> listDureeDTO() throws NoSuchElementException {

        List<DureeDTO> dureeDTO = new ArrayList<>();
        for (Duree duree : dureeRepository.findDuree()) {
            DureeDTO dto = dureeMapper.dureeToDureeDTO(duree);
            dureeDTO.add(dto);
        }

        return dureeDTO;

    }

}
