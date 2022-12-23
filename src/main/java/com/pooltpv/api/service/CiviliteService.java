package com.pooltpv.api.service;

import com.pooltpv.api.dto.CiviliteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CiviliteService {
    List<CiviliteDTO> listCiviliteDTO();
}
