package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.Duree;
import com.pooltpv.api.entities.TypeAvenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface TypeAvenantRepository extends JpaRepository<TypeAvenant,String> {

    @Query(value = "select \n" +
            "codtypav,\n" +
            "libtypav\n" +
            " from type_avenant"
            ,nativeQuery = true)
    List<TypeAvenant> findTypeAvenant();
}
