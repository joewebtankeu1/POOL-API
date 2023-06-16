package com.pooltpv.api.service;

import com.pooltpv.api.dto.EncaissementDTO;
import com.pooltpv.api.dto.PrimeDTO;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface EncaissementService {
    List<EncaissementDTO> listEncaissement(int codeCompagnie, Date dateDebut, Date dateFin);
}

