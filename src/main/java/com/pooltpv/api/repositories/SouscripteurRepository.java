package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.Souscripteur;
import com.pooltpv.api.entities.TypeAvenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface SouscripteurRepository extends JpaRepository<Souscripteur,String> {

    @Query(value = "select\n" +
            "    distinct a.codeassu,\n" +
            "    a.genrassu,\n" +
            "    a.adreassu as adresse,\n" +
            "    a.TELPORAS as telephone,\n" +
            "    a.prenassu as prenom,\n" +
            "    a.RAISSOCI as nom,\n" +
            "    '' as email,\n" +
            "    '' as date_naissance,\n" +
            "    '' as lieu_naissance,\n" +
            "    a.codequal\n" +
            "from ASSURE  a\n" +
            "JOIN ORASSADM.CIE_POOL_POL_RISQUE r \n" +
            "   ON a.codeassu = r.codeassu \n" +
            "WHERE r.code_cie=:codeCompagnie \n"+
            "and r.DATESOUS between :dateDebut and  :dateFin \n"
            ,nativeQuery = true)
    List<Souscripteur> findSouscripteur(@Param("codeCompagnie") int codeCompagnie, @Param("dateDebut") Date dateDebut, @Param("dateFin") Date dateFin);
}
