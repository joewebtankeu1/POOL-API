package com.pooltpv.api.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pooltpv.api.dto.CompagnieDTO;
import com.pooltpv.api.service.CompagnieService;

@RestController
@RequestMapping("/pooltpv/api/")
public class CompagnieController {
    private final CompagnieService compagnieService;
    private String  libCie="ACTIVA";

    public CompagnieController(CompagnieService compagnieService) {
        this.compagnieService = compagnieService;
    }

    @GetMapping(path = "/compagnie/libelleCie={libelleCie}")
    public List<CompagnieDTO> getListCompagnie(@PathVariable(name = "libelleCie") String  libelleCie) throws Exception {
        
       return compagnieService.listCompagnies(libelleCie);
     }

     @GetMapping(path = "/test")
     public String getTest()
     {
        libCie="1000";
        return libCie;
    
     }
}
