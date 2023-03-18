package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.PoliceRisques;
import com.pooltpv.api.entities.Risques;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface PoliceRisquesRepository extends JpaRepository<PoliceRisques,String> {

    @Query(value = "select\n" +
            "    U_CLE_P, \n" +
            "    CODE_CIE, \n" +
            "    CONCAT(CONCAT(NUMEPOLI,\n" +
            "    '-'),\n" +
            "    CODEINTE) AS NUMEPOLI,\n" +
            "    CODEINTE,\n" +
            "    DATESOUS,\n" +
            "    DATEEFFE,\n" +
            "    DATEECHE,\n" +
            "    LIBTYPAV as MOUVEMENT,\n" +
            "    NUMEAVEN,\n" +
            "    NUMEQUIT,\n" +
            "    PRIMTOTA,\n" +
            "    PRIMNETT,\n" +
            "    ACCEQUIT,\n" +
            "    TAXEQUI2,\n" +
            "    FC,\n" +
            "    ATTES AS CARTE_ROSE,\n" +
            "    TIMBGRAD,\n" +
            "    ETATQUIT,\n" +
            "    MODEPAIE,\n" +
            "    NBRE AS NOMBRE_VEHICULE   \n" +
            "from ORASSADM.API_POOL_QUIT_POLICE\n" +
            "WHERE code_cie=:codeCompagnie\n" +
            "and DATESOUS between :dateDebut and  :dateFin \n"
            ,nativeQuery = true)
    List<PoliceRisques> findPoliceRisques(@Param("codeCompagnie") int codeCompagnie, @Param("dateDebut") Date dateDebut, @Param("dateFin") Date dateFin);
}
