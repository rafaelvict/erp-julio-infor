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

import com.erp.adm.domain.ProprietarioSocio;
import com.erp.adm.dto.ProprietarioSocioDTO;
import com.erp.adm.repositories.ProprietarioSocioRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class ProprietarioSocioService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ProprietarioSocioRepository repo;

	public ProprietarioSocio find(Long id) {
		Optional<ProprietarioSocio> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + ProprietarioSocio.class.getName()));
	}

	
	public ProprietarioSocio insert(ProprietarioSocio obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}


	public ProprietarioSocio update(ProprietarioSocio obj) {
		ProprietarioSocio newObj = find(obj.getCodigo());
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


	public List<ProprietarioSocio> findAll() {
		return repo.findAll();
	}

	public Page<ProprietarioSocio> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}

	public ProprietarioSocio fromDTO(ProprietarioSocioDTO objDTO) {
		return new ProprietarioSocio(objDTO.getNome(), objDTO.getNascimento(), objDTO.getNascionalidade(), objDTO.getCpfCnpj(), objDTO.getEmail(), null, null, null, null, null);
	}
	
	private void updateData(ProprietarioSocio newObj, ProprietarioSocio obj) {
		newObj.setNome(obj.getNome());
		newObj.setSexo(obj.getSexo());
		newObj.setEmail(obj.getEmail());
	}
}
