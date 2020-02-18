package com.erp.adm.service;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Endereco;
import com.erp.adm.repositories.EnderecoRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class EnderecoService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EnderecoRepository repo;
	
	public Endereco find(Long id) {
		Optional<Endereco> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Endereco.class.getName()));
	}
	
	public Endereco insert(Endereco obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}

	public Endereco update(Endereco obj) {
		find(obj.getCodigo());
		return repo.save(obj);
	}

	public void delete(Long id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir esse Objeto pois ele está associado a outro Objeto.");
		}
		
	}

}
