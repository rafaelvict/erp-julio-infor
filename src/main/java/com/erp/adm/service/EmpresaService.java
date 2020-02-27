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

import com.erp.adm.domain.Empresa;
import com.erp.adm.dto.EmpresaDTO;
import com.erp.adm.repositories.EmpresaRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class EmpresaService implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EmpresaRepository repo;
	
	public Empresa find(Long id) {
		Optional<Empresa> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Empresa.class.getName()));
	}
	
	public Empresa insert(Empresa obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}

	public Empresa update(Empresa obj) {
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

	public List<Empresa> findAll() {
		return repo.findAll();
	}

	public Page<Empresa> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}

	public Empresa fromDTO(EmpresaDTO objDTO) {
		return new Empresa(objDTO.getNome(), objDTO.getCnpjRaiz(), objDTO.getCnpjOrdem(), objDTO.getInsc_Estadual(), objDTO.getInsc_Municipal(), objDTO.getEmail(), objDTO.getCodigo_Ibge());
	}

}
