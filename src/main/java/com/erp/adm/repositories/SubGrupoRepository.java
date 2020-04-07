package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.SubGrupo;

@Repository
public interface SubGrupoRepository extends JpaRepository<SubGrupo, Long> {

}
