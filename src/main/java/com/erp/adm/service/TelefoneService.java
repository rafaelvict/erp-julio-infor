package com.erp.adm.service;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Telefone;
import com.erp.adm.repositories.TelefoneRepository;
import com.erp.adm.services.exceptions.ObjectNotFoundException;


@Service
public class TelefoneService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private TelefoneRepository repo;

	public Telefone buscar(Long id) {
		Optional<Telefone> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Telefone.class.getName()));
	}
	
	public Telefone insert(Telefone obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}

}
