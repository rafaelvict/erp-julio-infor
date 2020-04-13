package com.erp.adm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.erp.adm.domain.Cest;
import com.erp.adm.domain.Cst;
import com.erp.adm.domain.Empresa;
import com.erp.adm.domain.Fabricante;
import com.erp.adm.domain.GeneroMercadoria;
import com.erp.adm.domain.Grupo;
import com.erp.adm.domain.GrupoLinhas;
import com.erp.adm.domain.GrupoPreco;
import com.erp.adm.domain.NaturezaReceita;
import com.erp.adm.domain.Produto;
import com.erp.adm.domain.Psicotropico;
import com.erp.adm.domain.Secao;
import com.erp.adm.domain.SubGrupo;
import com.erp.adm.domain.TotalizadorFiscal;
import com.erp.adm.domain.Unidade;
import com.erp.adm.dto.ProdutoDTO;
import com.erp.adm.dto.ProdutoNewDTO;
import com.erp.adm.enums.TipoClasseTerapeutica;
import com.erp.adm.enums.TipoIndicadorArredTrunc;
import com.erp.adm.enums.TipoIndicadorPropTerc;
import com.erp.adm.enums.TipoItem;
import com.erp.adm.enums.TipoLcm;
import com.erp.adm.enums.TipoReceita;
import com.erp.adm.repositories.CestRepository;
import com.erp.adm.repositories.CstRepository;
import com.erp.adm.repositories.EmpresaRepository;
import com.erp.adm.repositories.FabricanteRepository;
import com.erp.adm.repositories.GeneroMercadoriaRepository;
import com.erp.adm.repositories.GrupoLinhasRepository;
import com.erp.adm.repositories.GrupoPrecoRepository;
import com.erp.adm.repositories.GrupoRepository;
import com.erp.adm.repositories.NaturezaReceitaRepository;
import com.erp.adm.repositories.ProdutoRepository;
import com.erp.adm.repositories.PsicotropicoRepository;
import com.erp.adm.repositories.SecaoRepository;
import com.erp.adm.repositories.SubGrupoRepository;
import com.erp.adm.repositories.TotalizadorFiscalRepository;
import com.erp.adm.repositories.UnidadeRepository;
import com.erp.adm.services.exceptions.DataIntegrityException;
import com.erp.adm.services.exceptions.ObjectNotFoundException;


@Service
public class ProdutoService { 
	
	@Autowired
	private ProdutoRepository repo;
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private PsicotropicoRepository psicotropicoRepository;
	
	@Autowired
	private CestRepository cestRepository;
	
	@Autowired
	private SecaoRepository secaoRepository;
	
	@Autowired
	private UnidadeRepository unidadeRepository;
	
	@Autowired
	private GrupoPrecoRepository grupoPrecoRepository;
	
	@Autowired
	private GrupoRepository grupoRepository;
	
	@Autowired
	private GrupoLinhasRepository grupoLinhasRepository;
	
	@Autowired
	private GeneroMercadoriaRepository generoMercadoriaRepository;
	
	@Autowired
	private SubGrupoRepository subGrupoRepository;
	
	@Autowired
	private FabricanteRepository fabricanteRepository;
	
	@Autowired
	private TotalizadorFiscalRepository totalizadorFiscalRepository;
	
	@Autowired
	private NaturezaReceitaRepository naturezaReceitaRepository;
	
	@Autowired
	private CstRepository cstPisCofinsEntradaRepository;
	
	@Autowired
	private CstRepository cstPisCofinsSaidaRepository;
	
	

	public Produto find(Long id) {
		Optional<Produto> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Produto.class.getName()));
	}

	
	public Produto insert(Produto obj) {
		obj.setCodigo(null);
		obj = repo.save(obj);
		return obj;
	}


	public Produto update(Produto obj) {
		Produto newObj = find(obj.getCodigo());
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


	public List<Produto> findAll() {
		return repo.findAll();
	}
	
	public Page<Produto> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}


	public Produto fromDTO(ProdutoDTO objDTO) {
		return new Produto(objDTO.getDescricao(), objDTO.getCodBarra(), null, null, null, null, null, null, null, null, null, null, false, objDTO.getEstMin(), objDTO.getEstMax(), null, null, null, null, null, objDTO.getAbc(), null, null, false, false, false, null, null, null, null, null, null, null, objDTO.getPrecoCompraCaixa(), objDTO.getPrecoVendaCaixa(), objDTO.getComissao(), null, objDTO.getPrecoAnt(), objDTO.getPrecoMedioCompra(), false, null, null, false, objDTO.getNcm(), null, null, null, null, null, false, false, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
	}
	
	public Produto fromDTO(ProdutoNewDTO objDTO) {
		Optional<Empresa> emp = empresaRepository.findById(objDTO.getEmpresaId());
		Optional<Psicotropico> psico = psicotropicoRepository.findById(objDTO.getPsicotropicoId());
		Optional<Cest> cest = cestRepository.findById(objDTO.getCestId());
		Optional<Secao> secao = secaoRepository.findById(objDTO.getSecaoId());
		Optional<Unidade> und = unidadeRepository.findById(objDTO.getUnidadeId());
		Optional<GrupoPreco> grpPrc = grupoPrecoRepository.findById(objDTO.getGrupoPrecoId());
		Optional<Grupo> grp = grupoRepository.findById(objDTO.getGrupoId());
		Optional<GrupoLinhas> grpLinhas = grupoLinhasRepository.findById(objDTO.getGrupoLinhasId());
		Optional<GeneroMercadoria> gnrMerc = generoMercadoriaRepository.findById(objDTO.getGeneroMercadoriaId());
		Optional<SubGrupo> subGrp = subGrupoRepository.findById(objDTO.getSubGrupoId());
		Optional<Fabricante> fab = fabricanteRepository.findById(objDTO.getFabricanteId());
		Optional<TotalizadorFiscal> totFisc = totalizadorFiscalRepository.findById(objDTO.getTotalizadorFiscalId());
		Optional<NaturezaReceita> natReceita = naturezaReceitaRepository.findById(objDTO.getNaturezaReceitaId());
		Optional<Cst> cstEnt = cstPisCofinsEntradaRepository.findById(objDTO.getCstPisCofinsEntradaId());
		Optional<Cst> cstSaida = cstPisCofinsSaidaRepository.findById(objDTO.getCstPisCofinsSaidaId());
		
		Produto prod = new Produto(objDTO.getDescricao(), objDTO.getCodBarra(), objDTO.getCodBarra2(), objDTO.getCodBarra3(), objDTO.getPrecoEntrada(), objDTO.getPrecoCusto(), objDTO.getMgVar(), objDTO.getPrecoVar(), objDTO.getMgAtac1(), objDTO.getPrecoAtac1(), objDTO.getMgAtac2(), objDTO.getPrecoAtac2(), objDTO.isFf(), objDTO.getEstMin(), objDTO.getEstMax(), TipoLcm.toEnum(objDTO.getLcm()), objDTO.getDesconto(), objDTO.getIpi(), objDTO.getTxFin(), objDTO.getFrete(), objDTO.getAbc(), objDTO.getTxImport(), objDTO.getDescEstiq(), objDTO.isDescEmp(), objDTO.isInativo(), objDTO.isFormula(), objDTO.getEstoque(), objDTO.getPrecoAtual(), objDTO.getDtAtual(), objDTO.getDtAtualizado(), objDTO.getDescFab1(), objDTO.getDescFab2(), objDTO.getQtdCaixa(), objDTO.getPrecoCompraCaixa(), objDTO.getPrecoVendaCaixa(), objDTO.getComissao(), objDTO.getPrecoPromo(), objDTO.getPrecoAnt(), objDTO.getPrecoMedioCompra(), objDTO.isPisConfis(), objDTO.getDtAltera(), objDTO.getDescMax(), objDTO.isEstNeg(), objDTO.getNcm(), objDTO.getRedBase(), objDTO.getTxDiversas(), objDTO.getValorAdc(), objDTO.getPesoLiq(), objDTO.getPesoBruto(), objDTO.isBloqDesc(), objDTO.isVidaLink(), objDTO.getDescontoEmp(), objDTO.getRegistroMs(), objDTO.isServico(), TipoReceita.toEnum(objDTO.getTipoReceita()), objDTO.getPrecoPrazo(), objDTO.getPrecoUltCompra(), objDTO.isBloqPromo(), objDTO.getEstoque2(), objDTO.getSal(), objDTO.getEstPsico(), objDTO.getDataUltVenda(), objDTO.getAliqIntSaida(), objDTO.getAliqNf(), objDTO.getAcrescimo(), objDTO.getNbm(), objDTO.isBloqDescAVista(), objDTO.getQtdPorEmb(), objDTO.getLocal(), objDTO.getTmp1(), objDTO.getIndicadorTrib(), objDTO.getIvast(), objDTO.getAliqEntDentro(), objDTO.getAliqEntFora(), objDTO.getCfopEnt(), objDTO.isNaoRelac(), objDTO.getClassFiscal(), TipoIndicadorArredTrunc.toEnum(objDTO.getIndArredTrunc()), TipoIndicadorPropTerc.toEnum(objDTO.getIndPropTerc()), objDTO.getAliqSubst(), objDTO.getDcb(), objDTO.isUsaEan(), objDTO.getPesoBru(), objDTO.getPesoLiquido(), objDTO.getCstPis(), objDTO.getCstCofins(), objDTO.getCsoSn(), objDTO.getPrecoCustoDolar(), objDTO.getCstPisEntrada(), objDTO.getNatReceitaPisCofins(), objDTO.getMilhoesEncerrante(), objDTO.getAliqRedPis(), objDTO.getAliqRedCofins(), TipoClasseTerapeutica.toEnum(objDTO.getTipoClasseTerapeutica()), objDTO.isUsoProlongado(), objDTO.getAliquota(), objDTO.getChavePaf(), objDTO.getSeqPaf(), objDTO.getAliqInternaIva(), objDTO.getAliqInterestadualIva(), objDTO.getIvastFora(), objDTO.getPrecoMinimo(), objDTO.getCodTf2(), objDTO.getCodTf3(), objDTO.getCodCbc(), objDTO.getCodCf(), objDTO.getCodCf2(), objDTO.getCodCf3(), TipoItem.toEnum(objDTO.getTipoItem()), psico.get(), cest.get(), secao.get(), und.get(), grpPrc.get(), grp.get(), grpLinhas.get(), gnrMerc.get(), subGrp.get(), fab.get(), totFisc.get(), natReceita.get(), cstEnt.get(), cstSaida.get(), emp.get());
		
		
		return prod;
	}
	
	private void updateData(Produto newObj, Produto obj) {
	}
}
