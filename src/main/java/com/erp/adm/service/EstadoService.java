package com.erp.adm.service;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Estado;
import com.erp.adm.repositories.EstadoRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EstadoRepository repo;

	public Estado find(Long id) {
		Optional<Estado> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName()));
	}
	
	public Estado insert(Estado obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}

	public Estado update(Estado obj) {
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
