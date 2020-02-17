package com.erp.adm.service;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Endereco;
import com.erp.adm.repositories.EnderecoRepository;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class EnderecoService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EnderecoRepository repo;
	
	public Endereco buscar(Long id) {
		Optional<Endereco> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Endereco.class.getName()));
	}

}