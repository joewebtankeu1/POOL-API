package com.pooltpv.api.service;


import com.pooltpv.api.dto.CategorieDTO;
import com.pooltpv.api.dto.IntermediaireDTO;
import com.pooltpv.api.entities.Categorie;
import com.pooltpv.api.entities.Intermediaire;
import com.pooltpv.api.mappers.CategorieMapper;
import com.pooltpv.api.mappers.IntermediaireMapper;
import com.pooltpv.api.repositories.CategorieRepository;
import com.pooltpv.api.repositories.IntermediaireRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class IntermediaireServiceImpl implements IntermediaireService {
    private final IntermediaireRepository intermediaireRepository;
    private final IntermediaireMapper intermediaireMapper;

    @Override
    public List<IntermediaireDTO> listIntermediaire(int codeCompagnie) throws NoSuchElementException {

        return intermediaireRepository.findIntermediaire(codeCompagnie)
                .stream()
                .map(intermediaire -> buildIntermediaireDTO(intermediaire))
                .collect(Collectors.toList());
    }

    private IntermediaireDTO buildIntermediaireDTO(Intermediaire intermediaire) {
        IntermediaireDTO intermediaireDTO = intermediaireMapper.intermediaireToIntermediaireDTO(intermediaire);

        if(intermediaire.getCodeTypeInte().equals("D")){
            intermediaireDTO.setTypeInte("Bureau Direct");
        }else if(intermediaire.getCodeTypeInte().equals("T")){
            intermediaireDTO.setTypeInte("Courtier");
        }else if(intermediaire.getCodeTypeInte().equals("G")){
            intermediaireDTO.setTypeInte("Agent Général");
        }
        return intermediaireDTO;
    }
}
