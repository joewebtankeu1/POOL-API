package com.pooltpv.api.service;

import com.pooltpv.api.dto.PrimeDTO;
import com.pooltpv.api.entities.Prime;
import com.pooltpv.api.mappers.PrimeMapper;
import com.pooltpv.api.repositories.PrimeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class PrimeServiceImpl implements PrimeService {
    private final PrimeRepository primeRepository;
    private final PrimeMapper primeMapper;
    @Override
    public List<PrimeDTO> listPrime(int codeCompagnie, Date dateDebut, Date dateFin) {
        return primeRepository.findPrime(codeCompagnie,dateDebut,dateFin)
                .stream()
                .map(prime -> buildPrimeDTO(prime))
                .collect(Collectors.toList());
    }

    private PrimeDTO buildPrimeDTO(Prime prime) {
        PrimeDTO primeDTO = primeMapper.primeToPrimeDTO(prime);
        return primeDTO;
    }

}
