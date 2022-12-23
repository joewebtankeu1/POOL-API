package com.pooltpv.api.service;

import com.pooltpv.api.dto.*;
import com.pooltpv.api.entities.Souscripteur;
import com.pooltpv.api.mappers.SouscripteurMapper;
import com.pooltpv.api.repositories.SouscripteurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class SouscripteurServiceImpl implements SouscripteurService {
    private final SouscripteurRepository souscripteurRepository;
    private final SouscripteurMapper souscripteurMapper;
    private final CiviliteService civiliteService;

    private Map<String, CiviliteDTO> civiliteDTOMap;
    @Override
    public List<SouscripteurDTO> listSouscripteur(int codeCompagnie, Date dateDebut, Date dateFin) {
        loadConfig();
        return souscripteurRepository.findSouscripteur(codeCompagnie,dateDebut,dateFin)
                .stream()
                .map(souscripteur -> buildSouscripteurDTO(souscripteur))
                .collect(Collectors.toList());
    }

    private void loadConfig() {
        civiliteDTOMap = civiliteService.listCiviliteDTO().stream()
                .collect(Collectors.toMap(CiviliteDTO::getCode, Function.identity()));
    }
    private SouscripteurDTO buildSouscripteurDTO(Souscripteur souscripteur) {
        SouscripteurDTO souscripteurDTO = souscripteurMapper.souscripteurToSouscripteurDTO(souscripteur);

        if (souscripteur.getGenreAssure().equals("PP")) {
            souscripteurDTO.setPersonneMorale(false);
        } else {
            souscripteurDTO.setPersonneMorale(true);
        }
        if(souscripteur.getCivilite()==null){
            souscripteurDTO.setCivilite(new CiviliteDTO());
        }else{
            souscripteurDTO.setCivilite(civiliteDTOMap.get(souscripteur.getCivilite()));
        }
        return souscripteurDTO;
    }

}
