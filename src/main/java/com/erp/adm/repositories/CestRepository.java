package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.Cest;

@Repository
public interface CestRepository extends JpaRepository<Cest, Long>{

}
