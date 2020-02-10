package com.erp.adm.service;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Funcionario;
import com.erp.adm.repositories.FuncionarioRepository;
import com.erp.adm.services.exceptions.ObjectNotFoundException;


@Service
public class FuncionarioService implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private FuncionarioRepository repo;

	public Funcionario buscar(Long id) {
		Optional<Funcionario> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Funcionario.class.getName()));
	}

}
