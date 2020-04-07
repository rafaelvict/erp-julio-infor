package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.GrupoLinhas;

@Repository
public interface GrupoLinhasRepository extends JpaRepository<GrupoLinhas, Long>{
	
	
	
}
