package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long>{

}
