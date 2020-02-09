package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
