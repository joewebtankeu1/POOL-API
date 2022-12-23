package com.pooltpv.api.service;

import com.pooltpv.api.dto.VehiculeDTO;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface VehiculeService {
    List<VehiculeDTO> listVehiculeDTO(int codeCompagnie, Date datebut, Date dateFin);
}
