package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.Banco;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Long> {

}
