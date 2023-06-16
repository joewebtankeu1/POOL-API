package com.pooltpv.api.service;

import com.pooltpv.api.dto.CategorieDTO;
import com.pooltpv.api.dto.ReferenceVehiculeDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReferenceVehiculeService {
    Page<ReferenceVehiculeDTO> listeReferenceVehicule(Pageable pageable,int limit);
}
