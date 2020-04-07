package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	
}
