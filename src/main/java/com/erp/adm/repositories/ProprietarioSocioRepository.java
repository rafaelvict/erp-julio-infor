package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.erp.adm.domain.ProprietarioSocio;

@Repository
public interface ProprietarioSocioRepository extends JpaRepository<ProprietarioSocio, Long> {

	@Transactional(readOnly=true)
	ProprietarioSocio findByEmail(String email);

}
