package com.pooltpv.api.service;


import com.pooltpv.api.dto.CategorieDTO;
import com.pooltpv.api.mappers.CategorieMapper;
import com.pooltpv.api.repositories.CategorieRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Transactional
public class CategorieServiceImpl implements CategorieService {
    private CategorieRepository categorieRepository;
    private CategorieMapper categorieMapper = Mappers.getMapper(CategorieMapper.class);
    public CategorieServiceImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }


    @Override
    public List<CategorieDTO> listCategorieTO() throws NoSuchElementException {

        return categorieRepository.findCategorie()
                .stream()
                .map(categorie -> categorieMapper.catorieToCategorieDTO(categorie))
                .collect(Collectors.toList());


    }


}
