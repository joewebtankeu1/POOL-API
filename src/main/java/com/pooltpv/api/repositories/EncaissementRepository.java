package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.Encaissement;
import com.pooltpv.api.entities.Prime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface EncaissementRepository extends JpaRepository<Encaissement,String> {

    @Query(value = "select \n" +
                "    case when NATUMOUV='ANNUL' then 'ANNUL' \n" +
                "    else case when CODTYPQU='R' then 'RISTR'\n" +
                "    else 'EMISS' end end  NATURMOUV,\n" +
                "    NUMEQUIT,\n" +
                "    NUMEENCA,\n" +
                "    DATEENCA,\n" +
                "    MODEPAIE,\n" +
                "    REFEENCA,\n" +
                "    NUMECHEQ,\n" +
                "    DATEVALI,\n" +
                "    CREE_PAR,\n" +
                "    CREE__LE,\n" +
                "    DATEANNU,\n" +
                "    ANNU_PAR,\n" +
                "    CODEASSU,\n" +
                "    CODECATE,\n" +
                "    CODEINTE,\n" +
                "    NUMEPOLI,\n" +
                "    nvl(NUMEAVEN,999)\n" +
                "from ORASSADM.P_ENCAISSEMENT_QUITTANCE \n" +
                "WHERE code_cie=:codeCompagnie \n"+
                "and DATEENCA between :dateDebut and  :dateFin \n"
            ,nativeQuery = true)
    List<Encaissement> findEncaissement(@Param("codeCompagnie") int codeCompagnie, @Param("dateDebut") Date dateDebut, @Param("dateFin") Date dateFin);
}
