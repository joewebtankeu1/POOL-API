package com.pooltpv.api.service;

import com.pooltpv.api.dto.TypeAvenantDTO;
import com.pooltpv.api.mappers.TypeAvenantMapper;
import com.pooltpv.api.repositories.TypeAvenantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class TypeAvenantServiceImpl implements TypeAvenantService {
    private final TypeAvenantRepository typeAvenantRepository;
    private final TypeAvenantMapper typeAvenantMapper;
    @Override
    public List<TypeAvenantDTO> listTypeAvenantDTO() {
        return typeAvenantRepository.findTypeAvenant()
                .stream()
                .map(typeAvenant -> typeAvenantMapper.typeAvenantToTypeAvenantDTO(typeAvenant))
                .collect(Collectors.toList());
    }
}
