package com.pooltpv.api.service;


import com.pooltpv.api.dto.*;
import com.pooltpv.api.entities.Souscriptions;
import com.pooltpv.api.entities.Vehicule;
import com.pooltpv.api.mappers.SouscriptionsMapper;
import com.pooltpv.api.repositories.SouscriptionsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class SouscriptionsServiceImpl implements SouscriptionsService {
    private final SouscriptionsRepository souscriptionsRepository;
    private final SouscriptionsMapper souscriptionsMapper;

    @Override
    public List<SouscriptionsDTO> listSouscriptionDTO(int codeCompagnie, Date dateDebut, Date dateFin) throws NoSuchElementException {

        List<SouscriptionsDTO> souscriptionsDTOs = souscriptionsRepository.findSouscriptions(codeCompagnie, dateDebut, dateFin)
                .stream()
                .map(souscriptions -> builSouscriptionDTO(souscriptions))
                .collect(Collectors.toList());
        return souscriptionsDTOs;
    }


    private SouscriptionsDTO builSouscriptionDTO(Souscriptions souscriptions) {
        SouscriptionsDTO souscriptionsDTO = souscriptionsMapper.policesToSouscriptionsDTO(souscriptions);

        List<GarantieDTO> listGarantieDTOs = new ArrayList<GarantieDTO>();

        if(souscriptions.getRc()==0.0){
            listGarantieDTOs.add(new GarantieDTO());
        }else{
            listGarantieDTOs.add(new GarantieDTO("","RC",souscriptions.getDateEffet(),souscriptions.getDateEcheance(),souscriptions.getRc()));

        }
        if(souscriptions.getDr()==0.0){
            listGarantieDTOs.add(new GarantieDTO());
        }else{
            listGarantieDTOs.add(new GarantieDTO("","DR",souscriptions.getDateEffet(),souscriptions.getDateEcheance(),souscriptions.getDr()));

        }
        if(souscriptions.getIpt()==0.0){
            listGarantieDTOs.add(new GarantieDTO());
        }else{
            listGarantieDTOs.add(new GarantieDTO("","IPT",souscriptions.getDateEffet(),souscriptions.getDateEcheance(),souscriptions.getIpt()));
        }
        if(souscriptions.getInc()!=0.0){
            listGarantieDTOs.add(new GarantieDTO("","INC",souscriptions.getDateEffet(),souscriptions.getDateEcheance(),souscriptions.getInc()));
        }
        if(souscriptions.getVol()!=0.0){
            listGarantieDTOs.add(new GarantieDTO("","VOL",souscriptions.getDateEffet(),souscriptions.getDateEcheance(),souscriptions.getVol()));
        }
        if(souscriptions.getBdg()!=0.0){
            listGarantieDTOs.add(new GarantieDTO("","BDG",souscriptions.getDateEffet(),souscriptions.getDateEcheance(),souscriptions.getBdg()));
        }
        if(souscriptions.getDtc()!=0.0){
            listGarantieDTOs.add(new GarantieDTO("","DTC",souscriptions.getDateEffet(),souscriptions.getDateEcheance(),souscriptions.getDtc()));
        }

         souscriptionsDTO.setGaranties(listGarantieDTOs);
        return souscriptionsDTO;
    }
}
