package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,String> {

    @Query(value = "select \n" +
            "CODECATE,LIBECATE \n" +
            "from categorie \n"
            ,nativeQuery = true)
    List<Categorie> listCategorie();
}
