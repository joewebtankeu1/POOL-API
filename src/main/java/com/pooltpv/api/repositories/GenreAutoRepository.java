package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.GenreAuto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface GenreAutoRepository extends JpaRepository<GenreAuto,String> {

    @Query(value = "select \n" +
            "CODGENAU, \n" +
            "LIBGENAU \n" +
            "from genre_auto"
            ,nativeQuery = true)
    List<GenreAuto> findGenreAuto();
}
