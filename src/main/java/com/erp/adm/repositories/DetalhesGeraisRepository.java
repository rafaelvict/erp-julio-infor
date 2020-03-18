package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.DetalhesGerais;

@Repository
public interface DetalhesGeraisRepository extends JpaRepository<DetalhesGerais, Long>{

}
