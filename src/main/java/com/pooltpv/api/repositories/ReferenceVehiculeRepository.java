package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.ReferenceVehicule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferenceVehiculeRepository extends JpaRepository<ReferenceVehicule,String> {

    @Query(value = "select \n" +
                    "MARQVEHI,\n" +
                    "TYPEVEHI,\n" +
                    "TYPEMOTE,\n" +
                    "PUISVEHI,\n" +
                    "NOMBPLAC\n" +
                 "from ORASSADM.REFERENCE_VEHICULE \n" +
                 "where \n" +
                 "ROWNUM <= :size"

            ,nativeQuery = true)
    Page<ReferenceVehicule> listReferenceVehicule(Pageable pageable, @Param("size") int size);
    Page<ReferenceVehicule> findAll(Pageable pageable);
}
