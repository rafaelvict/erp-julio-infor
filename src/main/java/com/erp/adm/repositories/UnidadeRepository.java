package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.Unidade;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Long> {

}
