package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.Risques;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface RisquesRepository extends JpaRepository<Risques,String> {

    @Query(value = "select \n" +
            "U_CLE_P, \n"  +
            "U_CLE, \n"  +
            "code_cie, \n"  +
            "CODEINTESOUS, \n"  +
            "CONCAT(CONCAT(NUMEPOLI,'-'),CODEINTESOUS) AS NUMEPOLI, \n" +
            "FLOTTE, \n" +
            "NVL(NUM_NUMEAVEN,\n" +
            "  0) AS NUM_NUMEAVEN, \n" +
            "LIBTYPAV as MOUVEMENT,\n" +
            "DATESOUS, \n" +
            "DATESOUS AS HEURESOUS, \n" +
            "DATEFFET, \n" +
            "DATEECHE, \n" +
            "ADREASSU, \n" +
            "NVL(CODEVILL,0) as CODEVILL, \n" +
            "NVL(DUREE,'-') as DUREE, \n" +
            "NVL(LIBEDURE,'-') as LIBEDURE, \n" +
            "IMMATRICULATION,\n" +
            "ASPUISSANCE,\n" +
            "CODUSAAU,\n" +
            "LIBUSAAU,\n" +
            "NVL(SE,'-') as SE, \n" +
            "CODGENAU,\n" +
            "GENRE,\n" +
            "MARQUE,\n" +
            "TYPEVEHI,\n" +
            "PLACE,\n" +
            "DATE_PREM_MEC, \n" +
            "VAL_NEUVE,\n" +
            "ASVAL_VENALE,\n" +
            "CATEGORIE ,\n" +
            "SOUS_CAT_NOM,\n" +
            "CHASSIS,\n" +
            "CODEASSU,\n" +
            "CONCAT(CONCAT(ASSURE_NOM,' '),PRENASSU) AS ASSURE_NOM, \n" +
            "MOBILE ,\n" +
            "DATENAIS,\n" +
            "QUALITE,\n" +
            "SEXERISQ,\n" +
            "CODEPROF,\n" +
            "PROFESSION,\n" +
            "LIBEVILL,\n" +
            "NVL(RC,0) AS RC,\n" +
            "NVL(DR,0) AS DR,\n" +
            "NVL(IC,0) AS IC,\n" +
            "NVL(BDG,0) AS BDG,\n" +
            "NVL(INC,0) AS INC,\n" +
            "NVL(VOL,0) AS VOL,\n" +
            "NVL(DTA,0) AS DTA,\n" +
            "NVL(DTC,0) AS DTC,\n" +
            "NVL(PRIME_NETTE,0) AS PRIME_NETTE,\n" +
            "NVL(DROIT_TIMBRE,0) AS DROIT_TIMBRE,\n" +
            "NVL(PRIMTOTA,0) AS PRIMETTC, \n" +
            "ATTESTATION, \n" +
            "CODTYPAV, \n" +
            "codeCivil, \n" +
            "CIVILITES \n" +
            "from ORASSADM.CIE_POOL_POL_RISQUE \n"+
            "WHERE code_cie=:codeCompagnie \n"+
            "and DATESOUS between :dateDebut and  :dateFin \n"
            ,nativeQuery = true)
    List<Risques> findRisques(@Param("codeCompagnie") int codeCompagnie, @Param("dateDebut") Date dateDebut, @Param("dateFin") Date dateFin);
}
