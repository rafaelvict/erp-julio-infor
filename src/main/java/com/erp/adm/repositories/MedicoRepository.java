package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long>{
	
	
	
}
