package com.pooltpv.api.service;

import com.pooltpv.api.dto.IntermediaireDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IntermediaireService {
    List<IntermediaireDTO> listIntermediaire(int codeCompagnie);
}
