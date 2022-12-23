package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie,String> {

    @Query(value = "select \n" +
            "CODECATE,LIBECATE \n" +
            "from categorie \n"
            ,nativeQuery = true)
    List<Categorie> findCategorie();
}
