package com.pooltpv.api.service;

import com.pooltpv.api.dto.PolicesDTO;

import java.util.Date;
import java.util.List;

public interface PolicesService {
    List<PolicesDTO> listPolicesDTO(int codeCompagnie, Date dateDebut, Date dateFin);
}
