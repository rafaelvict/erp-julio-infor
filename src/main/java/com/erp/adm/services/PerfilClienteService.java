package com.erp.adm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.PerfilCliente;
import com.erp.adm.domain.Cliente;
import com.erp.adm.dto.PerfilClienteDTO;
import com.erp.adm.dto.PerfilClienteNewDTO;
import com.erp.adm.repositories.PerfilClienteRepository;
import com.erp.adm.repositories.ClienteRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class PerfilClienteService {
	
	@Autowired
	private PerfilClienteRepository repo;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public PerfilCliente find(Long id) {
		Optional<PerfilCliente> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + PerfilCliente.class.getName()));
	}
	
	public PerfilCliente insert(PerfilCliente obj) {
		obj.setCodigo(null);
		obj = repo.save(obj);
		return obj;
		
	}

	public PerfilCliente update(PerfilCliente obj) {
		PerfilCliente newObj = find(obj.getCodigo());
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
	
	public List<PerfilCliente> findAll() {
		return repo.findAll();
	}
	
	public PerfilCliente fromDTO(PerfilClienteDTO objDTO) {
		return new PerfilCliente(objDTO.getDescricaoPerf(), objDTO.getDtPrimComp(), objDTO.getDtUltComp(), objDTO.getDesconto(), objDTO.getDescMaxVista(), objDTO.getDescMaxPrazo(), null, objDTO.isSomenteVista(), null, null, null, null, null, null, null, null, null, null, null, null, null);
	}
	
	public PerfilCliente fromDTO(PerfilClienteNewDTO objDTO) {
		Optional<Cliente> cli = clienteRepository.findById(objDTO.getClienteId());
		PerfilCliente perf = new PerfilCliente(objDTO.getDescricaoPerf(), objDTO.getDtPrimComp(), objDTO.getDtUltComp(), objDTO.getDesconto(), objDTO.getDescMaxVista(), objDTO.getDescMaxPrazo(), objDTO.getDataCad(), objDTO.isSomenteVista(), objDTO.getDiasAtraso(), objDTO.getSaldoDev(), objDTO.getSaldoMes(), objDTO.getCredito(), objDTO.getLimite(), objDTO.getLimiteMes(), objDTO.getMaxDiasAtraso(), objDTO.getAcrescimo(), objDTO.getCodigoIbge(), objDTO.getDiaVencto(), objDTO.getAbc(), objDTO.getDtAlteraPerf(), cli.get());
		
		return perf;
	}
	
	private void updateData(PerfilCliente newObj, PerfilCliente obj) {
		newObj.setAcrescimo(obj.getAcrescimo());
		newObj.setCredito(obj.getCredito());
		newObj.setDescMaxPrazo(obj.getDescMaxPrazo());
		newObj.setDescMaxVista(obj.getDescMaxVista());
		newObj.setDesconto(obj.getDesconto());
		newObj.setDescricaoPerf(obj.getDescricaoPerf());
		newObj.setDiasAtraso(obj.getDiasAtraso());
		newObj.setDiaVencto(obj.getDiaVencto());
		newObj.setDtAlteraPerf(obj.getDtAlteraPerf());
		newObj.setDtUltComp(obj.getDtUltComp());
		newObj.setLimite(obj.getLimite());
		newObj.setLimiteMes(obj.getLimiteMes());
		newObj.setMaxDiasAtraso(obj.getMaxDiasAtraso());
		newObj.setSomenteVista(obj.isSomenteVista());
	}
}
