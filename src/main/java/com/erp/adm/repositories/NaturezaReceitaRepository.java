package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.NaturezaReceita;

@Repository
public interface NaturezaReceitaRepository extends JpaRepository<NaturezaReceita, Long>{
	
	
	
}
