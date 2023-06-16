package com.pooltpv.api.service;


import com.pooltpv.api.dto.CategorieDTO;
import com.pooltpv.api.dto.UsageDTO;
import com.pooltpv.api.entities.Categorie;
import com.pooltpv.api.entities.Usage;
import com.pooltpv.api.mappers.UsageMapper;
import com.pooltpv.api.repositories.UsageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class UsageServiceImpl implements UsageService {
    private final UsageRepository usageRepository;
    private final UsageMapper usageMapper;

    @Override
    public List<UsageDTO> listUsageDTO() throws NoSuchElementException {

        return usageRepository.listUsage()
                .stream()
                .map(usage -> buildUsageDTO(usage))
                .collect(Collectors.toList());
    }

    private UsageDTO buildUsageDTO(Usage usage) {
        UsageDTO usageDTO = usageMapper.usageToUsageDTO(usage);
        return usageDTO;
    }
}
