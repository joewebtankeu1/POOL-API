package com.pooltpv.api.service;

import com.pooltpv.api.dto.PrimeDTO;
import com.pooltpv.api.dto.SouscripteurDTO;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface PrimeService {
    List<PrimeDTO> listPrime(int codeCompagnie, Date dateDebut, Date dateFin);

}

