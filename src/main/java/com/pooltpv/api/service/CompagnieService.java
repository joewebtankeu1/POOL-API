package com.pooltpv.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pooltpv.api.dto.CompagnieDTO;
@Service
public interface CompagnieService {
    List<CompagnieDTO> listCompagnies(String codeCompagnie);

    String test();
}
