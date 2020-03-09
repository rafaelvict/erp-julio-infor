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

import com.erp.adm.domain.RamoAtividade;
import com.erp.adm.dto.RamoAtividadeDTO;
import com.erp.adm.repositories.RamoAtividadeRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class RamoAtividadeService implements Serializable {
	private static final long serialVersionUID = 1L;


	@Autowired
	private RamoAtividadeRepository repo;

	public RamoAtividade find(Long id) {
		Optional<RamoAtividade> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + RamoAtividade.class.getName()));
	}

	
	public RamoAtividade insert(RamoAtividade obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}


	public RamoAtividade update(RamoAtividade obj) {
		RamoAtividade newObj = find(obj.getCodigo());
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


	public List<RamoAtividade> findAll() {
		return repo.findAll();
	}

	public Page<RamoAtividade> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}

	public RamoAtividade fromDTO(RamoAtividadeDTO objDTO) {
		return new RamoAtividade(objDTO.getDescricao(), null);
	}
	
	private void updateData(RamoAtividade newObj, RamoAtividade obj) {
		
	}
}
