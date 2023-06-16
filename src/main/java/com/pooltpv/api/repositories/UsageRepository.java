package com.pooltpv.api.repositories;

import com.pooltpv.api.entities.Usage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsageRepository extends JpaRepository<Usage,String> {

    @Query(value = "select \n" +
            "CODUSAAU,LIBUSAAU \n" +
            "from usage_auto \n"
            ,nativeQuery = true)
    List<Usage> listUsage();
}
