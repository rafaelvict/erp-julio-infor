package com.erp.adm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Telefone;
import com.erp.adm.dto.TelefoneDTO;
import com.erp.adm.repositories.TelefoneRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;


@Service
public class TelefoneService {
	
	@Autowired
	private TelefoneRepository repo;

	public Telefone find(Long id) {
		Optional<Telefone> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Telefone.class.getName()));
	}
	
	public Telefone insert(Telefone obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}

	public Telefone update(Telefone obj) {
		Telefone newObj = find(obj.getCodigo());
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

	public List<Telefone> findAll() {
		return repo.findAll();
	}

	public Page<Telefone> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}

	public Telefone fromDTO(TelefoneDTO objDTO) {
		return new Telefone(objDTO.getDdd(), objDTO.getTelefone(), null, null, null, null, null, null, null, null);
	}
	
	private void updateData(Telefone newObj, Telefone obj) {
		newObj.setDataAlteraTel(obj.getDataAlteraTel());
		newObj.setDdd(obj.getDdd());
		newObj.setTelefone(obj.getTelefone());
	}

}
