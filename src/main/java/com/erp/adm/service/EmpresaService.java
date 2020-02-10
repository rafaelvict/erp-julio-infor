package com.erp.adm.service;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Empresa;
import com.erp.adm.repositories.EmpresaRepository;

@Service
public class EmpresaService implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EmpresaRepository repo;
	
	public Empresa buscar(Long id) {
		Optional<Empresa> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
