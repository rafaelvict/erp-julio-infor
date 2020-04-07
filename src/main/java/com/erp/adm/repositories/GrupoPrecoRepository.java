package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.GrupoPreco;

@Repository
public interface GrupoPrecoRepository extends JpaRepository<GrupoPreco, Long>{
	
	
	
}
