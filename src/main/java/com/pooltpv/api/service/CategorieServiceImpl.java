package com.pooltpv.api.service;


import com.pooltpv.api.dto.CategorieDTO;
import com.pooltpv.api.dto.PrimeDTO;
import com.pooltpv.api.entities.Categorie;
import com.pooltpv.api.entities.Prime;
import com.pooltpv.api.mappers.CategorieMapper;
import com.pooltpv.api.repositories.CategorieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class CategorieServiceImpl implements CategorieService {
    private final CategorieRepository categorieRepository;
    private final CategorieMapper categorieMapper;

    @Override
    public List<CategorieDTO> listCategorieTO() throws NoSuchElementException {

        return categorieRepository.findCategorie()
                .stream()
                .map(categorie -> buildToCategorieDTo(categorie))
                .collect(Collectors.toList());
    }

    private CategorieDTO buildToCategorieDTo(Categorie categorie) {
        CategorieDTO categorieDTO = categorieMapper.categorieToCategorieDTO(categorie);
        return categorieDTO;
    }
}
