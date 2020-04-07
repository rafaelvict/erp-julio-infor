package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

public class ProdutoNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Length(max=50, message="Tamanho deve ser de aé 50 caracteres")
	private String descricao;
	
	@Length(min=1, max=1, message="Tamanho deve ser de 1 caractere")
	private String abc;
	
	@Length(max=12, message="Tamanho deve ser entre 2 e 50 caracteres")
	private String ncm;
	
	@NotNull
	private Integer precoCompraCaixa;
	
	@NotNull
	private Integer precoVendaCaixa;
	
	@NotNull
	private Integer comissao;
	
	@NotNull
	private Double precoAnt;
	
	@NotNull
	private Double precoMedioCompra;
	
	private Integer estMin;
	
	private Integer estMax;
	
	@Length(max=15, message="Tamanho deve ser até 15 caracteres")
	private String codBarra;
	
	@Length(max=15, message="Tamanho deve ser até 15 caracteres")
	private String codBarra2;
	
	@Length(max=15, message="Tamanho deve ser até 15 caracteres")
	private String codBarra3;
	
	@NotNull
	private Float precoEntrada;
	
	@NotNull
	private Float precoCusto;
	
	@NotNull
	private Float mgVar;
	
	@NotNull
	private Float precoVar;
	
	@NotNull
	private Float mgAtac1;
	
	@NotNull
	private Float precoAtac1;
	
	@NotNull
	private Float mgAtac2;
	
	@NotNull
	private Float precoAtac2;
	
	@NotNull
	private boolean ff;
	
	private Integer lcm;
	
	@NotNull
	private Integer desconto;
	
	@NotNull
	private Integer ipi;
	
	@NotNull
	private Integer txFin;
	
	@NotNull
	private Integer frete;
	
	@NotNull
	private Integer txImport;
	
	@Length(max=40, message="Tamanho deve ser de até 40 caracteres")
	private String descEstiq;
	
	@NotNull
	private boolean descEmp;
	
	@NotNull
	private boolean inativo;
	
	@NotNull
	private boolean formula;
	
	@NotNull
	private Integer estoque;
	
	@NotNull
	private Float precoAtual;
	
	private Date dtAtual;
	
	private Date dtAtualizado;
	
	@NotNull
	private Integer descFab1;
	
	@NotNull
	private Integer descFab2;
	
	@NotNull
	private Integer qtdCaixa;
	
	@NotNull
	private Float precoPromo;
	
	@NotNull
	private boolean pisConfis;
	
	private Date dtAltera;
	
	@NotNull
	private Integer descMax;
	
	@NotNull
	private boolean estNeg;
	
	@NotNull
	private Integer redBase;
	
	@NotNull
	private Integer txDiversas;
	
	@NotNull
	private Integer valorAdc;
	
	@NotNull
	private Integer pesoLiq;
	
	@NotNull
	private Integer pesoBruto;
	
	@NotNull
	private boolean bloqDesc;
	
	@NotNull
	private boolean vidaLink;
	
	@NotNull
	private Integer descontoEmp;
	
	@Length(max=20, message="Tamanho deve ser de até 20 caracteres")
	private String registroMs;
	
	@NotNull
	private boolean servico;
	
	private Integer tipoReceita;
	
	@NotNull
	private Float precoPrazo;
	
	@NotNull
	private Float precoUltCompra;
	
	@NotNull
	private boolean bloqPromo;
	
	@NotNull
	private Integer estoque2;
	
	@Length(max=60, message="Tamanho deve ser de até 60 caracteres")
	private String sal;
	
	@NotNull
	private Integer estPsico;
	
	private Date dataUltVenda;
	
	private Integer aliqIntSaida;
	
	@NotNull
	private Integer aliqNf;
	
	@NotNull
	private Integer acrescimo;
	
	@Length(max=12, message="Tamanho deve ser de até 12 caracteres")
	private String nbm;
	
	@NotNull
	private boolean bloqDescAVista;
	
	@NotNull
	private Integer qtdPorEmb;
	
	@Length(max=15, message="Tamanho deve ser de até 15 caracteres")
	private String local;
	
	@Length(max=15, message="Tamanho deve ser de até 15 caracteres")
	private String tmp1;
	
	private Integer indicadorTrib;
	
	@NotNull
	private Integer ivast;
	
	@NotNull
	private Integer aliqEntDentro;
	
	@NotNull
	private Integer aliqEntFora;
	
	@NotNull
	private Integer cfopEnt;
	
	@NotNull
	private boolean naoRelac;
	
	@Length(max=20, message="Tamanho deve ser de até 20 caracteres")
	private String classFiscal;
	
	@NotNull
	private Integer indArredTrunc;
	
	@NotNull
	private Integer indPropTerc;
	
	@NotNull
	private Integer aliqSubst;
	
	@NotNull
	private Integer dcb;
	
	@NotNull
	private boolean usaEan;
	
	@NotNull
	private Integer pesoBru;
	
	@NotNull
	private Integer pesoLiquido;
	
	@NotNull
	private Integer cstPis;
	
	@NotNull
	private Integer cstCofins;
	
	@NotNull
	private Integer csoSn;
	
	@NotNull
	private Integer precoCustoDolar;
	
	@NotNull
	private Integer cstPisEntrada;
	
	@Length(max=3, message="Tamanho deve ser de até 3 caracteres")
	private String natReceitaPisCofins;
	
	@NotNull
	private Integer milhoesEncerrante;
	
	@NotNull
	private Integer aliqRedPis;
	
	@NotNull
	private Integer aliqRedCofins;
	
	@NotNull
	private Integer tipoClasseTerapeutica;
	
	@NotNull
	private boolean usoProlongado;
	
	@NotNull
	private Integer aliquota;
	
	@Length(max=500, message="Tamanho deve ser de até 500 caracteres")
	private String chavePaf;
	
	@NotNull
	private Integer seqPaf;
	
	@NotNull
	private Integer aliqInternaIva;
	
	@NotNull
	private Integer aliqInterestadualIva;
	
	@NotNull
	private Integer ivastFora;
	
	@NotNull
	private Float precoMinimo;
	
	@Length(max=4, message="Tamanho deve ser de até 4 caracteres")
	private String codTf2;
	
	@Length(max=4, message="Tamanho deve ser de até 4 caracteres")
	private String codTf3;
	
	@Length(max=2, message="Tamanho deve ser de até 2 caracteres")
	private String codCbc;
	
	@Length(max=4, message="Tamanho deve ser de até 4 caracteres")
	private String codCf;

	@Length(max=4, message="Tamanho deve ser de até 4 caracteres")
	private String codCf2;
	
	@Length(max=4, message="Tamanho deve ser de até 4 caracteres")
	private String codCf3;
	
	@NotNull
	private Integer tipoItem;
	
	
	//Psicotrópico
	private Long psicotropico;
	
	
	//Cest
	private Long cest;
	
	
	//Seção
	private Long secao;
	
	
	//Unidade
	private Long unidade;
	
	
	//Grupo Preço
	private Long grupoPreco;
	
	
	//Grupo
	private Long grupo;
	
	
	//Grupo Linhas
	private Long grupoLinhas;
	
	
	//Gênero Mercadoria
	private Long generoMercadoria;
	
	
	//Fabricante
	private Long fabricante;
	
	
	//Totalizador Fiscal
	private Long totalizadorFiscal;
	
	
	//Natureza Receita
	private Long naturezaReceita;
	
	
	//CST PIS/COFINS Entrada
	private Long cstPisCofinsEntrada;
	
	
	//CST PIS/COFINS Saída
	private Long cstPisCofinsSaida;
	
	
	public ProdutoNewDTO() {
		
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getAbc() {
		return abc;
	}


	public void setAbc(String abc) {
		this.abc = abc;
	}


	public String getNcm() {
		return ncm;
	}


	public void setNcm(String ncm) {
		this.ncm = ncm;
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


	public String getCodBarra() {
		return codBarra;
	}


	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
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


	public Float getMgVar() {
		return mgVar;
	}


	public void setMgVar(Float mgVar) {
		this.mgVar = mgVar;
	}


	public Float getPrecoVar() {
		return precoVar;
	}


	public void setPrecoVar(Float precoVar) {
		this.precoVar = precoVar;
	}


	public Float getMgAtac1() {
		return mgAtac1;
	}


	public void setMgAtac1(Float mgAtac1) {
		this.mgAtac1 = mgAtac1;
	}


	public Float getPrecoAtac1() {
		return precoAtac1;
	}


	public void setPrecoAtac1(Float precoAtac1) {
		this.precoAtac1 = precoAtac1;
	}


	public Float getMgAtac2() {
		return mgAtac2;
	}


	public void setMgAtac2(Float mgAtac2) {
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


	public Integer getLcm() {
		return lcm;
	}


	public void setLcm(Integer lcm) {
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


	public boolean isDescEmp() {
		return descEmp;
	}


	public void setDescEmp(boolean descEmp) {
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


	public Float getPrecoPromo() {
		return precoPromo;
	}


	public void setPrecoPromo(Float precoPromo) {
		this.precoPromo = precoPromo;
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


	public Integer getTipoReceita() {
		return tipoReceita;
	}


	public void setTipoReceita(Integer tipoReceita) {
		this.tipoReceita = tipoReceita;
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


	public Integer getIndArredTrunc() {
		return indArredTrunc;
	}


	public void setIndArredTrunc(Integer indArredTrunc) {
		this.indArredTrunc = indArredTrunc;
	}


	public Integer getIndPropTerc() {
		return indPropTerc;
	}


	public void setIndPropTerc(Integer indPropTerc) {
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


	public Integer getTipoClasseTerapeutica() {
		return tipoClasseTerapeutica;
	}


	public void setTipoClasseTerapeutica(Integer tipoClasseTerapeutica) {
		this.tipoClasseTerapeutica = tipoClasseTerapeutica;
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


	public String getChavePaf() {
		return chavePaf;
	}


	public void setChavePaf(String chavePaf) {
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


	public String getCodTf2() {
		return codTf2;
	}


	public void setCodTf2(String codTf2) {
		this.codTf2 = codTf2;
	}


	public String getCodTf3() {
		return codTf3;
	}


	public void setCodTf3(String codTf3) {
		this.codTf3 = codTf3;
	}


	public String getCodCbc() {
		return codCbc;
	}


	public void setCodCbc(String codCbc) {
		this.codCbc = codCbc;
	}


	public String getCodCf() {
		return codCf;
	}


	public void setCodCf(String codCf) {
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


	public Integer getTipoItem() {
		return tipoItem;
	}


	public void setTipoItem(Integer tipoItem) {
		this.tipoItem = tipoItem;
	}


	public Long getPsicotropico() {
		return psicotropico;
	}


	public void setPsicotropico(Long psicotropico) {
		this.psicotropico = psicotropico;
	}


	public Long getCest() {
		return cest;
	}


	public void setCest(Long cest) {
		this.cest = cest;
	}


	public Long getSecao() {
		return secao;
	}


	public void setSecao(Long secao) {
		this.secao = secao;
	}


	public Long getUnidade() {
		return unidade;
	}


	public void setUnidade(Long unidade) {
		this.unidade = unidade;
	}


	public Long getGrupoPreco() {
		return grupoPreco;
	}


	public void setGrupoPreco(Long grupoPreco) {
		this.grupoPreco = grupoPreco;
	}


	public Long getGrupo() {
		return grupo;
	}


	public void setGrupo(Long grupo) {
		this.grupo = grupo;
	}


	public Long getGrupoLinhas() {
		return grupoLinhas;
	}


	public void setGrupoLinhas(Long grupoLinhas) {
		this.grupoLinhas = grupoLinhas;
	}


	public Long getGeneroMercadoria() {
		return generoMercadoria;
	}


	public void setGeneroMercadoria(Long generoMercadoria) {
		this.generoMercadoria = generoMercadoria;
	}


	public Long getFabricante() {
		return fabricante;
	}


	public void setFabricante(Long fabricante) {
		this.fabricante = fabricante;
	}


	public Long getTotalizadorFiscal() {
		return totalizadorFiscal;
	}


	public void setTotalizadorFiscal(Long totalizadorFiscal) {
		this.totalizadorFiscal = totalizadorFiscal;
	}


	public Long getNaturezaReceita() {
		return naturezaReceita;
	}


	public void setNaturezaReceita(Long naturezaReceita) {
		this.naturezaReceita = naturezaReceita;
	}


	public Long getCstPisCofinsEntrada() {
		return cstPisCofinsEntrada;
	}


	public void setCstPisCofinsEntrada(Long cstPisCofinsEntrada) {
		this.cstPisCofinsEntrada = cstPisCofinsEntrada;
	}


	public Long getCstPisCofinsSaida() {
		return cstPisCofinsSaida;
	}


	public void setCstPisCofinsSaida(Long cstPisCofinsSaida) {
		this.cstPisCofinsSaida = cstPisCofinsSaida;
	}
	
	
	
}
