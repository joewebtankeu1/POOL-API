package com.pooltpv.api.service;

import com.pooltpv.api.dto.ReferenceGarantieDTO;
import com.pooltpv.api.entities.ReferenceGarantie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReferenceGarantieService {
    List<ReferenceGarantieDTO> listReferenceGarantieTO();
}