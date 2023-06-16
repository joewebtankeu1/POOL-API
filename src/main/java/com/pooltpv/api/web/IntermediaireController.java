package com.pooltpv.api.web;

import com.pooltpv.api.dto.*;
import com.pooltpv.api.service.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pooltpv/api/conf/")
//@AllArgsConstructor
public class IntermediaireController {
    private final IntermediaireService intermediaireService;
    private int codeCompagnie;

    public IntermediaireController(IntermediaireService intermediaireService) {
        this.intermediaireService = intermediaireService;
    }

    @GetMapping(path = "/intermediaires/code_demandeur={codeDemandeur}")
    public List<IntermediaireDTO> getListIntermediaire(@PathVariable(name = "codeDemandeur") String  codeDemandeur) throws Exception {
        if(codeDemandeur.equals("fSwtr6IBYpVy8TIb")){
            codeCompagnie=20000;
        }else if(codeDemandeur.equals("22cDv9B3lxt6keKM")){
            codeCompagnie=40000;
        }else if(codeDemandeur.equals("HtbUraVTXGUO9HZh")){
            codeCompagnie=65000;
        }else if(codeDemandeur.equals("IZgHUBtvC6Esqqhx")){
            codeCompagnie=90000;
        }else if(codeDemandeur.equals("MNBgcZOMdMsTfO17")){
            codeCompagnie=95000;
        }
       return intermediaireService.listIntermediaire(codeCompagnie);
     }
}
