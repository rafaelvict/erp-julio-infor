package com.erp.adm.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Usuario;
import com.erp.adm.dto.UsuarioDTO;
import com.erp.adm.repositories.UsuarioRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;


@Service
public class UsuarioService implements Serializable{
	private static final long serialVersionUID = 1L;

	@Autowired
	private UsuarioRepository repo;

	public Usuario find(Long id) {
		Optional<Usuario> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Usuario.class.getName()));
	}
	
	public Usuario insert(Usuario obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}

	public Usuario update(Usuario obj) {
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

	public List<Usuario> findAll() {
		return repo.findAll();
	}

	public Usuario fromDTO(UsuarioDTO objDTO) {
		return new Usuario(objDTO.getCrf(), objDTO.getContaDtInicio(), objDTO.getQtdVendaData(), objDTO.getCodCartao(), objDTO.getLoginFarmaPop(), objDTO.getTipo(), objDTO.getAtivo());
	}
}
