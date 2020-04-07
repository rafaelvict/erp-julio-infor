package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.GeneroMercadoria;

@Repository
public interface GeneroMercadoriaRepository extends JpaRepository<GeneroMercadoria, Long>{
	
	
	
}
