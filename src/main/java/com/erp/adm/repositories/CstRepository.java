package com.erp.adm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.adm.domain.Cst;

@Repository
public interface CstRepository extends JpaRepository<Cst, Long> {

}
