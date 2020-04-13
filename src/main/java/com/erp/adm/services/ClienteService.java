package com.erp.adm.services;

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
import com.erp.adm.domain.Cliente;
import com.erp.adm.domain.Empresa;
import com.erp.adm.domain.Endereco;
import com.erp.adm.domain.RamoAtividade;
import com.erp.adm.domain.Telefone;
import com.erp.adm.domain.Usuario;
import com.erp.adm.dto.ClienteDTO;
import com.erp.adm.dto.ClienteNewDTO;
import com.erp.adm.enums.TipoDocumento;
import com.erp.adm.enums.TipoEndereco;
import com.erp.adm.enums.TipoEstadoCivil;
import com.erp.adm.enums.TipoPessoa;
import com.erp.adm.enums.TipoSexo;
import com.erp.adm.enums.TipoTelefone;
import com.erp.adm.repositories.CidadeRepository;
import com.erp.adm.repositories.ClienteRepository;
import com.erp.adm.repositories.EmpresaRepository;
import com.erp.adm.repositories.EnderecoRepository;
import com.erp.adm.repositories.RamoAtividadeRepository;
import com.erp.adm.repositories.TelefoneRepository;
import com.erp.adm.repositories.UsuarioRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RamoAtividadeRepository ramoAtividadeRepository;
	
	public Cliente find(Long id) {
		Optional<Cliente> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
	@Transactional
	public Cliente insert(Cliente obj) {
		obj.setCodigo(null);
		obj = repo.save(obj);
		enderecoRepository.saveAll(obj.getEnderecos());
		telefoneRepository.saveAll(obj.getTelefones());
		ramoAtividadeRepository.saveAll(obj.getRamoAtividades());
		return obj;
		
	}

	public Cliente update(Cliente obj) {
		Cliente newObj = find(obj.getCodigo());
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

	public List<Cliente> findAll() {
		return repo.findAll();
	}

	public Page<Cliente> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}

	public Cliente fromDTO(ClienteDTO objDTO) {
		return new Cliente(objDTO.getNome(), null, null, objDTO.getCpfCnpj(), objDTO.getEmail(), null, null, false, false, null, null, objDTO.getInsc_Estadual(), objDTO.getInsc_Municipal(), null, objDTO.getFantasia(), true, null, null, false, null, false, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null);
	}

	public Cliente fromDTO(ClienteNewDTO objDTO) {
		Optional<Empresa> emp = empresaRepository.findById(objDTO.getEmpresaId());
		Optional<Usuario> usu = usuarioRepository.findById(objDTO.getUsuarioId());
		Cliente cli = new Cliente(objDTO.getNome(), objDTO.getNascimento(), objDTO.getNascionalidade(), objDTO.getCpfCnpj(), objDTO.getEmail(), TipoEstadoCivil.toEnum(objDTO.getEstadoCivil()), TipoSexo.toEnum(objDTO.getSexo()), objDTO.isAtivo(), objDTO.isOnline(), objDTO.getStatus(), null, objDTO.getInsc_Estadual(), objDTO.getInsc_Municipal(), TipoPessoa.toEnum(objDTO.getTipoPessoa()), objDTO.getFantasia(), objDTO.isBloqManual(), objDTO.getCartaoFidelidade(), objDTO.getPontosFidelidade(), objDTO.isVidaLink(), objDTO.getAcrescimo(), objDTO.isEpharma(), objDTO.getSuframa(), objDTO.isnExtConta(), objDTO.isMostraMsg(), objDTO.isGeraCobranca(), objDTO.getDocOrgaoExp(), objDTO.getDocUfEmissao(), TipoDocumento.toEnum(objDTO.getDocTipo()), objDTO.getCodControle(), objDTO.getObs(), objDTO.getDtAlteraCli(), objDTO.getNumeroChapa(), objDTO.isUltraCard(), emp.get(), usu.get(), null, null);
		Optional<Cidade> cid = cidadeRepository.findById(objDTO.getCidadeId());
		Endereco end = new Endereco(objDTO.getRua(), objDTO.getNumero(), objDTO.getBairro(), objDTO.getComplemento(), objDTO.getCep(), TipoEndereco.toEnum(objDTO.getTipo_End()), cid.get(), null, null, null, cli, null, null, null);
		Telefone tel = new Telefone(objDTO.getDdd(), objDTO.getTelefone(), TipoTelefone.toEnum(objDTO.getTipo_Tel()), objDTO.getDataAlteraTel(), null, null, null, cli, null, null, null);
		RamoAtividade ramatv = new RamoAtividade(objDTO.getDescricaoRamo(), null, cli, null, null);
		cli.getEnderecos().add(end);
		cli.getTelefones().add(tel);
		cli.getRamoAtividades().add(ramatv);
		
		return cli;
	}
	
	private void updateData(Cliente newObj, Cliente obj) {
		newObj.setNome(obj.getNome());
	}
}
