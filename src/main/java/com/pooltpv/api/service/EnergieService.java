package com.pooltpv.api.service;

import com.pooltpv.api.dto.EnergieDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EnergieService {
    List<EnergieDTO> listEnergieTO();
}
