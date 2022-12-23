package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.Duree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource
public interface DureeRepository extends JpaRepository<Duree,String> {

    @Query(value = "select \n" +
            "codedure,libedure \n" +
            "from duree \n"+
            "where \n"+
           " codedure not in ('DPM','DJP2')"
            ,nativeQuery = true)
    List<Duree> findDuree();
}
