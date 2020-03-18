package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.PerfilCliente;

@Repository
public interface PerfilClienteRepository extends JpaRepository<PerfilCliente, Long>{

}
