package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.Civilite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CiviliteRepository extends JpaRepository<Civilite,String> {

    @Query(value = "select \n" +
            "CODEQUAL,LIBEQUAL \n" +
            "from qualite \n"
            ,nativeQuery = true)
    List<Civilite> findSCivilite();
}
