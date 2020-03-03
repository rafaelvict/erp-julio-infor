package com.erp.adm.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Estado;
import com.erp.adm.dto.EstadoDTO;
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
		Estado newObj = find(obj.getCodigo());
		updateData(newObj, obj);
		return repo.save(newObj);
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

	public List<Estado> findAll() {
		return repo.findAll();
	}

	public Page<Estado> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	public Estado fromDTO(EstadoDTO objDTO) {
		return new Estado(objDTO.getNome(), objDTO.getSigla());
	}
	
	private void updateData(Estado newObj, Estado obj) {
		newObj.setNome(obj.getNome());
		newObj.setSigla(obj.getSigla());
	}
}
