package com.pooltpv.api.web;

import com.pooltpv.api.dto.*;
import com.pooltpv.api.service.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pooltpv/api/conf/")
@AllArgsConstructor
public class ParametrageController {

    private final DureeService dureeService;
    private final GenreAutoService genreAutoService;
    private final  CategorieService categorieService;
    private final  ReferenceGarantieService referenceGarantieService;
    private final EnergieService energieService;
    private final CiviliteService civiliteService;
    private final TypeAvenantService typeAvenantService;


    @GetMapping(path = "/duree")
    public List<DureeDTO> getDuree() throws Exception {

       return dureeService.listDureeDTO();
     }

    @GetMapping(path = "/genre")
    public List<GenreAutoDTO> getGenreAuto() throws Exception {

        return genreAutoService.listGenreAutoDTO();
    }

    @GetMapping(path = "/categorie")
    public List<CategorieDTO> getSousCategorie() throws Exception {

        return   categorieService.listCategorieTO();
    }

    @GetMapping(path = "/garantie")
    public List<ReferenceGarantieDTO> getGarantie() throws Exception {

        return  referenceGarantieService.listReferenceGarantieTO();
    }

    @GetMapping(path = "/energie")
    public List<EnergieDTO> getEnergie() throws Exception {
        return  energieService.listEnergieTO();
    }

    @GetMapping(path = "/civilite")
    public List<CiviliteDTO> getCivilite() throws Exception {
        return  civiliteService.listCiviliteDTO();
    }

    @GetMapping(path = "/type_avenant")
    public List<TypeAvenantDTO> getTypeAvenant() throws Exception {

        return   typeAvenantService.listTypeAvenantDTO();
    }
}
