package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface  VehiculeRepository extends JpaRepository<Vehicule,String> {

    @Query(value = "select distinct \n" +
            "U_CLE,\n" +
            "immatriculation as IMM,\n" +
            "chassis CHA,\n" +
            "genre as TYP,\n" +
            "aspuissance as PUF,\n" +
            "'' as ANF,\n" +
            "date_prem_mec DMC,\n" +
            "NVL(asval_venale,0.0) as VAL,\n" +
            "0 as PTA,\n" +
            "place as PLA,\n" +
            "conducteur as COH,\n" +
            "numeperm as NPC,\n" +
            "datdelpe as DPC,\n" +
            "marque as MAR,\n" +
            "typevehi as MOD,\n" +
            "codecate as USA,\n" +
            "'' as CAR,\n" +
            "SE as ENE,\n" +
            "NVL(VAL_NEUVE,0.0) as VAN\n" +
            "from ORASSADM.CIE_POOL_POL_RISQUE \n" +
            "WHERE code_cie=:codeCompagnie \n" +
            "and DATESOUS between :dateDebut and  :dateFin"
            ,nativeQuery = true)
    List<Vehicule> findVehicule(@Param("codeCompagnie") int codeCompagnie, @Param("dateDebut") Date dateDebut, @Param("dateFin") Date dateFin);
}
