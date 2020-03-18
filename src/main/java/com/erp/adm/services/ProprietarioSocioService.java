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
import com.erp.adm.domain.ProprietarioSocio;
import com.erp.adm.domain.Telefone;
import com.erp.adm.dto.ProprietarioSocioDTO;
import com.erp.adm.dto.ProprietarioSocioNewDTO;
import com.erp.adm.enums.TipoEndereco;
import com.erp.adm.enums.TipoEstadoCivil;
import com.erp.adm.enums.TipoPessoa;
import com.erp.adm.enums.TipoProprietarioSocio;
import com.erp.adm.enums.TipoSexo;
import com.erp.adm.enums.TipoTelefone;
import com.erp.adm.repositories.CidadeRepository;
import com.erp.adm.repositories.EmpresaRepository;
import com.erp.adm.repositories.EnderecoRepository;
import com.erp.adm.repositories.ProprietarioSocioRepository;
import com.erp.adm.repositories.TelefoneRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class ProprietarioSocioService {
	
	@Autowired
	private ProprietarioSocioRepository repo;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@Autowired
	private EmpresaRepository empresaRepository;
	

	public ProprietarioSocio find(Long id) {
		Optional<ProprietarioSocio> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + ProprietarioSocio.class.getName()));
	}

	
	public ProprietarioSocio insert(ProprietarioSocio obj) {
		obj.setCodigo(null);
		obj = repo.save(obj);
		enderecoRepository.saveAll(obj.getEnderecos());
		telefoneRepository.saveAll(obj.getTelefones());
		return obj;
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
		return new ProprietarioSocio(objDTO.getNome(), objDTO.getNascimento(), objDTO.getNascionalidade(), objDTO.getCpfCnpj(), objDTO.getEmail(), null, null, null, null, null, null);
	}
	
	public ProprietarioSocio fromDTO(ProprietarioSocioNewDTO objDTO) {
		Optional<Cidade> cid = cidadeRepository.findById(objDTO.getCidadeId());
		Optional<Empresa> emp = empresaRepository.findById(objDTO.getEmpresaId());
		ProprietarioSocio propsoc = new ProprietarioSocio(objDTO.getNome(), objDTO.getNascimento(), objDTO.getNascionalidade(), objDTO.getCpfCnpj(), objDTO.getEmail(), TipoEstadoCivil.toEnum(objDTO.getEstadoCivil()), TipoSexo.toEnum(objDTO.getSexo()), TipoPessoa.toEnum( objDTO.getPessoa()), emp.get(), null, TipoProprietarioSocio.toEnum(objDTO.getProprietarioSocio()));
		Endereco end = new Endereco(objDTO.getRua(), objDTO.getNumero(), objDTO.getBairro(), objDTO.getComplemento(), objDTO.getCep(), TipoEndereco.toEnum(objDTO.getTipo_End()), cid.get(), null, null, propsoc, null);
		Telefone tel = new Telefone(objDTO.getDdd(), objDTO.getTelefone(), TipoTelefone.toEnum(objDTO.getTipo_Tel()),objDTO.getData_altera(), null, null, propsoc, null);
		propsoc.getEnderecos().add(end);
		propsoc.getTelefones().add(tel);
		
		return propsoc;
	}
	
	
	private void updateData(ProprietarioSocio newObj, ProprietarioSocio obj) {
		newObj.setNome(obj.getNome());
		newObj.setSexo(obj.getSexo());
		newObj.setEmail(obj.getEmail());
	}
}
