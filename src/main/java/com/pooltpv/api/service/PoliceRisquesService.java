package com.pooltpv.api.service;

import com.pooltpv.api.dto.PoliceRisquesDTO;
import com.pooltpv.api.dto.RisquesDTO;
import com.pooltpv.api.exception.RisqueDtoException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface PoliceRisquesService {
    List<PoliceRisquesDTO> listPoliceRisquesDTO(int codeCompagnie, Date dateDebut, Date dateFin) throws RisqueDtoException;
}
