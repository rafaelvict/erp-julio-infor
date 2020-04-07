package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.TotalizadorFiscal;

@Repository
public interface TotalizadorFiscalRepository extends JpaRepository<TotalizadorFiscal, Long> {

}
