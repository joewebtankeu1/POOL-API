package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.Souscriptions;
import com.pooltpv.api.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface SouscriptionsRepository extends JpaRepository<Souscriptions,String> {

    @Query(value = "select \n" +
            "U_CLE, \n"+
            "DATEFFET, \n" +
            "DATEECHE, \n" +
            "NVL(RC,0.0) AS RC,\n" +
            "NVL(DR,0.0) AS DR,\n" +
            "NVL(IC,0.0) AS IC,\n" +
            "NVL(INC,0.0) AS BDG,\n" +
            "NVL(INC,0.0) AS INC,\n" +
            "NVL(VOL,0.0) AS VOL,\n" +
            "NVL(DTC,0.0) AS DTC\n" +
            "from ORASSADM.CIE_POOL_POL_RISQUE \n" +
            "WHERE code_cie=:codeCompagnie \n" +
            "and DATESOUS between :dateDebut and  :dateFin"
            ,nativeQuery = true)
    List<Souscriptions> findSouscriptions(@Param("codeCompagnie") int codeCompagnie, @Param("dateDebut") Date dateDebut, @Param("dateFin") Date dateFin);
}
