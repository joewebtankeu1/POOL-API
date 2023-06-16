package com.pooltpv.api.service;

import com.pooltpv.api.dto.CategorieDTO;
import com.pooltpv.api.dto.UsageDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsageService {
    List<UsageDTO> listUsageDTO();
}
