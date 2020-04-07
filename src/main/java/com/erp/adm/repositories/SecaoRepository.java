package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.Secao;

@Repository
public interface SecaoRepository extends JpaRepository<Secao, Long> {

}
