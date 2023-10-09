package com.pooltpv.api.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pooltpv.api.dto.CompagnieDTO;
import com.pooltpv.api.entities.Compagnie;
import com.pooltpv.api.mappers.CompagnieMapper;
import com.pooltpv.api.repositories.compagnie.CompagnieRepository;

import lombok.AllArgsConstructor;
@Service
@Transactional
@AllArgsConstructor
public class CompagnieServiceImpl implements CompagnieService {
    private final CompagnieRepository compagnieRepository;
    private final CompagnieMapper compagnieMapper;
 @Override
    public List<CompagnieDTO> listCompagnies(String libelleCie) throws NoSuchElementException {

        return compagnieRepository.findCompagnie(libelleCie)
                /* */.stream()
                .map(compagnie -> buildCompagnieDTO(compagnie))
                .collect(Collectors.toList());
    }

    private CompagnieDTO buildCompagnieDTO(Compagnie compagnie) {
        CompagnieDTO compagnieDTO = compagnieMapper.compagnieToCompagnieDTO(compagnie);

        return compagnieDTO;
    }

    @Override
    public String test() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'test'");
    }

}
