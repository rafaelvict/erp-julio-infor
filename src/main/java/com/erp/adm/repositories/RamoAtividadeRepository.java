package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.RamoAtividade;

@Repository
public interface RamoAtividadeRepository extends JpaRepository<RamoAtividade, Long> {

}
