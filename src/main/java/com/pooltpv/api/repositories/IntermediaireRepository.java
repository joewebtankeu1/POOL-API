package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.Categorie;
import com.pooltpv.api.entities.Intermediaire;
import com.pooltpv.api.entities.PoliceRisques;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IntermediaireRepository extends JpaRepository<Intermediaire,String> {

    @Query(value = "select \n" +
                    " CODEINTE,\n" +
                    " RAISOCIN,\n" +
                    " CODTYPIN,\n" +
                    "CODEVILL\n" +
                    "FROM intermediaire\n" +
                    "WHERE \n" +
                    " INTERMEDIAIRE.LIENINTE=:codeCompagnie \n"
            ,nativeQuery = true)
    List<Intermediaire> findIntermediaire(@Param("codeCompagnie") int codeCompagnie);
}
