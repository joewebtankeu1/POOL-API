package com.pooltpv.api.service;


import com.pooltpv.api.dto.EnergieDTO;
import com.pooltpv.api.entities.Energie;
import com.pooltpv.api.mappers.EnergieMapper;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
@Data
public class EnergieServiceImpl implements EnergieService {
   private final  EnergieMapper energieMapper;
   private Energie essence  = new Energie();


    @Override
    public List<EnergieDTO> listEnergieTO() throws NoSuchElementException{
        List<EnergieDTO> listEnergieDTO = new ArrayList<EnergieDTO>();
        essence.setCodeEnergie("D");
        essence.setLibeEnergie("Diesel");

        EnergieDTO energieDTOD = energieMapper.energieToEnergieDTO(new Energie("D","DIESEL"));
        EnergieDTO energieDTOE = energieMapper.energieToEnergieDTO(new Energie("E","ESSENCE"));
        listEnergieDTO.add(energieDTOD);
        listEnergieDTO.add(energieDTOE);

        return listEnergieDTO;

    }

}
