package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.Transp;

@Repository
public interface TranspRepository extends JpaRepository<Transp, Long> {

}
