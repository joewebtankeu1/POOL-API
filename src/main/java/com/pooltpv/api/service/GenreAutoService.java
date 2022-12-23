package com.pooltpv.api.service;

import com.pooltpv.api.dto.DureeDTO;
import com.pooltpv.api.dto.GenreAutoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GenreAutoService {
    List<GenreAutoDTO> listGenreAutoDTO();
}
