package com.pooltpv.api.service;

import com.pooltpv.api.dto.SouscriptionsDTO;
import com.pooltpv.api.dto.VehiculeDTO;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface SouscriptionsService {
    List<SouscriptionsDTO> listSouscriptionDTO(int codeCompagnie, Date datebut, Date dateFin);
}
