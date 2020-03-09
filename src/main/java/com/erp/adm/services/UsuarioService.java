package com.erp.adm.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
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
		Usuario newObj = find(obj.getCodigo());
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

	public List<Usuario> findAll() {
		return repo.findAll();
	}
	
	public Page<Usuario> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}

	public Usuario fromDTO(UsuarioDTO objDTO) {
		return new Usuario(null, null, null, null, null, null, objDTO.getCrf(), objDTO.getContaDtInicio(), objDTO.getQtdVendaData(), objDTO.getCodCartao(), objDTO.getLoginFarmaPop(), null, null, null, false, null, null);
	}
	
	private void updateData(Usuario newObj, Usuario obj) {
		newObj.setAtivo(obj.getAtivo()); 
		newObj.setCodCartao(obj.getCodCartao());
		newObj.setDataAltera(obj.getDataAltera());
		newObj.setLoginFarmaPop(obj.getLoginFarmaPop());
		newObj.setMaxComissao(obj.getMaxComissao());
		newObj.setQtdVendaData(obj.getQtdVendaData());
		newObj.setRedComissao(obj.getRedComissao());
		newObj.setRedComissaoDataC1(obj.getRedComissaoDataC1());
		newObj.setRedComissaoDataC2(obj.getRedComissaoDataC2());
		newObj.setTipo(obj.getTipo());
	}
}