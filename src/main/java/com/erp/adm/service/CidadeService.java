package com.erp.adm.service;

import java.io.Serializable;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Cidade;

import com.erp.adm.repositories.CidadeRepository;

@Service
public class CidadeService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	private CidadeRepository repo;
	
	public Cidade buscar(Integer id) {
			Optional<Cidade> obj = repo.findById(id);
			return obj.orElse(null);
	}

}

