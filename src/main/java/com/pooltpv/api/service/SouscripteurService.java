package com.pooltpv.api.service;

import com.pooltpv.api.dto.SouscripteurDTO;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public interface SouscripteurService {
    List<SouscripteurDTO> listSouscripteur(int codeCompagnie, Date dateDebut, Date dateFin);

}

