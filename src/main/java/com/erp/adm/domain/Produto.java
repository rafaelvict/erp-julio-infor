package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.erp.adm.enums.TipoClasseTerapeutica;
import com.erp.adm.enums.TipoItem;
import com.erp.adm.enums.TipoReceita;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produto extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	private String codBarra;
	private String codBarra2;
	private String codBarra3;
	private Float precoEntrada;
	private Float precoCusto;
	private Integer mgVar;
	private Float precoVar;
	private Integer mgAtac1;
	private Float precoAtac1;
	private Integer mgAtac2;
	private Float precoAtac2; 
	private boolean ff;
	private Integer estMin;
	private Integer estMax;
	private String lcm;
	private Integer desconto;
	private Integer ipi;
	private Integer txFin;
	private Integer frete;
	private String abc;
	private Integer txImport;
	private String descEstiq;
	private Integer descEmp;
	private boolean inativo;
	private boolean formula;
	private Integer estoque;
	private Float precoAtual;
	private Date dtAtual;
	private Date dtAtualizado;
	private Integer descFab1;
	private Integer descFab2;
	private Integer qtdCaixa;
	private Integer precoCompraCaixa;
	private Integer precoVendaCaixa;
	private Integer comissao;
	private Float precoPromo;
	private Double precoAnt;
	private Double precoMedioCompra;
	private boolean pisConfis;
	private Date dtAltera;
	private Integer descMax;
	private boolean estNeg;
	private String ncm;
	private Integer redBase;
	private Integer txDiversas;
	private Integer valorAdc;
	private Integer moedaC;
	private Integer moedaV;
	private Integer moedaE;
	private Integer pesoLiq;
	private Integer pesoBruto;
	private boolean bloqDesc;
	private boolean vidaLink;
	private Integer descontoEmp;
	private String registroMs;
	private boolean servico;
	private Integer tipoReceita;
	private Float precoPrazo;
	private Float precoUltCompra;
	private boolean bloqPromo;
	private Integer estoque2;
	private String sal;
	private Integer estPsico;
	private Date dataUltVenda;
	private Integer aliqIntSaida;
	private Integer aliqNf;
	private Integer acrescimo;
	private String nbm;
	private boolean bloqDescAVista;
	private Integer qtdPorEmb;
	private String local;
	private String tmp1;
	private Integer indicadorTrib;
	private Integer ivast;
	private Integer aliqEntDentro;
	private Integer aliqEntFora;
	private Integer cfopEnt;
	private boolean naoRelac;
	private String classFiscal;
	private boolean indArredTrunc;
	private boolean indPropTerc;
	private Integer aliqSubst;
	private Integer dcb;
	private boolean usaEan;
	private Integer pesoBru;
	private Integer pesoLiquido;
	private Integer cstPis;
	private Integer cstCofins;
	private Integer csoSn;
	private Integer precoCustoDolar;
	private Integer cstPisEntrada;
	private String natReceitaPisCofins;
	private Integer milhoesEncerrante;
	private Integer aliqRedPis;
	private Integer aliqRedCofins;
	private Integer tipoClasseTerapeutica;
	private boolean usoProlongado;
	private Integer aliquota;
	private Integer chavePaf;
	private Integer seqPaf;
	private Integer aliqInternaIva;
	private Integer aliqInterestadualIva;
	private Integer ivastFora;
	private Float precoMinimo;
	private Integer codTf2;
	private Integer codTf3;
	private String codCbc;
	private Integer codCf;
	private String codCf2;
	private String codCf3;
	private Integer codLinha;
	private Integer tipoItem;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "psicotropico_id")
	private Psicotropico psicotropico;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "cest_id")
	private Cest cest;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "secao_id")
	private Secao secao;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "unidade_id")
	private Unidade unidade;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "grupopreco_id")
	private GrupoPreco grupoPreco;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "grupo_id")
	private Grupo grupo;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "grupoLinhas_id")
	private GrupoLinhas grupoLinhas;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "generoMercadoria_id")
	private GeneroMercadoria generoMercadoria;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "subgrupo_id")
	private SubGrupo subGrupo;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "fabricante_id")
	private Fabricante fabricante;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "totalizadorFiscal_id")
	private TotalizadorFiscal totalizadorFiscal;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "naturezaReceita_id")
	private NaturezaReceita naturezaReceita;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "cstPisCofins_entrada")
	private Cst cstPisCofins_entrada;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "cstPisCofins_saida")
	private Cst cstPisCofins_saida;
	
	public Produto() {
		
	}

	public Produto(String descricao, String codBarra, String codBarra2, String codBarra3, Float precoEntrada,
			Float precoCusto, Integer mgVar, Float precoVar, Integer mgAtac1, Float precoAtac1, Integer mgAtac2,
			Float precoAtac2, boolean ff, Integer estMin, Integer estMax, String lcm, Integer desconto, Integer ipi,
			Integer txFin, Integer frete, String abc, Integer txImport, String descEstiq, Integer descEmp,
			boolean inativo, boolean formula, Integer estoque, Float precoAtual, Date dtAtual, Date dtAtualizado,
			Integer descFab1, Integer descFab2, Integer qtdCaixa, Integer precoCompraCaixa, Integer precoVendaCaixa,
			Integer comissao, Float precoPromo, Double precoAnt, Double precoMedioCompra, boolean pisConfis,
			Date dtAltera, Integer descMax, boolean estNeg, String ncm, Integer redBase, Integer txDiversas,
			Integer valorAdc, Integer moedaC, Integer moedaV, Integer moedaE, Integer pesoLiq, Integer pesoBruto,
			boolean bloqDesc, boolean vidaLink, Integer descontoEmp, String registroMs, boolean servico,
			TipoReceita tipoReceita, Float precoPrazo, Float precoUltCompra, boolean bloqPromo, Integer estoque2,
			String sal, Integer estPsico, Date dataUltVenda, Integer aliqIntSaida, Integer aliqNf, Integer acrescimo,
			String nbm, boolean bloqDescAVista, Integer qtdPorEmb, String local, String tmp1, Integer indicadorTrib,
			Integer ivast, Integer aliqEntDentro, Integer aliqEntFora, Integer cfopEnt, boolean naoRelac,
			String classFiscal, boolean indArredTrunc, boolean indPropTerc, Integer aliqSubst, Integer dcb,
			boolean usaEan, Integer pesoBru, Integer pesoLiquido, Integer cstPis, Integer cstCofins, Integer csoSn,
			Integer precoCustoDolar, Integer cstPisEntrada, String natReceitaPisCofins, Integer milhoesEncerrante,
			Integer aliqRedPis, Integer aliqRedCofins, TipoClasseTerapeutica tipoClasseTerapeutica, boolean usoProlongado,
			Integer aliquota, Integer chavePaf, Integer seqPaf, Integer aliqInternaIva, Integer aliqInterestadualIva,
			Integer ivastFora, Float precoMinimo, Integer codTf2, Integer codTf3, String codCbc, Integer codCf,
			String codCf2, String codCf3, Integer codLinha, TipoItem tipoItem, Psicotropico psicotropico, Cest cest,
			Secao secao, Unidade unidade, GrupoPreco grupoPreco, Grupo grupo, GrupoLinhas grupoLinhas,
			GeneroMercadoria generoMercadoria, SubGrupo subGrupo, Fabricante fabricante,
			TotalizadorFiscal totalizadorFiscal, NaturezaReceita naturezaReceita, Cst cstPisCofins_entrada, Cst cstPisCofins_saida) {
		super();
		this.descricao = descricao;
		this.codBarra = codBarra;
		this.codBarra2 = codBarra2;
		this.codBarra3 = codBarra3;
		this.precoEntrada = precoEntrada;
		this.precoCusto = precoCusto;
		this.mgVar = mgVar;
		this.precoVar = precoVar;
		this.mgAtac1 = mgAtac1;
		this.precoAtac1 = precoAtac1;
		this.mgAtac2 = mgAtac2;
		this.precoAtac2 = precoAtac2;
		this.ff = ff;
		this.estMin = estMin;
		this.estMax = estMax;
		this.lcm = lcm;
		this.desconto = desconto;
		this.ipi = ipi;
		this.txFin = txFin;
		this.frete = frete;
		this.abc = abc;
		this.txImport = txImport;
		this.descEstiq = descEstiq;
		this.descEmp = descEmp;
		this.inativo = inativo;
		this.formula = formula;
		this.estoque = estoque;
		this.precoAtual = precoAtual;
		this.dtAtual = dtAtual;
		this.dtAtualizado = dtAtualizado;
		this.descFab1 = descFab1;
		this.descFab2 = descFab2;
		this.qtdCaixa = qtdCaixa;
		this.precoCompraCaixa = precoCompraCaixa;
		this.precoVendaCaixa = precoVendaCaixa;
		this.comissao = comissao;
		this.precoPromo = precoPromo;
		this.precoAnt = precoAnt;
		this.precoMedioCompra = precoMedioCompra;
		this.pisConfis = pisConfis;
		this.dtAltera = dtAltera;
		this.descMax = descMax;
		this.estNeg = estNeg;
		this.ncm = ncm;
		this.redBase = redBase;
		this.txDiversas = txDiversas;
		this.valorAdc = valorAdc;
		this.moedaC = moedaC;
		this.moedaV = moedaV;
		this.moedaE = moedaE;
		this.pesoLiq = pesoLiq;
		this.pesoBruto = pesoBruto;
		this.bloqDesc = bloqDesc;
		this.vidaLink = vidaLink;
		this.descontoEmp = descontoEmp;
		this.registroMs = registroMs;
		this.servico = servico;
		this.tipoReceita = (tipoReceita==null) ? null : tipoReceita.getCodigo();
		this.precoPrazo = precoPrazo;
		this.precoUltCompra = precoUltCompra;
		this.bloqPromo = bloqPromo;
		this.estoque2 = estoque2;
		this.sal = sal;
		this.estPsico = estPsico;
		this.dataUltVenda = dataUltVenda;
		this.aliqIntSaida = aliqIntSaida;
		this.aliqNf = aliqNf;
		this.acrescimo = acrescimo;
		this.nbm = nbm;
		this.bloqDescAVista = bloqDescAVista;
		this.qtdPorEmb = qtdPorEmb;
		this.local = local;
		this.tmp1 = tmp1;
		this.indicadorTrib = indicadorTrib;
		this.ivast = ivast;
		this.aliqEntDentro = aliqEntDentro;
		this.aliqEntFora = aliqEntFora;
		this.cfopEnt = cfopEnt;
		this.naoRelac = naoRelac;
		this.classFiscal = classFiscal;
		this.indArredTrunc = indArredTrunc;
		this.indPropTerc = indPropTerc;
		this.aliqSubst = aliqSubst;
		this.dcb = dcb;
		this.usaEan = usaEan;
		this.pesoBru = pesoBru;
		this.pesoLiquido = pesoLiquido;
		this.cstPis = cstPis;
		this.cstCofins = cstCofins;
		this.csoSn = csoSn;
		this.precoCustoDolar = precoCustoDolar;
		this.cstPisEntrada = cstPisEntrada;
		this.natReceitaPisCofins = natReceitaPisCofins;
		this.milhoesEncerrante = milhoesEncerrante;
		this.aliqRedPis = aliqRedPis;
		this.aliqRedCofins = aliqRedCofins;
		this.tipoClasseTerapeutica = (tipoClasseTerapeutica==null) ? null : tipoClasseTerapeutica.getCodigo();;
		this.usoProlongado = usoProlongado;
		this.aliquota = aliquota;
		this.chavePaf = chavePaf;
		this.seqPaf = seqPaf;
		this.aliqInternaIva = aliqInternaIva;
		this.aliqInterestadualIva = aliqInterestadualIva;
		this.ivastFora = ivastFora;
		this.precoMinimo = precoMinimo;
		this.codTf2 = codTf2;
		this.codTf3 = codTf3;
		this.codCbc = codCbc;
		this.codCf = codCf;
		this.codCf2 = codCf2;
		this.codCf3 = codCf3;
		this.codLinha = codLinha;
		this.tipoItem = (tipoItem==null) ? null : tipoItem.getCodigo();;
		this.psicotropico = psicotropico;
		this.cest = cest;
		this.secao = secao;
		this.unidade = unidade;
		this.grupoPreco = grupoPreco;
		this.grupo = grupo;
		this.grupoLinhas = grupoLinhas;
		this.generoMercadoria = generoMercadoria;
		this.subGrupo = subGrupo;
		this.fabricante = fabricante;
		this.totalizadorFiscal = totalizadorFiscal;
		this.naturezaReceita = naturezaReceita;
		this.cstPisCofins_entrada = cstPisCofins_entrada;
		this.cstPisCofins_saida = cstPisCofins_saida;
	}



	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getPrecoEntrada() {
		return precoEntrada;
	}

	public void setPrecoEntrada(Float precoEntrada) {
		this.precoEntrada = precoEntrada;
	}

	public Float getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(Float precoCusto) {
		this.precoCusto = precoCusto;
	}

	public Integer getMgVar() {
		return mgVar;
	}

	public void setMgVar(Integer mgVar) {
		this.mgVar = mgVar;
	}

	public Float getPrecoVar() {
		return precoVar;
	}

	public void setPrecoVar(Float precoVar) {
		this.precoVar = precoVar;
	}

	public Integer getMgAtac1() {
		return mgAtac1;
	}

	public void setMgAtac1(Integer mgAtac1) {
		this.mgAtac1 = mgAtac1;
	}

	public Float getPrecoAtac1() {
		return precoAtac1;
	}

	public void setPrecoAtac1(Float precoAtac1) {
		this.precoAtac1 = precoAtac1;
	}

	public Integer getMgAtac2() {
		return mgAtac2;
	}

	public void setMgAtac2(Integer mgAtac2) {
		this.mgAtac2 = mgAtac2;
	}

	public Float getPrecoAtac2() {
		return precoAtac2;
	}

	public void setPrecoAtac2(Float precoAtac2) {
		this.precoAtac2 = precoAtac2;
	}

	public boolean isFf() {
		return ff;
	}

	public void setFf(boolean ff) {
		this.ff = ff;
	}

	public Integer getEstMin() {
		return estMin;
	}

	public void setEstMin(Integer estMin) {
		this.estMin = estMin;
	}

	public Integer getEstMax() {
		return estMax;
	}

	public void setEstMax(Integer estMax) {
		this.estMax = estMax;
	}

	public String getLcm() {
		return lcm;
	}

	public void setLcm(String lcm) {
		this.lcm = lcm;
	}

	public Integer getDesconto() {
		return desconto;
	}

	public void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}

	public Integer getIpi() {
		return ipi;
	}

	public void setIpi(Integer ipi) {
		this.ipi = ipi;
	}

	public Integer getTxFin() {
		return txFin;
	}

	public void setTxFin(Integer txFin) {
		this.txFin = txFin;
	}

	public Integer getFrete() {
		return frete;
	}

	public void setFrete(Integer frete) {
		this.frete = frete;
	}

	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}

	public Integer getTxImport() {
		return txImport;
	}

	public void setTxImport(Integer txImport) {
		this.txImport = txImport;
	}

	public String getDescEstiq() {
		return descEstiq;
	}

	public void setDescEstiq(String descEstiq) {
		this.descEstiq = descEstiq;
	}

	public Integer getDescEmp() {
		return descEmp;
	}

	public void setDescEmp(Integer descEmp) {
		this.descEmp = descEmp;
	}

	public boolean isInativo() {
		return inativo;
	}

	public void setInativo(boolean inativo) {
		this.inativo = inativo;
	}

	public boolean isFormula() {
		return formula;
	}

	public void setFormula(boolean formula) {
		this.formula = formula;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public Float getPrecoAtual() {
		return precoAtual;
	}

	public void setPrecoAtual(Float precoAtual) {
		this.precoAtual = precoAtual;
	}

	public Date getDtAtual() {
		return dtAtual;
	}

	public void setDtAtual(Date dtAtual) {
		this.dtAtual = dtAtual;
	}

	public Date getDtAtualizado() {
		return dtAtualizado;
	}

	public void setDtAtualizado(Date dtAtualizado) {
		this.dtAtualizado = dtAtualizado;
	}

	public Integer getDescFab1() {
		return descFab1;
	}

	public void setDescFab1(Integer descFab1) {
		this.descFab1 = descFab1;
	}

	public Integer getDescFab2() {
		return descFab2;
	}

	public void setDescFab2(Integer descFab2) {
		this.descFab2 = descFab2;
	}

	public Integer getQtdCaixa() {
		return qtdCaixa;
	}

	public void setQtdCaixa(Integer qtdCaixa) {
		this.qtdCaixa = qtdCaixa;
	}

	public Integer getPrecoCompraCaixa() {
		return precoCompraCaixa;
	}

	public void setPrecoCompraCaixa(Integer precoCompraCaixa) {
		this.precoCompraCaixa = precoCompraCaixa;
	}

	public Integer getPrecoVendaCaixa() {
		return precoVendaCaixa;
	}

	public void setPrecoVendaCaixa(Integer precoVendaCaixa) {
		this.precoVendaCaixa = precoVendaCaixa;
	}

	public Integer getComissao() {
		return comissao;
	}

	public void setComissao(Integer comissao) {
		this.comissao = comissao;
	}

	public Float getPrecoPromo() {
		return precoPromo;
	}

	public void setPrecoPromo(Float precoPromo) {
		this.precoPromo = precoPromo;
	}

	public Double getPrecoAnt() {
		return precoAnt;
	}

	public void setPrecoAnt(Double precoAnt) {
		this.precoAnt = precoAnt;
	}

	public Double getPrecoMedioCompra() {
		return precoMedioCompra;
	}

	public void setPrecoMedioCompra(Double precoMedioCompra) {
		this.precoMedioCompra = precoMedioCompra;
	}

	public boolean isPisConfis() {
		return pisConfis;
	}

	public void setPisConfis(boolean pisConfis) {
		this.pisConfis = pisConfis;
	}

	public Date getDtAltera() {
		return dtAltera;
	}

	public void setDtAltera(Date dtAltera) {
		this.dtAltera = dtAltera;
	}

	public Integer getDescMax() {
		return descMax;
	}

	public void setDescMax(Integer descMax) {
		this.descMax = descMax;
	}

	public boolean isEstNeg() {
		return estNeg;
	}

	public void setEstNeg(boolean estNeg) {
		this.estNeg = estNeg;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public Integer getRedBase() {
		return redBase;
	}

	public void setRedBase(Integer redBase) {
		this.redBase = redBase;
	}

	public Integer getTxDiversas() {
		return txDiversas;
	}

	public void setTxDiversas(Integer txDiversas) {
		this.txDiversas = txDiversas;
	}

	public Integer getValorAdc() {
		return valorAdc;
	}

	public void setValorAdc(Integer valorAdc) {
		this.valorAdc = valorAdc;
	}

	public Integer getMoedaC() {
		return moedaC;
	}

	public void setMoedaC(Integer moedaC) {
		this.moedaC = moedaC;
	}

	public Integer getMoedaV() {
		return moedaV;
	}

	public void setMoedaV(Integer moedaV) {
		this.moedaV = moedaV;
	}

	public Integer getMoedaE() {
		return moedaE;
	}

	public void setMoedaE(Integer moedaE) {
		this.moedaE = moedaE;
	}

	public Integer getPesoLiq() {
		return pesoLiq;
	}

	public void setPesoLiq(Integer pesoLiq) {
		this.pesoLiq = pesoLiq;
	}

	public Integer getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(Integer pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public boolean isBloqDesc() {
		return bloqDesc;
	}

	public void setBloqDesc(boolean bloqDesc) {
		this.bloqDesc = bloqDesc;
	}

	public boolean isVidaLink() {
		return vidaLink;
	}

	public void setVidaLink(boolean vidaLink) {
		this.vidaLink = vidaLink;
	}

	public Integer getDescontoEmp() {
		return descontoEmp;
	}

	public void setDescontoEmp(Integer descontoEmp) {
		this.descontoEmp = descontoEmp;
	}

	public String getRegistroMs() {
		return registroMs;
	}

	public void setRegistroMs(String registroMs) {
		this.registroMs = registroMs;
	}

	public boolean isServico() {
		return servico;
	}

	public void setServico(boolean servico) {
		this.servico = servico;
	}

	public TipoReceita getTipoReceita() {
		return TipoReceita.toEnum(tipoReceita);
	}

	public void setTipoReceita(TipoReceita tipoReceita) {
		this.tipoReceita = tipoReceita.getCodigo();
	}

	public Float getPrecoPrazo() {
		return precoPrazo;
	}

	public void setPrecoPrazo(Float precoPrazo) {
		this.precoPrazo = precoPrazo;
	}

	public Float getPrecoUltCompra() {
		return precoUltCompra;
	}

	public void setPrecoUltCompra(Float precoUltCompra) {
		this.precoUltCompra = precoUltCompra;
	}

	public boolean isBloqPromo() {
		return bloqPromo;
	}

	public void setBloqPromo(boolean bloqPromo) {
		this.bloqPromo = bloqPromo;
	}

	public Integer getEstoque2() {
		return estoque2;
	}

	public void setEstoque2(Integer estoque2) {
		this.estoque2 = estoque2;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public Integer getEstPsico() {
		return estPsico;
	}

	public void setEstPsico(Integer estPsico) {
		this.estPsico = estPsico;
	}

	public Date getDataUltVenda() {
		return dataUltVenda;
	}

	public void setDataUltVenda(Date dataUltVenda) {
		this.dataUltVenda = dataUltVenda;
	}

	public Integer getAliqIntSaida() {
		return aliqIntSaida;
	}

	public void setAliqIntSaida(Integer aliqIntSaida) {
		this.aliqIntSaida = aliqIntSaida;
	}

	public Integer getAliqNf() {
		return aliqNf;
	}

	public void setAliqNf(Integer aliqNf) {
		this.aliqNf = aliqNf;
	}

	public Integer getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(Integer acrescimo) {
		this.acrescimo = acrescimo;
	}

	public String getNbm() {
		return nbm;
	}

	public void setNbm(String nbm) {
		this.nbm = nbm;
	}

	public boolean isBloqDescAVista() {
		return bloqDescAVista;
	}

	public void setBloqDescAVista(boolean bloqDescAVista) {
		this.bloqDescAVista = bloqDescAVista;
	}

	public Integer getQtdPorEmb() {
		return qtdPorEmb;
	}

	public void setQtdPorEmb(Integer qtdPorEmb) {
		this.qtdPorEmb = qtdPorEmb;
	}

	public String getCodBarra() {
		return codBarra;
	}

	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTmp1() {
		return tmp1;
	}

	public void setTmp1(String tmp1) {
		this.tmp1 = tmp1;
	}

	public String getCodBarra2() {
		return codBarra2;
	}

	public void setCodBarra2(String codBarra2) {
		this.codBarra2 = codBarra2;
	}

	public String getCodBarra3() {
		return codBarra3;
	}

	public void setCodBarra3(String codBarra3) {
		this.codBarra3 = codBarra3;
	}

	public Integer getIndicadorTrib() {
		return indicadorTrib;
	}

	public void setIndicadorTrib(Integer indicadorTrib) {
		this.indicadorTrib = indicadorTrib;
	}

	public Integer getIvast() {
		return ivast;
	}

	public void setIvast(Integer ivast) {
		this.ivast = ivast;
	}

	public Integer getAliqEntDentro() {
		return aliqEntDentro;
	}

	public void setAliqEntDentro(Integer aliqEntDentro) {
		this.aliqEntDentro = aliqEntDentro;
	}

	public Integer getAliqEntFora() {
		return aliqEntFora;
	}

	public void setAliqEntFora(Integer aliqEntFora) {
		this.aliqEntFora = aliqEntFora;
	}

	public Integer getCfopEnt() {
		return cfopEnt;
	}

	public void setCfopEnt(Integer cfopEnt) {
		this.cfopEnt = cfopEnt;
	}

	public boolean isNaoRelac() {
		return naoRelac;
	}

	public void setNaoRelac(boolean naoRelac) {
		this.naoRelac = naoRelac;
	}

	public String getClassFiscal() {
		return classFiscal;
	}

	public void setClassFiscal(String classFiscal) {
		this.classFiscal = classFiscal;
	}

	public boolean isIndArredTrunc() {
		return indArredTrunc;
	}

	public void setIndArredTrunc(boolean indArredTrunc) {
		this.indArredTrunc = indArredTrunc;
	}

	public boolean isIndPropTerc() {
		return indPropTerc;
	}

	public void setIndPropTerc(boolean indPropTerc) {
		this.indPropTerc = indPropTerc;
	}

	public Integer getAliqSubst() {
		return aliqSubst;
	}

	public void setAliqSubst(Integer aliqSubst) {
		this.aliqSubst = aliqSubst;
	}

	public Integer getDcb() {
		return dcb;
	}

	public void setDcb(Integer dcb) {
		this.dcb = dcb;
	}

	public boolean isUsaEan() {
		return usaEan;
	}

	public void setUsaEan(boolean usaEan) {
		this.usaEan = usaEan;
	}

	public Integer getPesoBru() {
		return pesoBru;
	}

	public void setPesoBru(Integer pesoBru) {
		this.pesoBru = pesoBru;
	}

	public Integer getPesoLiquido() {
		return pesoLiquido;
	}

	public void setPesoLiquido(Integer pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}

	public Integer getCstPis() {
		return cstPis;
	}

	public void setCstPis(Integer cstPis) {
		this.cstPis = cstPis;
	}

	public Integer getCstCofins() {
		return cstCofins;
	}

	public void setCstCofins(Integer cstCofins) {
		this.cstCofins = cstCofins;
	}

	public Integer getCsoSn() {
		return csoSn;
	}

	public void setCsoSn(Integer csoSn) {
		this.csoSn = csoSn;
	}

	public Integer getPrecoCustoDolar() {
		return precoCustoDolar;
	}

	public void setPrecoCustoDolar(Integer precoCustoDolar) {
		this.precoCustoDolar = precoCustoDolar;
	}

	public Integer getCstPisEntrada() {
		return cstPisEntrada;
	}

	public void setCstPisEntrada(Integer cstPisEntrada) {
		this.cstPisEntrada = cstPisEntrada;
	}

	public String getNatReceitaPisCofins() {
		return natReceitaPisCofins;
	}

	public void setNatReceitaPisCofins(String natReceitaPisCofins) {
		this.natReceitaPisCofins = natReceitaPisCofins;
	}

	public Integer getMilhoesEncerrante() {
		return milhoesEncerrante;
	}

	public void setMilhoesEncerrante(Integer milhoesEncerrante) {
		this.milhoesEncerrante = milhoesEncerrante;
	}

	public Integer getAliqRedPis() {
		return aliqRedPis;
	}

	public void setAliqRedPis(Integer aliqRedPis) {
		this.aliqRedPis = aliqRedPis;
	}

	public Integer getAliqRedCofins() {
		return aliqRedCofins;
	}

	public void setAliqRedCofins(Integer aliqRedCofins) {
		this.aliqRedCofins = aliqRedCofins;
	}

	public TipoClasseTerapeutica getTipoClasseTerapeutica() {
		return TipoClasseTerapeutica.toEnum(tipoClasseTerapeutica);
	}

	public void setTipoClasseTerapeutica(TipoClasseTerapeutica tipoClasseTerapeutica) {
		this.tipoClasseTerapeutica = tipoClasseTerapeutica.getCodigo();
	}

	public boolean isUsoProlongado() {
		return usoProlongado;
	}

	public void setUsoProlongado(boolean usoProlongado) {
		this.usoProlongado = usoProlongado;
	}

	public Integer getAliquota() {
		return aliquota;
	}

	public void setAliquota(Integer aliquota) {
		this.aliquota = aliquota;
	}

	public Integer getChavePaf() {
		return chavePaf;
	}

	public void setChavePaf(Integer chavePaf) {
		this.chavePaf = chavePaf;
	}

	public Integer getSeqPaf() {
		return seqPaf;
	}

	public void setSeqPaf(Integer seqPaf) {
		this.seqPaf = seqPaf;
	}

	public Integer getAliqInternaIva() {
		return aliqInternaIva;
	}

	public void setAliqInternaIva(Integer aliqInternaIva) {
		this.aliqInternaIva = aliqInternaIva;
	}

	public Integer getAliqInterestadualIva() {
		return aliqInterestadualIva;
	}

	public void setAliqInterestadualIva(Integer aliqInterestadualIva) {
		this.aliqInterestadualIva = aliqInterestadualIva;
	}

	public Integer getIvastFora() {
		return ivastFora;
	}

	public void setIvastFora(Integer ivastFora) {
		this.ivastFora = ivastFora;
	}

	public Float getPrecoMinimo() {
		return precoMinimo;
	}

	public void setPrecoMinimo(Float precoMinimo) {
		this.precoMinimo = precoMinimo;
	}

	public Integer getCodTf2() {
		return codTf2;
	}

	public void setCodTf2(Integer codTf2) {
		this.codTf2 = codTf2;
	}

	public Integer getCodTf3() {
		return codTf3;
	}

	public void setCodTf3(Integer codTf3) {
		this.codTf3 = codTf3;
	}

	public String getCodCbc() {
		return codCbc;
	}

	public void setCodCbc(String codCbc) {
		this.codCbc = codCbc;
	}

	public Integer getCodCf() {
		return codCf;
	}

	public void setCodCf(Integer codCf) {
		this.codCf = codCf;
	}

	public String getCodCf2() {
		return codCf2;
	}

	public void setCodCf2(String codCf2) {
		this.codCf2 = codCf2;
	}

	public String getCodCf3() {
		return codCf3;
	}

	public void setCodCf3(String codCf3) {
		this.codCf3 = codCf3;
	}

	public Integer getCodLinha() {
		return codLinha;
	}

	public void setCodLinha(Integer codLinha) {
		this.codLinha = codLinha;
	}

	public Psicotropico getPsicotropico() {
		return psicotropico;
	}

	public void setPsicotropico(Psicotropico psicotropico) {
		this.psicotropico = psicotropico;
	}

	public Cest getCest() {
		return cest;
	}

	public void setCest(Cest cest) {
		this.cest = cest;
	}

	public Secao getSecao() {
		return secao;
	}

	public void setSecao(Secao secao) {
		this.secao = secao;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public GrupoPreco getGrupoPreco() {
		return grupoPreco;
	}

	public void setGrupoPreco(GrupoPreco grupoPreco) {
		this.grupoPreco = grupoPreco;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public GrupoLinhas getGrupoLinhas() {
		return grupoLinhas;
	}

	public void setGrupoLinhas(GrupoLinhas grupoLinhas) {
		this.grupoLinhas = grupoLinhas;
	}

	public GeneroMercadoria getGeneroMercadoria() {
		return generoMercadoria;
	}

	public void setGeneroMercadoria(GeneroMercadoria generoMercadoria) {
		this.generoMercadoria = generoMercadoria;
	}

	public SubGrupo getSubGrupo() {
		return subGrupo;
	}

	public void setSubGrupo(SubGrupo subGrupo) {
		this.subGrupo = subGrupo;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public TotalizadorFiscal getTotalizadorFiscal() {
		return totalizadorFiscal;
	}

	public void setTotalizadorFiscal(TotalizadorFiscal totalizadorFiscal) {
		this.totalizadorFiscal = totalizadorFiscal;
	}

	public NaturezaReceita getNaturezaReceita() {
		return naturezaReceita;
	}

	public void setNaturezaReceita(NaturezaReceita naturezaReceita) {
		this.naturezaReceita = naturezaReceita;
	}

	public TipoItem getTipoItem() {
		return TipoItem.toEnum(tipoItem);
	}

	public void setTipoItem(TipoItem tipoItem) {
		this.tipoItem = tipoItem.getCodigo();
	}

	public Cst getCstPisCofins_entrada() {
		return cstPisCofins_entrada;
	}

	public void setCstPisCofins_entrada(Cst cstPisCofins_entrada) {
		this.cstPisCofins_entrada = cstPisCofins_entrada;
	}

	public Cst getCstPisCofins_saida() {
		return cstPisCofins_saida;
	}

	public void setCstPisCofins_saida(Cst cstPisCofins_saida) {
		this.cstPisCofins_saida = cstPisCofins_saida;
	}
	
	
}
