package com.pooltpv.api.repositories.compagnie;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pooltpv.api.entities.Compagnie;
import com.pooltpv.api.entities.Intermediaire;

@Repository
public interface CompagnieRepository extends JpaRepository<Compagnie,String> {

    @Query(value ="SELECT codecie, codeattest, isactivated, libellecie FROM compagnie where libellecie LIKE %:libelleCie%"
            ,nativeQuery = true)
    List<Compagnie> findCompagnie(@Param("libelleCie") String libelleCie);
}
