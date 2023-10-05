package com.pooltpv.api.service;

import com.pooltpv.api.dto.RisquesDTO;
import com.pooltpv.api.entities.Risques;
import com.pooltpv.api.mappers.RisquesMapper;
import com.pooltpv.api.repositories.RisquesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class RisquesServiceImpl implements RisquesService {
    private final RisquesRepository risquesRepository;
    private final RisquesMapper risquesMapper;


    @Override
    public List<RisquesDTO> listRisquesDTO(int codeCompagnie, Date dateDebut, Date dateFin) throws NoSuchElementException {

        List<RisquesDTO> listRisquesDTO = risquesRepository.findRisques(codeCompagnie, dateDebut, dateFin)
                .stream()
                .map(risques -> buildRisquesDto(risques))
                .collect(Collectors.toList());

        if (listRisquesDTO.isEmpty()) throw new NoSuchElementException();

        return listRisquesDTO;
    }

    private RisquesDTO buildRisquesDto(Risques risques) {
        RisquesDTO risquesDTO = risquesMapper.risquesToRisquesDTO(risques);
        if (risquesDTO.getQualite().equals("PM")) {
            risquesDTO.setSexe("Null");
        } else {
            if (risquesDTO.getCivilite() != null) {
                if (risquesDTO.getCivilite().equals("M")) {
                    risquesDTO.setSexe("Homme");
                } else if (risquesDTO.getCivilite().equals("Mme") || risquesDTO.getCivilite().equals("Mlle")) {
                    risquesDTO.setSexe("Femme");
                }
            } else risquesDTO.setSexe("Null");
        }
        if (risquesDTO.getFlotte().equals("FLOTTE")) risquesDTO.setPrimeTtc((long) 0);

        return risquesDTO;

    }

}
