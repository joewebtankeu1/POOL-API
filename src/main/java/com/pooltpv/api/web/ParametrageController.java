package com.pooltpv.api.web;

import com.pooltpv.api.dto.*;
import com.pooltpv.api.service.*;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private final UsageService usageService;
    private final ReferenceVehiculeService referenceVehiculeService;


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

    @GetMapping(path = "/type-avenant")
    public List<TypeAvenantDTO> getTypeAvenant() throws Exception {

        return   typeAvenantService.listTypeAvenantDTO();
    }
    @GetMapping(path = "/usage-auto")
    public List<UsageDTO> getUsageAuto() throws Exception {

        return   usageService.listUsageDTO();
    }

    @GetMapping(path = "/reference-vehicule/page={page}&size={size}")
    public ResponseEntity<Map<String, Object>>  getListReferenceVehicule( @PathVariable(value = "page",required = false) int page,
                                                                          @PathVariable(value = "size",required = false) int size
    ) throws Exception {
            try {
                List<ReferenceVehiculeDTO> referenceVehiculeDTOS = new ArrayList<ReferenceVehiculeDTO>();
                Pageable paging = PageRequest.of(page, size);


                Page<ReferenceVehiculeDTO> pageTuts = referenceVehiculeService.listeReferenceVehicule(paging,size);
                referenceVehiculeDTOS = pageTuts.getContent();

                Map<String, Object> response = new HashMap<>();
                response.put("ReferenceAuto", referenceVehiculeDTOS);
                response.put("currentPage", pageTuts.getNumber());
                response.put("totalItems", pageTuts.getTotalElements());
                response.put("totalPages", pageTuts.getTotalPages());

                return new ResponseEntity<>(response, HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
}
