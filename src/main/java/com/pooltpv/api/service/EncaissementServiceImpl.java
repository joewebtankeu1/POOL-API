package com.pooltpv.api.service;

import com.pooltpv.api.dto.EncaissementDTO;
import com.pooltpv.api.entities.Encaissement;
import com.pooltpv.api.mappers.EncaissementMapper;
import com.pooltpv.api.repositories.EncaissementRepository;
import com.pooltpv.api.utilities.DateFormatter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class EncaissementServiceImpl implements EncaissementService {
    private final EncaissementRepository encaissementRepository;
    private final EncaissementMapper encaissementMapper;
    private static DateFormatter dateFormatter = new DateFormatter();
    @Override
    public List<EncaissementDTO> listEncaissement(int codeCompagnie, Date dateDebut, Date dateFin) {
        return encaissementRepository.findEncaissement(codeCompagnie,dateDebut,dateFin)
                .stream()
                .map(encaissement -> {
                    try {
                        return buildToDTO(encaissement);
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(Collectors.toList());
    }

    private EncaissementDTO buildToDTO(Encaissement encaissement) throws ParseException {
        EncaissementDTO encaissementDTO = encaissementMapper.encaissementToEncaissementDTO(encaissement);

        String dateEncaissement = dateFormatter.setDateFormatTime(encaissement.getDateEncaissement());
        encaissementDTO.setDateEncaissement(dateEncaissement);
        return encaissementDTO;
    }

}
