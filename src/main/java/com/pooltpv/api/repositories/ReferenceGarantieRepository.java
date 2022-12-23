package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.ReferenceGarantie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ReferenceGarantieRepository extends JpaRepository<ReferenceGarantie,String> {

    @Query(value = "select \n" +
            "CODEGARA,LIBEGARA \n" +
            "from REFERENCE_garantie \n"
            ,nativeQuery = true)
    List<ReferenceGarantie> findReferenceGarantie();
}
