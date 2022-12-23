package com.pooltpv.api.web;

import com.pooltpv.api.dto.PolicesDTO;
import com.pooltpv.api.dto.SouscripteurDTO;
import com.pooltpv.api.exception.DateDiffException;
import com.pooltpv.api.service.PolicesService;
import com.pooltpv.api.service.SouscripteurService;
import com.pooltpv.api.utilities.DateValidatorUsingDateTimeFormatter;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.*;

@RestController
@RequestMapping("/pooltpv/api/")
public class SouscripteurController {

    private final SouscripteurService souscripteurService;
    private int codeCompagnie;

    public SouscripteurController(SouscripteurService souscripteurService) {
        this.souscripteurService = souscripteurService;
    }

    @GetMapping(path = "/souscripteur/code_demandeur={codeDemandeur}&date_debut={dateDebut}&date_fin={dateFin}")
    public List<SouscripteurDTO> getListSouscripteur(@PathVariable(name = "codeDemandeur") String  codeDemandeur,
                                                 @PathVariable(name = "dateDebut")  @DateTimeFormat(pattern = "dd-MM-yyyy") String  dateDebut,
                                                 @PathVariable(name = "dateFin")  @DateTimeFormat(pattern = "dd-MM-yyyy") String  dateFin) throws Exception {

        if(codeDemandeur.equals("fSwtr6IBYpVy8TIb")){
            codeCompagnie=20000;
        }else if(codeDemandeur.equals("MNBgcZOMdMsTfO17")){
            codeCompagnie=95000;
        }else if(codeDemandeur.equals("HtbUraVTXGUO9HZh")){
            codeCompagnie=65000;
        }else if(codeDemandeur.equals("IZgHUBtvC6Esqqhx")){
            codeCompagnie=90000;
        }
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-uuuu")
                .withResolverStyle(ResolverStyle.STRICT);
        dateFormatter.parse(dateDebut);
        dateFormatter.parse(dateFin);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.FRENCH);
        formatter.setTimeZone(TimeZone.getTimeZone("Africa/Douala"));
        Date startDate = formatter.parse(dateDebut + " 00:00:00");
        Date endDate = formatter.parse(dateFin + " 23:59:59");
        try {
            DateValidatorUsingDateTimeFormatter dateValidatorUsingDateTimeFormatter = new DateValidatorUsingDateTimeFormatter(startDate, endDate);
            if (dateValidatorUsingDateTimeFormatter.isDatediffValid(startDate, endDate) == true)

                return souscripteurService.listSouscripteur(codeCompagnie, startDate, endDate);

        }
        catch (DateDiffException e){

             throw new DateDiffException(e.getMessage());
        }

        return null;
    }

}
