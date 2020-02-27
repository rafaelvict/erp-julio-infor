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

import com.erp.adm.domain.Cidade;
import com.erp.adm.dto.CidadeDTO;
import com.erp.adm.repositories.CidadeRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class CidadeService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	private CidadeRepository repo;
	
	public Cidade find(Long id) {
			Optional<Cidade> obj = repo.findById(id);
		
			return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id + ", Tipo: " + Cidade.class.getName()));
			
	}
	
	public Cidade insert(Cidade obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}

	public Cidade update(Cidade obj) {
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

	public List<Cidade> findAll() {
		return repo.findAll();
	}

	public Page<Cidade> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	public Cidade fromDTO(CidadeDTO objDTO) {
		return new Cidade(objDTO.getNome(), objDTO.getCodigoIbge());
	}
}

