package com.pooltpv.api.service;

import com.pooltpv.api.dto.*;
import com.pooltpv.api.entities.Polices;
import com.pooltpv.api.mappers.PolicesMapper;
import com.pooltpv.api.repositories.PolicesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class PolicesServiceImpl implements PolicesService {
    private final PolicesRepository policesRepository;
    private final PolicesMapper policesMapper;
    private final DureeService dureeService;
    private final TypeAvenantService typeAvenantService;
    private final SouscripteurService souscripteurService;
    private final VehiculeService vehiculeService;
    private final SouscriptionsService souscriptionsService;
    private final PrimeService primeService;
    private Map<String, DureeDTO> dureeDTOMap;
    private Map<String, TypeAvenantDTO> typeAvenantDTOMap;
    private Map<String,SouscripteurDTO> souscripteurDTOMap;
    private Map<String,VehiculeDTO> vehiculeDTOMap;
    private Map<String,SouscriptionsDTO> souscriptionsDTOMap;
    private Map<String,PrimeDTO> primeDTOMap;



    @Override
    public List<PolicesDTO> listPolicesDTO(int codeCompagnie, Date dateDebut, Date dateFin) throws NoSuchElementException {
        loadConfig(codeCompagnie,dateDebut,dateFin);

        List<PolicesDTO> policesDTO = policesRepository.findRPolices(codeCompagnie, dateDebut, dateFin)
                .stream()
                .map(this::buildRisquesDto)
                .collect(Collectors.toList());

        if (policesDTO.isEmpty()) throw new NoSuchElementException();

        return policesDTO;
    }

    private void loadConfig(int codeCompagnie, Date dateDebut, Date dateFin) {
        dureeDTOMap = dureeService.listDureeDTO().stream()
                .collect(Collectors.toMap(DureeDTO::getCode, Function.identity()));

        typeAvenantDTOMap = typeAvenantService.listTypeAvenantDTO().stream()
                .collect(Collectors.toMap(TypeAvenantDTO::getCode, Function.identity()));

        souscripteurDTOMap = souscripteurService.listSouscripteur(codeCompagnie,dateDebut,dateFin).stream()
                .collect(Collectors.toMap(SouscripteurDTO::getReference,Function.identity()));

        vehiculeDTOMap = vehiculeService.listVehiculeDTO(codeCompagnie,dateDebut,dateFin).stream()
                .collect(Collectors.toMap(VehiculeDTO::getId1,Function.identity()));

        souscriptionsDTOMap = souscriptionsService.listSouscriptionDTO(codeCompagnie,dateDebut,dateFin).stream()
                .collect(Collectors.toMap(SouscriptionsDTO::getId,Function.identity()));

        primeDTOMap = primeService.listPrime(codeCompagnie,dateDebut,dateFin).stream()
                .collect(Collectors.toMap(PrimeDTO::getNumeQuittance,Function.identity()));
    }

    private PolicesDTO buildRisquesDto(Polices polices) {
        PolicesDTO policesDTO = policesMapper.policesToPoliceDTO(polices);
        List<VehiculeDTO> vehiculeDTOS = new ArrayList<>();
        if(polices.getDateEffet()==null){
            policesDTO.setExercice("0");
        }else{
            Date date =polices.getDateEffet();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            policesDTO.setExercice(String.valueOf(calendar.get(Calendar.YEAR)));
        }

        if(polices.getDuree()==null){
            policesDTO.setDuree(new DureeDTO());
        }else{
            policesDTO.setDuree(dureeDTOMap.get(polices.getDuree()));
        }
        if(polices.getAvenant()==null){
            policesDTO.setNumeroAvenant(new TypeAvenantDTO("0","Affaire Nouvelle"));
        }else{
            policesDTO.setNumeroAvenant(typeAvenantDTOMap.get(polices.getAvenant()));
        }
        if(polices.getSouscripteur()==null){
            policesDTO.setSouscripteur(new SouscripteurDTO());
        }else{
            policesDTO.setSouscripteur(souscripteurDTOMap.get(polices.getSouscripteur()));
        }
        if(polices.getImmatriculation()==null){
            policesDTO.setVehicule( new VehiculeDTO());
        }else{
            policesDTO.setVehicule(vehiculeDTOMap.get(polices.getId1()));
        }
        if(polices.getId()!=null){
            policesDTO.setSouscriptions(souscriptionsDTOMap.get(polices.getId1()));
        }

        if(polices.getPrime()==null){
            policesDTO.setPrime(new PrimeDTO());
        }else{
            policesDTO.setPrime(primeDTOMap.get(polices.getPrime()));
        }
        return policesDTO;
    }
}
