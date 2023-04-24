package com.pooltpv.api.service;

import com.pooltpv.api.dto.*;
import com.pooltpv.api.entities.PoliceRisques;
import com.pooltpv.api.exception.RisqueDtoException;
import com.pooltpv.api.mappers.PoliceRisquesMapper;
import com.pooltpv.api.repositories.PoliceRisquesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class PoliceRisquesServiceImpl implements PoliceRisquesService {
    private final PoliceRisquesRepository policeRisquesRepository;
    private final PoliceRisquesMapper policeRisquesMapper;
    private final RisquesService risquesService;
    private Map<String,RisquesDTO> risqueMap;


    @Override
    public List<PoliceRisquesDTO> listPoliceRisquesDTO(int codeCompagnie, Date dateDebut, Date dateFin) throws NoSuchElementException, RisqueDtoException {

        //loadConfig(codeCompagnie,dateDebut,dateFin);
        List<PoliceRisquesDTO> listPoliceRisquesDTO = policeRisquesRepository.findPoliceRisques(codeCompagnie, dateDebut, dateFin)
                .stream()
                .map(policeRisques -> buildPoliceRisquesDto(policeRisques))
                .collect(Collectors.toList());

        if (listPoliceRisquesDTO.isEmpty()) throw new NoSuchElementException();

        return listPoliceRisquesDTO;
    }

    private void loadConfig(int codeCompagnie, Date dateDebut, Date dateFin) throws RisqueDtoException {
        risqueMap = risquesService.listRisquesDTO(codeCompagnie, dateDebut, dateFin).stream()
                .collect(Collectors.toMap(RisquesDTO::getId, Function.identity()));
    }

    private PoliceRisquesDTO buildPoliceRisquesDto(PoliceRisques policeRisques) {
        List<RisquesDTO> listRisqueDtos = new ArrayList<>();

        PoliceRisquesDTO policeRisquesDTO = policeRisquesMapper.policeRisquesToPoliceRisquesDTO(policeRisques);
        if(policeRisques.getNombreVehicule()>1){
            policeRisquesDTO.setFlotte("Flotte");
        }else{
            policeRisquesDTO.setFlotte("Mono");
        }

        //policeRisquesDTO.setRisques(risqueMap.get(policeRisques.getId()));
        return  policeRisquesDTO;
    }

}
