package com.erp.adm.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Funcionario;
import com.erp.adm.dto.FuncionarioDTO;
import com.erp.adm.repositories.FuncionarioRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;


@Service
public class FuncionarioService implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private FuncionarioRepository repo;

	public Funcionario find(Long id) {
		Optional<Funcionario> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Funcionario.class.getName()));
	}

	
	public Funcionario insert(Funcionario obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}


	public Funcionario update(Funcionario obj) {
		Funcionario newObj = find(obj.getCodigo());
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


	public List<Funcionario> findAll() {
		return repo.findAll();
	}


	public Funcionario fromDTO(FuncionarioDTO objDTO) {
		return new Funcionario(objDTO.getNome(), objDTO.getNascimento(), objDTO.getNascionalidade(), objDTO.getCpf(), objDTO.getEmail(), objDTO.getEstadoCivil(), objDTO.getSexo(), objDTO.getCarteiraTrabalho(), objDTO.getDataAdmissao());
	}
	
	private void updateData(Funcionario newObj, Funcionario obj) {
		newObj.setNome(obj.getNome());
		newObj.setCarteiraTrabalho(obj.getCarteiraTrabalho());
		newObj.setCpf(obj.getCpf());
		newObj.setDataAdmissao(obj.getDataAdmissao());
		newObj.setDescontoMax(obj.getDescontoMax());
		newObj.setEmail(obj.getEmail());
		newObj.setHorasSubst(obj.getHorasSubst());
		newObj.setMaxHoras(obj.getMaxHoras());
		newObj.setNascimento(obj.getNascimento());
		newObj.setPercComissaoAtac1(obj.getPercComissaoAtac1());
		newObj.setPercComissaoAtac2(obj.getPercComissaoAtac2());
		newObj.setSalarioHora(obj.getSalarioHora());
		newObj.setSexo(obj.getSexo());
	}
}
