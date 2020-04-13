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
import com.erp.adm.domain.Fabricante;
import com.erp.adm.domain.RamoAtividade;
import com.erp.adm.domain.Telefone;
import com.erp.adm.dto.FabricanteDTO;
import com.erp.adm.dto.FabricanteNewDTO;
import com.erp.adm.enums.TipoEndereco;
import com.erp.adm.enums.TipoTelefone;
import com.erp.adm.repositories.CidadeRepository;
import com.erp.adm.repositories.EnderecoRepository;
import com.erp.adm.repositories.FabricanteRepository;
import com.erp.adm.repositories.RamoAtividadeRepository;
import com.erp.adm.repositories.TelefoneRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;


@Service
public class FabricanteService { 
	
	@Autowired
	private FabricanteRepository repo;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@Autowired
	private RamoAtividadeRepository ramoAtividadeRepository;
	

	public Fabricante find(Long id) {
		Optional<Fabricante> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Fabricante.class.getName()));
	}

	
	public Fabricante insert(Fabricante obj) {
		obj.setCodigo(null);
		obj = repo.save(obj);
		enderecoRepository.saveAll(obj.getEnderecos());
		telefoneRepository.saveAll(obj.getTelefones());
		ramoAtividadeRepository.saveAll(obj.getRamoAtividades());
		return obj;
	}


	public Fabricante update(Fabricante obj) {
		Fabricante newObj = find(obj.getCodigo());
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


	public List<Fabricante> findAll() {
		return repo.findAll();
	}
	
	public Page<Fabricante> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}


	public Fabricante fromDTO(FabricanteDTO objDTO) {
		return new Fabricante(objDTO.getNomeFab(), objDTO.getRazaoFab(), objDTO.getFantasiaFab(), null, null, objDTO.getCnpjFab(), objDTO.getInscEstadualFab(), false, objDTO.getEmailFab(), null, null);
	}
	
	public Fabricante fromDTO(FabricanteNewDTO objDTO) {
		Fabricante fab = new Fabricante(objDTO.getNomeFab(), objDTO.getRazaoFab(), objDTO.getFantasiaFab(), objDTO.getDescontoFab(), objDTO.getDataCadFab(), objDTO.getCnpjFab(), objDTO.getInscEstadualFab(), objDTO.isLogFab(), objDTO.getEmailFab(), objDTO.getEmailFab(), objDTO.getDtAlteraFab());
		Optional<Cidade> cid = cidadeRepository.findById(objDTO.getCidadeId());
		Endereco end = new Endereco(objDTO.getRua(), objDTO.getNumero(), objDTO.getBairro(), objDTO.getComplemento(), objDTO.getCep(), TipoEndereco.toEnum(objDTO.getTipo_End()), cid.get(), null, null, null, null, fab, null, null);
		Telefone tel = new Telefone(objDTO.getDdd(), objDTO.getTelefone(), TipoTelefone.toEnum(objDTO.getTipoTel()), objDTO.getDataAlteraTel(), null, null, null, null, fab, null, null);
		RamoAtividade ratv = new RamoAtividade(objDTO.getDescricao(), null, null, fab, null);
		fab.getEnderecos().add(end);
		fab.getTelefones().add(tel);
		fab.getRamoAtividades().add(ratv);

		return fab;
	}
	
	private void updateData(Fabricante newObj, Fabricante obj) {
	}
}
