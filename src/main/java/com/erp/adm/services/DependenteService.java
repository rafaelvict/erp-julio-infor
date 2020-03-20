package com.erp.adm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Cliente;
import com.erp.adm.domain.Dependente;
import com.erp.adm.domain.DetalhesGerais;
import com.erp.adm.domain.DetalhesGrupo;
import com.erp.adm.dto.DependenteDTO;
import com.erp.adm.dto.DependenteNewDTO;
import com.erp.adm.enums.TipoAnimal;
import com.erp.adm.enums.TipoDependente;
import com.erp.adm.enums.TipoPorte;
import com.erp.adm.enums.TipoSexo;
import com.erp.adm.repositories.ClienteRepository;
import com.erp.adm.repositories.DependenteRepository;
import com.erp.adm.repositories.DetalhesGeraisRepository;
import com.erp.adm.repositories.DetalhesGrupoRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class DependenteService {
	
	@Autowired
	private DependenteRepository repo;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private DetalhesGeraisRepository detalhesGeraisRepository;
	
	@Autowired
	private DetalhesGrupoRepository detalhesGrupoRepository;
	

	public Dependente find(Long id) {
		Optional<Dependente> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Dependente.class.getName()));
	}

	
	public Dependente insert(Dependente obj) {
		obj.setCodigo(null);
		obj = repo.save(obj);
		detalhesGeraisRepository.saveAll(obj.getDetalhesGerais());
		return obj;
	}


	public Dependente update(Dependente obj) {
		Dependente newObj = find(obj.getCodigo());
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


	public List<Dependente> findAll() {
		return repo.findAll();
	}

	public Page<Dependente> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}

	public Dependente fromDTO(DependenteDTO objDTO) {
		return new Dependente(objDTO.getNomeDep(), objDTO.getCpf(), objDTO.getRg(), null, null, null, null, null, objDTO.getCor(), objDTO.getRacaAnimal(), null, null, null, false, null, null, null);
	}
	
	public Dependente fromDTO(DependenteNewDTO objDTO) {
		Optional<Cliente> cli = clienteRepository.findById(objDTO.getClienteId());
		Dependente dep = new Dependente(objDTO.getNomeDep(), objDTO.getCpf(), objDTO.getRg(), TipoDependente.toEnum(objDTO.getTipoDep()), objDTO.getDataCad(), objDTO.getNascimento(), objDTO.getStatus(), objDTO.getDataAltera(), objDTO.getCor(), objDTO.getRacaAnimal(), TipoAnimal.toEnum(objDTO.getTipoAnimal()), TipoSexo.toEnum(objDTO.getTipoSexo()), TipoPorte.toEnum(objDTO.getTipoPorte()), false, objDTO.getObs(), objDTO.getObs2(), cli.get());
		Optional<DetalhesGrupo> detGrupo = detalhesGrupoRepository.findById(objDTO.getGrupoId());
		DetalhesGerais detGerais = new DetalhesGerais(objDTO.getDescricao(), objDTO.getDataAltera(), detGrupo.get(), dep);
		dep.getDetalhesGerais().add(detGerais);
		
		
		return dep;
	}
	
	
	private void updateData(Dependente newObj, Dependente obj) {
		newObj.setDataAltera(obj.getDataAltera());
		newObj.setObs(obj.getObs());
		newObj.setObs2(obj.getObs2());
		newObj.setStatus(obj.getStatus());
		newObj.setRacaAnimal(obj.getRacaAnimal());
	}
}
