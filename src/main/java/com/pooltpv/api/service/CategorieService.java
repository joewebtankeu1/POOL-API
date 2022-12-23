package com.pooltpv.api.service;

import com.pooltpv.api.dto.CategorieDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategorieService {
    List<CategorieDTO> listCategorieTO();
}
