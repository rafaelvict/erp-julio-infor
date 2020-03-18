package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.DetalhesGrupo;

@Repository
public interface DetalhesGrupoRepository extends JpaRepository<DetalhesGrupo, Long>{

}
