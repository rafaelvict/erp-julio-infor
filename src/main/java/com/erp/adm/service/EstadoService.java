package com.erp.adm.service;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Estado;
import com.erp.adm.repositories.EstadoRepository;

@Service
public class EstadoService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EstadoRepository repo;

	public Estado buscar(Long id) {
		Optional<Estado> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
