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
import com.erp.adm.domain.Endereco;
import com.erp.adm.domain.Fornecedor;
import com.erp.adm.domain.Telefone;
import com.erp.adm.domain.Transp;
import com.erp.adm.dto.TranspDTO;
import com.erp.adm.dto.TranspNewDTO;
import com.erp.adm.enums.TipoEndereco;
import com.erp.adm.enums.TipoTelefone;
import com.erp.adm.repositories.CidadeRepository;
import com.erp.adm.repositories.EnderecoRepository;
import com.erp.adm.repositories.FornecedorRepository;
import com.erp.adm.repositories.TelefoneRepository;
import com.erp.adm.repositories.TranspRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;


@Service
public class TranspService {
	
	@Autowired
	private TranspRepository repo;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private FornecedorRepository fornecedorRepository;

	public Transp find(Long id) {
		Optional<Transp> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Transp.class.getName()));
	}
	
	public Transp insert(Transp obj) {
		obj.setCodigo(null);
		obj = repo.save(obj);
		enderecoRepository.saveAll(obj.getEnderecosTransp());
		telefoneRepository.saveAll(obj.getTelefonesTransp());
		return obj;
	}

	public Transp update(Transp obj) {
		Transp newObj = find(obj.getCodigo());
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

	public List<Transp> findAll() {
		return repo.findAll();
	}

	public Page<Transp> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}

	public Transp fromDTO(TranspDTO objDTO) {
		return new Transp(objDTO.getNomeTransp(), objDTO.getCnpjTransp(), null, objDTO.getInscEstadualTransp(), objDTO.getEmailTransp(), null, false, null, null, null, null);
	}
	
	public Transp fromDTO(TranspNewDTO objDTO) {
		Optional<Fornecedor> fornec = fornecedorRepository.findById(objDTO.getFornecedorId());
		Transp transp = new Transp(objDTO.getNomeTransp(), objDTO.getCnpjTransp(), objDTO.getUfTransp(), objDTO.getInscEstadualTransp(), objDTO.getEmailTransp(), objDTO.getPlacaTransp(), objDTO.isLogTransp(), objDTO.getDtAlteraTransp(), objDTO.getCodIbgeTransp(), objDTO.getSuframaTransp(), fornec.get());
		Optional<Cidade> cid = cidadeRepository.findById(objDTO.getCidadeId());
		Endereco end = new Endereco(objDTO.getRua(), objDTO.getNumero(), objDTO.getBairro(), objDTO.getComplemento(), objDTO.getCep(), TipoEndereco.toEnum(objDTO.getTipoEnd()), cid.get(), null, null, null, null, null, transp, null);
		Telefone tel = new Telefone(objDTO.getDdd(), objDTO.getTelefone(), TipoTelefone.toEnum(objDTO.getTipoTel()), objDTO.getDataAltera(), null, null, null, null, null, transp, null);
		transp.getEnderecosTransp().add(end);
		transp.getTelefonesTransp().add(tel);
		
		return transp;
	}
	
	private void updateData(Transp newObj, Transp obj) {
		
	}

}
