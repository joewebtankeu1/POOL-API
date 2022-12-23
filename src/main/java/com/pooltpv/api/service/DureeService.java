package com.pooltpv.api.service;

import com.pooltpv.api.dto.DureeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DureeService {
    List<DureeDTO> listDureeDTO();
}
