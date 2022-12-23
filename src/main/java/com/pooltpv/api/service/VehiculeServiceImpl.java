package com.pooltpv.api.service;


import com.pooltpv.api.dto.AttributsDTO;
import com.pooltpv.api.dto.EnergieDTO;
import com.pooltpv.api.dto.ValDTO;
import com.pooltpv.api.dto.VehiculeDTO;
import com.pooltpv.api.entities.Vehicule;
import com.pooltpv.api.mappers.VehiculeMapper;
import com.pooltpv.api.repositories.VehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class VehiculeServiceImpl implements VehiculeService {
    private final VehiculeRepository vehiculeRepository;
    private final EnergieService energieService;
    private final VehiculeMapper vehiculeMapper;
    private Map<String, EnergieDTO> energieDTOMap;

    @Override
    public List<VehiculeDTO> listVehiculeDTO(int codeCompagnie, Date dateDebut, Date dateFin) throws NoSuchElementException {
        loadConfig();
        List<VehiculeDTO> vehiculeDTOS = vehiculeRepository.findVehicule(codeCompagnie, dateDebut, dateFin)
                .stream()
                .map(vehicule -> buildVehiculeDTO(vehicule))
                .collect(Collectors.toList());
        return vehiculeDTOS;
    }

    private void loadConfig() {
        energieDTOMap = energieService.listEnergieTO().stream()
                .collect(Collectors.toMap(EnergieDTO::getCode, Function.identity()));
    }
    private VehiculeDTO buildVehiculeDTO(Vehicule vehicule) {
        VehiculeDTO vehiculeDTO = vehiculeMapper.vehiculeToVehiculeDTO(vehicule);

        if(vehicule.getCHA()==null){
             vehiculeDTO.setCHA(null);
        }else{
            vehiculeDTO.setCHA(vehicule.getCHA());
        }

        if(vehicule.getIMM()==null){
            List<AttributsDTO> listAttributDTO = new ArrayList<AttributsDTO>();
            vehiculeDTO.setAttributs(listAttributDTO);
        }else{
            List<AttributsDTO> listAttributDTO = new ArrayList<AttributsDTO>();
            listAttributDTO.add(new AttributsDTO("TYP",vehicule.getTYP()));
            listAttributDTO.add(new AttributsDTO("MAR",vehicule.getMAR()));
            listAttributDTO.add(new AttributsDTO("MOD",vehicule.getMOD()));
            listAttributDTO.add(new AttributsDTO("PUF",vehicule.getPUF()));
            listAttributDTO.add(new AttributsDTO("ANF",vehicule.getANF()));
            listAttributDTO.add(new AttributsDTO("DMC",vehicule.getDMC()));
            listAttributDTO.add(new AttributsDTO("VAL",vehicule.getVAL()));
            listAttributDTO.add(new AttributsDTO("VAN",vehicule.getVAN()));
            listAttributDTO.add(new AttributsDTO("USA",vehicule.getUSA()));
            listAttributDTO.add(new AttributsDTO("CAR",vehicule.getCAR()));
            listAttributDTO.add(new AttributsDTO("PLA",vehicule.getPLA()));
            listAttributDTO.add(new AttributsDTO("ENE",vehicule.getENE()));
            vehiculeDTO.setAttributs(listAttributDTO);
        }
        return vehiculeDTO;
    }
}
