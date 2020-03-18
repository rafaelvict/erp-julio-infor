package com.erp.adm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Estado;
import com.erp.adm.repositories.EstadoRepository;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService  {
	
	@Autowired
	private EstadoRepository repo;

	public Estado find(Long id) {
		Optional<Estado> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName()));
	}

	public List<Estado> findAll() {
		return repo.findAll();
	}

}
