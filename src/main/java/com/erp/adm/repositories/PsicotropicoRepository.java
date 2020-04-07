package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.Psicotropico;

@Repository
public interface PsicotropicoRepository extends JpaRepository<Psicotropico, Long>{

	
}
