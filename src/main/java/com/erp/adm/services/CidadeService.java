package com.erp.adm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Cidade;
import com.erp.adm.repositories.CidadeRepository;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class CidadeService {
	
	
	@Autowired
	private CidadeRepository repo;
	
	public Cidade find(Long id) {
			Optional<Cidade> obj = repo.findById(id);
		
			return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id + ", Tipo: " + Cidade.class.getName()));
			
	}
	
	public List<Cidade> findAll() {
		return repo.findAll();
	}
	
//	public List<Cidade> findByEstado(Long estado_id) {
//		return repo.findCidades(estado_id);
//	}

}

