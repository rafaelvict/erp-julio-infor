package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.Fabricante;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long>{
	
	
	
}
