package com.erp.adm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Banco;
import com.erp.adm.domain.Cliente;
import com.erp.adm.dto.BancoDTO;
import com.erp.adm.dto.BancoNewDTO;
import com.erp.adm.repositories.BancoRepository;
import com.erp.adm.repositories.ClienteRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class BancoService {
	
	@Autowired
	private BancoRepository repo;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Banco find(Long id) {
		Optional<Banco> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Banco.class.getName()));
	}
	
	public Banco insert(Banco obj) {
		obj.setCodigo(null);
		obj = repo.save(obj);
		return obj;
		
	}

	public Banco update(Banco obj) {
		Banco newObj = find(obj.getCodigo());
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
	
	public List<Banco> findAll() {
		return repo.findAll();
	}
	
	public Banco fromDTO(BancoDTO objDTO) {
		return new Banco(objDTO.getNomeBanco(), objDTO.getAgencia(), objDTO.getContaCorrente(), null, null);
	}
	
	public Banco fromDTO(BancoNewDTO objDTO) {
		Optional<Cliente> cli = clienteRepository.findById(objDTO.getClienteId());
		Banco banco = new Banco(objDTO.getNomeBanco(), objDTO.getAgencia(), objDTO.getContaCorrente(), objDTO.getDataAlteraBanco(), cli.get());
		
		return banco;
	}
	
	private void updateData(Banco newObj, Banco obj) {
		newObj.setNomeBanco(obj.getNomeBanco());
		newObj.setAgencia(obj.getAgencia());
		newObj.setContaCorrente(obj.getContaCorrente());
	}
}
