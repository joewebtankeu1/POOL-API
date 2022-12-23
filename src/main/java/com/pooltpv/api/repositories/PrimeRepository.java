package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.Prime;
import com.pooltpv.api.entities.Souscripteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface PrimeRepository extends JpaRepository<Prime,String> {

    @Query(value = "select \n" +
                    "distinct Q.NUMEQUIT, \n" +
                    " ACCEQUIT as accessoire,\n" +
                    " TAXEQUI2 as tva\n" +
                    "from quittance q\n" +
                    "JOIN ORASSADM.CIE_POOL_POL_RISQUE r\n" +
                    "ON Q.NUMEPOLI=R.NUMEPOLI\n" +
                    "AND R.NUMEQUIT = Q.NUMEQUIT\n" +
                    "AND R.CODE_CIE = Q.CODE_CIE\n" +
                    "AND R.CODEASSU = Q.CODEASSU\n" +
                    "AND R.CODECATE = Q.CODECATE\n" +
                    "AND R.CODEINTESOUS=Q.CODEINTE\n" +
                "WHERE r.code_cie=:codeCompagnie \n"+
                "and r.DATESOUS between :dateDebut and  :dateFin \n"
            ,nativeQuery = true)
    List<Prime> findPrime(@Param("codeCompagnie") int codeCompagnie, @Param("dateDebut") Date dateDebut, @Param("dateFin") Date dateFin);
}
