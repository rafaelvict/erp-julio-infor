package com.erp.adm.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.adm.domain.Cidade;
import com.erp.adm.domain.Empresa;
import com.erp.adm.domain.Endereco;
import com.erp.adm.domain.RamoAtividade;
import com.erp.adm.domain.Telefone;
import com.erp.adm.dto.EmpresaDTO;
import com.erp.adm.dto.EmpresaNewDTO;
import com.erp.adm.enums.TipoEndereco;
import com.erp.adm.enums.TipoPreco;
import com.erp.adm.enums.TipoTelefone;
import com.erp.adm.enums.TipoVencto;
import com.erp.adm.enums.TipoVenda;
import com.erp.adm.repositories.CidadeRepository;
import com.erp.adm.repositories.EmpresaRepository;
import com.erp.adm.repositories.EnderecoRepository;
import com.erp.adm.repositories.RamoAtividadeRepository;
import com.erp.adm.repositories.TelefoneRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class EmpresaService implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EmpresaRepository repo;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@Autowired
	private RamoAtividadeRepository ramoAtividadeRepository;
	
	public Empresa find(Long id) {
		Optional<Empresa> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Empresa.class.getName()));
	}
	
	@Transactional
	public Empresa insert(Empresa obj) {
		obj.setCodigo(null);
		obj = repo.save(obj);
		enderecoRepository.saveAll(obj.getEnderecos());
		telefoneRepository.saveAll(obj.getTelefones());
		ramoAtividadeRepository.saveAll(obj.getRamoAtividades());
		return obj;
		
	}

	public Empresa update(Empresa obj) {
		Empresa newObj = find(obj.getCodigo());
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

	public List<Empresa> findAll() {
		return repo.findAll();
	}

	public Page<Empresa> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}

	public Empresa fromDTO(EmpresaDTO objDTO) {
		return new Empresa(objDTO.getNome(), objDTO.getCnpj(), objDTO.getInsc_Estadual(), objDTO.getInsc_Municipal(), objDTO.getEmail(), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, objDTO.getCodigo_Ibge(), false, false, false, false, false, false, false, false, false, false, null, null, null, null, false, false, null, false, null, false, null, false, null, false, false, false, false, null, null, null);
	}

	public Empresa fromDTO(EmpresaNewDTO objDTO) {
		Empresa emp = new Empresa(objDTO.getNome(), objDTO.getCnpj(), objDTO.getInsc_Estadual(), objDTO.getInsc_Municipal(), objDTO.getEmail(), objDTO.getVias(), objDTO.getVias_Boleto(), objDTO.getDias_Juros(), objDTO.getMulta(), objDTO.getMora(), objDTO.getIni_Mes(), objDTO.getFim_Mes(), objDTO.getBolBancario(), objDTO.getValor_IsencaoBoleto(), objDTO.getValor_AdcBoleto(), objDTO.getDesconto_Funcionario(), objDTO.getDesconto_Empresa(), objDTO.getAcrescimo(), TipoVenda.toEnum(objDTO.getTipo_Venda()), TipoPreco.toEnum(objDTO.getTipo_Preco()), objDTO.getDelivery(), objDTO.getDias_DescFab(), objDTO.getCodigo_Ibge(), objDTO.getCreadiario(), objDTO.getPergNota(), objDTO.getDescMaxGrupo(), objDTO.getPergPontoVenda(), objDTO.getUsarProcPromo(), objDTO.getUsarDescVista(), objDTO.getPermDesc(), objDTO.getPedirTransp(), objDTO.getFarmaciaPopular(), objDTO.getControleVencto(), objDTO.getMsgBoleto1(), objDTO.getMsgBoleto2(), objDTO.getMesReceb(), objDTO.getMascara(), objDTO.getCupomFisc(), objDTO.getEmitirBoletoBanc(), objDTO.getVias_Pagto(), objDTO.getLog(), objDTO.getData_altera(), objDTO.getImpCv(), TipoVencto.toEnum(objDTO.getTipo_Vencto()), objDTO.getIgnorarSaldo(), objDTO.getMsg_Venda(), objDTO.getManterDescEmp(), objDTO.getSemComissao(), objDTO.getNumAutoriz(), objDTO.getIgnorarPrecoPrazo(), objDTO.getPercent_Vista(), objDTO.getPercent_CartaFrete(), objDTO.getPontos_PorReal());
		Optional<Cidade> cid = cidadeRepository.findById(objDTO.getCidadeId());
		Endereco end = new Endereco(objDTO.getRua(), objDTO.getNumero(), objDTO.getBairro(), objDTO.getComplemento(), objDTO.getCep(), TipoEndereco.toEnum(objDTO.getTipo_End()), cid.get(), emp, null, null);
		Telefone tel = new Telefone(objDTO.getDdd(), objDTO.getTelefone(), TipoTelefone.toEnum(objDTO.getTipo_tel()),objDTO.getDataAltera(), emp, null, null);
		RamoAtividade ratv = new RamoAtividade(objDTO.getDescricao(), emp);
		emp.getEnderecos().add(end);
		emp.getTelefones().add(tel);
		emp.getRamoAtividades().add(ratv);
		
		return emp;
	}
	
	private void updateData(Empresa newObj, Empresa obj) {
		newObj.setNome(obj.getNome());
	}
}
