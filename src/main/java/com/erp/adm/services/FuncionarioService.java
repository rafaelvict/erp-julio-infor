package com.erp.adm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Cidade;
import com.erp.adm.domain.Empresa;
import com.erp.adm.domain.Endereco;
import com.erp.adm.domain.Funcionario;
import com.erp.adm.domain.Telefone;
import com.erp.adm.dto.FuncionarioDTO;
import com.erp.adm.dto.FuncionarioNewDTO;
import com.erp.adm.enums.TipoEndereco;
import com.erp.adm.enums.TipoEstadoCivil;
import com.erp.adm.enums.TipoSexo;
import com.erp.adm.enums.TipoTelefone;
import com.erp.adm.repositories.CidadeRepository;
import com.erp.adm.repositories.EmpresaRepository;
import com.erp.adm.repositories.EnderecoRepository;
import com.erp.adm.repositories.FuncionarioRepository;
import com.erp.adm.repositories.TelefoneRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;


@Service
public class FuncionarioService { 
	
	@Autowired
	private FuncionarioRepository repo;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	

	public Funcionario find(Long id) {
		Optional<Funcionario> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Funcionario.class.getName()));
	}

	
	public Funcionario insert(Funcionario obj) {
		obj.setCodigo(null);
		obj = repo.save(obj);
		enderecoRepository.saveAll(obj.getEnderecos());
		telefoneRepository.saveAll(obj.getTelefones());
		return obj;
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
	
	public Page<Funcionario> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}


	public Funcionario fromDTO(FuncionarioDTO objDTO) {
		return new Funcionario(objDTO.getNome(), objDTO.getNascimento(), objDTO.getNascionalidade(), objDTO.getCpf(), objDTO.getEmail(), null, null, objDTO.getCarteiraTrabalho(), objDTO.getDataAdmissao(), null, null, null, null, null, null, null);
	}
	
	public Funcionario fromDTO(FuncionarioNewDTO objDTO) {
		Optional<Empresa> emp = empresaRepository.findById(objDTO.getEmpresaId());
		Optional<Cidade> cid = cidadeRepository.findById(objDTO.getCidadeId());
		Funcionario func = new Funcionario(objDTO.getNome(), objDTO.getNascimento(), objDTO.getNascionalidade(), objDTO.getCpf(), objDTO.getEmail(), TipoEstadoCivil.toEnum(objDTO.getEstadoCivil()), TipoSexo.toEnum(objDTO.getSexo()), objDTO.getCarteiraTrabalho(), objDTO.getDataAdmissao(), objDTO.getPercComissaoAtac1(), objDTO.getPercComissaoAtac2(), objDTO.getDescontoMax(), objDTO.getMaxHoras(), objDTO.getHorasSubst(), objDTO.getSalarioHora(), emp.get());
		Endereco end = new Endereco(objDTO.getRua(), objDTO.getNumero(), objDTO.getBairro(), objDTO.getComplemento(), objDTO.getCep(), TipoEndereco.toEnum(objDTO.getTipo_End()), cid.get(), null, func, null, null);
		Telefone tel = new Telefone(objDTO.getDdd(), objDTO.getTelefone(), TipoTelefone.toEnum(objDTO.getTipo_Tel()), objDTO.getData_altera(), null, func, null, null);
		func.getEnderecos().add(end);
		func.getTelefones().add(tel);
		
		return func;
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
