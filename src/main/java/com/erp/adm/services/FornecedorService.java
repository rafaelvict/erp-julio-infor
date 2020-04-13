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
import com.erp.adm.domain.Fornecedor;
import com.erp.adm.domain.RamoAtividade;
import com.erp.adm.domain.Telefone;
import com.erp.adm.dto.FornecedorDTO;
import com.erp.adm.dto.FornecedorNewDTO;
import com.erp.adm.enums.TipoEndereco;
import com.erp.adm.enums.TipoEstadoCivil;
import com.erp.adm.enums.TipoSexo;
import com.erp.adm.enums.TipoTelefone;
import com.erp.adm.repositories.CidadeRepository;
import com.erp.adm.repositories.EmpresaRepository;
import com.erp.adm.repositories.EnderecoRepository;
import com.erp.adm.repositories.FornecedorRepository;
import com.erp.adm.repositories.RamoAtividadeRepository;
import com.erp.adm.repositories.TelefoneRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;


@Service
public class FornecedorService { 
	
	@Autowired
	private FornecedorRepository repo;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@Autowired
	private RamoAtividadeRepository ramoAtividadeRepository;
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	

	public Fornecedor find(Long id) {
		Optional<Fornecedor> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Fornecedor.class.getName()));
	}

	
	public Fornecedor insert(Fornecedor obj) {
		obj.setCodigo(null);
		obj = repo.save(obj);
		enderecoRepository.saveAll(obj.getEnderecos());
		telefoneRepository.saveAll(obj.getTelefones());
		ramoAtividadeRepository.saveAll(obj.getRamoAtividades());
		return obj;
	}


	public Fornecedor update(Fornecedor obj) {
		Fornecedor newObj = find(obj.getCodigo());
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


	public List<Fornecedor> findAll() {
		return repo.findAll();
	}
	
	public Page<Fornecedor> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}


	public Fornecedor fromDTO(FornecedorDTO objDTO) {
		return new Fornecedor(objDTO.getNome(), null, null, objDTO.getCpfCnpj(), objDTO.getEmail(), null, null, null, objDTO.getFantasia(), objDTO.getInscEstadual(), objDTO.getInscMunicipal(), null, null, null, null, false, null);
	}
	
	public Fornecedor fromDTO(FornecedorNewDTO objDTO) {
		Optional<Empresa> emp = empresaRepository.findById(objDTO.getEmpresaId());
		Fornecedor fornec = new Fornecedor(objDTO.getNome(), objDTO.getNascimento(), objDTO.getNascionalidade(), objDTO.getCpfCnpj(), objDTO.getEmail(), TipoEstadoCivil.toEnum(objDTO.getTipoEstadoCivil()), TipoSexo.toEnum(objDTO.getTipoSexo()), objDTO.getRazao(), objDTO.getFantasia(), objDTO.getInscEstadual(), objDTO.getInscMunicipal(), objDTO.getSuframa(), objDTO.getTipoFornecedor(), objDTO.getCodIbge(), objDTO.getObs(), objDTO.isInativo(), emp.get());
		Optional<Cidade> cid = cidadeRepository.findById(objDTO.getCidadeId());
		Endereco end = new Endereco(objDTO.getRua(), objDTO.getNumero(), objDTO.getBairro(), objDTO.getComplemento(), objDTO.getCep(), TipoEndereco.toEnum(objDTO.getTipoEnd()), cid.get(), null, null, null, null, null, null, fornec);
		Telefone tel = new Telefone(objDTO.getDdd(), objDTO.getTelefone(), TipoTelefone.toEnum(objDTO.getTipoTel()), objDTO.getDataAlteraTel(), null, null, null, null, null, null, fornec);
		RamoAtividade ramoAtv = new RamoAtividade(objDTO.getDescricao(), null, null, null, fornec);
		fornec.getEnderecos().add(end);
		fornec.getTelefones().add(tel);
		fornec.getRamoAtividades().add(ramoAtv);
		
		return fornec;
	}
	
	private void updateData(Fornecedor newObj, Fornecedor obj) {
	}
}
