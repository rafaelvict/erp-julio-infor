package com.erp.adm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.erp.adm.enums.TipoPreco;
import com.erp.adm.enums.TipoVencto;
import com.erp.adm.enums.TipoVenda;

@Entity
public class Empresa extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cnpjRaiz;
	private String cnpjOrdem;
	private String insc_Estadual;
	private String insc_Municipal;
	private String email;
	private Integer vias;
	private Integer vias_Boleto;
	private Integer dias_Juros;
	private Float multa;
	private Float mora;
	private Integer ini_Mes;
	private Integer fim_Mes;
	private Boolean bolBancario;
	private Double valor_IsencaoBoleto;
	private Double valor_AdcBoleto;
	private Float desconto_Funcionario;
	private Float desconto_Empresa;
	private Float acrescimo;
	private Integer tipo_Venda;
	private Integer tipo_Preco;
	private Boolean delivery;
	private Integer dias_DescFab;
	private String codigo_Ibge;
	private Boolean creadiario;
	private Boolean pergNota;
	private Boolean descMaxGrupo;
	private Boolean pergPontoVenda;
	private Boolean usarProcPromo;
	private Boolean usarDescVista;
	private Boolean permDesc;
	private Boolean pedirTransp;
	private Boolean farmaciaPopular;
	private Boolean controleVencto;
	private String msgBoleto1;
	private String msgBoleto2;
	private Integer mesReceb;
	private String mascara;
	private Boolean cupomFisc;
	private Boolean emitirBoletoBanc;
	private Integer vias_Pagto;
	private Boolean log;
	private Date dataAltera;
	private Boolean impCv;
	private Integer tipo_Vencto;
	private Boolean ignorarSaldo;
	private String msg_Venda;
	private Boolean manterDescEmp;
	private Boolean semComissao;
	private Boolean numAutoriz;
	private Boolean ignorarPrecoPrazo;
	private Float percent_Vista;
	private Float percent_CartaFrete;
	private Integer pontos_PorReal;
	
	@OneToMany(mappedBy = "empresa", cascade=CascadeType.ALL)
	private List<Endereco> enderecos = new ArrayList<>();
	
	@OneToMany(mappedBy = "empresa", cascade=CascadeType.ALL)
	private List<Funcionario> funcionarios = new ArrayList<>();
	
	@OneToMany(mappedBy = "empresa", cascade=CascadeType.ALL)
	private List<Telefone> telefones = new ArrayList<>();
	
	@OneToMany(mappedBy = "empresa", cascade=CascadeType.ALL)
	private List<ProprietarioSocio> proprietariosSocios = new ArrayList<>();
	
	@OneToMany(mappedBy = "empresa")
	private List<RamoAtividade> ramoAtividades = new ArrayList<>();
	
	
	public Empresa() {
		
	}

	public Empresa(String nome, String cnpjRaiz, String cnpjOrdem, String insc_Estadual,
			String insc_Municipal, String email, Integer vias, Integer vias_Boleto, Integer dias_Juros, Float multa,
			Float mora, Integer ini_Mes, Integer fim_Mes, Boolean bolBancario, Double valor_IsencaoBoleto,
			Double valor_AdcBoleto, Float desconto_Funcionario, Float desconto_Empresa, Float acrescimo,
			TipoVenda tipo_Venda, TipoPreco tipo_Preco, Boolean delivery, Integer dias_DescFab, String codigo_Ibge,
			Boolean creadiario, Boolean pergNota, Boolean descMaxGrupo, Boolean pergPontoVenda, Boolean usarProcPromo,
			Boolean usarDescVista, Boolean permDesc, Boolean pedirTransp, Boolean farmaciaPopular,
			Boolean controleVencto, String msgBoleto1, String msgBoleto2, Integer mesReceb, String mascara,
			Boolean cupomFisc, Boolean emitirBoletoBanc, Integer vias_Pagto, Boolean log, Date dataAltera,
			Boolean impCv, TipoVencto tipo_Vencto, Boolean ignorarSaldo, String msg_Venda, Boolean manterDescEmp,
			Boolean semComissao, Boolean numAutoriz, Boolean ignorarPrecoPrazo, Float percent_Vista,
			Float percent_CartaFrete, Integer pontos_PorReal) {
		super();
		this.nome = nome;
		this.cnpjRaiz = cnpjRaiz;
		this.cnpjOrdem = cnpjOrdem;
		this.insc_Estadual = insc_Estadual;
		this.insc_Municipal = insc_Municipal;
		this.email = email;
		this.vias = vias;
		this.vias_Boleto = vias_Boleto;
		this.dias_Juros = dias_Juros;
		this.multa = multa;
		this.mora = mora;
		this.ini_Mes = ini_Mes;
		this.fim_Mes = fim_Mes;
		this.bolBancario = bolBancario;
		this.valor_IsencaoBoleto = valor_IsencaoBoleto;
		this.valor_AdcBoleto = valor_AdcBoleto;
		this.desconto_Funcionario = desconto_Funcionario;
		this.desconto_Empresa = desconto_Empresa;
		this.acrescimo = acrescimo;
		this.tipo_Venda = (tipo_Venda==null) ? null : tipo_Venda.getCodigo();
		this.tipo_Preco = (tipo_Preco==null) ? null : tipo_Preco.getCodigo();
		this.delivery = delivery;
		this.dias_DescFab = dias_DescFab;
		this.codigo_Ibge = codigo_Ibge;
		this.creadiario = creadiario;
		this.pergNota = pergNota;
		this.descMaxGrupo = descMaxGrupo;
		this.pergPontoVenda = pergPontoVenda;
		this.usarProcPromo = usarProcPromo;
		this.usarDescVista = usarDescVista;
		this.permDesc = permDesc;
		this.pedirTransp = pedirTransp;
		this.farmaciaPopular = farmaciaPopular;
		this.controleVencto = controleVencto;
		this.msgBoleto1 = msgBoleto1;
		this.msgBoleto2 = msgBoleto2;
		this.mesReceb = mesReceb;
		this.mascara = mascara;
		this.cupomFisc = cupomFisc;
		this.emitirBoletoBanc = emitirBoletoBanc;
		this.vias_Pagto = vias_Pagto;
		this.log = log;
		this.dataAltera = dataAltera;
		this.impCv = impCv;
		this.tipo_Vencto = (tipo_Vencto==null) ? null : tipo_Vencto.getCodigo();
		this.ignorarSaldo = ignorarSaldo;
		this.msg_Venda = msg_Venda;
		this.manterDescEmp = manterDescEmp;
		this.semComissao = semComissao;
		this.numAutoriz = numAutoriz;
		this.ignorarPrecoPrazo = ignorarPrecoPrazo;
		this.percent_Vista = percent_Vista;
		this.percent_CartaFrete = percent_CartaFrete;
		this.pontos_PorReal = pontos_PorReal;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpjRaiz() {
		return cnpjRaiz;
	}

	public void setCnpjRaiz(String cnpjRaiz) {
		this.cnpjRaiz = cnpjRaiz;
	}

	public String getCnpjOrdem() {
		return cnpjOrdem;
	}

	public void setCnpjOrdem(String cnpjOrdem) {
		this.cnpjOrdem = cnpjOrdem;
	}

	public String getInsc_Estadual() {
		return insc_Estadual;
	}

	public void setInsc_Estadual(String insc_Estadual) {
		this.insc_Estadual = insc_Estadual;
	}

	public String getInsc_Municipal() {
		return insc_Municipal;
	}

	public void setInsc_Municipal(String insc_Municipal) {
		this.insc_Municipal = insc_Municipal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getVias() {
		return vias;
	}

	public void setVias(Integer vias) {
		this.vias = vias;
	}

	public Integer getVias_Boleto() {
		return vias_Boleto;
	}

	public void setVias_Boleto(Integer vias_Boleto) {
		this.vias_Boleto = vias_Boleto;
	}

	public Integer getDias_Juros() {
		return dias_Juros;
	}

	public void setDias_Juros(Integer dias_Juros) {
		this.dias_Juros = dias_Juros;
	}

	public Float getMulta() {
		return multa;
	}
	
	public void setMulta(Float multa) {
		this.multa = multa;
	}

	public Float getMora() {
		return mora;
	}

	public void setMora(Float mora) {
		this.mora = mora;
	}

	public Integer getIni_Mes() {
		return ini_Mes;
	}

	public void setIni_Mes(Integer ini_Mes) {
		this.ini_Mes = ini_Mes;
	}

	public Integer getFim_Mes() {
		return fim_Mes;
	}

	public void setFim_Mes(Integer fim_Mes) {
		this.fim_Mes = fim_Mes;
	}

	public Boolean isBolBancario() {
		return bolBancario;
	}

	public void setBolBancario(Boolean bolBancario) {
		this.bolBancario = bolBancario;
	}

	public Double getValor_IsencaoBoleto() {
		return valor_IsencaoBoleto;
	}

	public void setValor_IsencaoBoleto(Double valor_IsencaoBoleto) {
		this.valor_IsencaoBoleto = valor_IsencaoBoleto;
	}

	public Double getValor_AdcBoleto() {
		return valor_AdcBoleto;
	}

	public void setValor_AdcBoleto(Double valor_AdcBoleto) {
		this.valor_AdcBoleto = valor_AdcBoleto;
	}

	public Float getDesconto_Empresa() {
		return desconto_Empresa;
	}
	
	public void setDesconto_Empresa(Float desconto_Empresa) {
		this.desconto_Empresa = desconto_Empresa;
	}
	
	public Float getDesconto_Funcionario() {
		return desconto_Funcionario;
	}
	
	public void setDesconto_Funcionario(Float desconto_Funcionario) {
		this.desconto_Funcionario = desconto_Funcionario;
	}

	public Float getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(Float acrescimo) {
		this.acrescimo = acrescimo;
	}

	public TipoVenda getTipo_Venda() {
		return TipoVenda.toEnum(tipo_Venda);
	}
	
	public void setTipo_Venda(TipoVenda tipo_Venda) {
		this.tipo_Venda = tipo_Venda.getCodigo();
	}

	public TipoPreco getTipo_Preco() {
		return TipoPreco.toEnum(tipo_Preco);
	}

	public void setTipo_Preco(TipoPreco tipo_Preco) {
		this.tipo_Preco = tipo_Preco.getCodigo();
	}

	public Boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(Boolean delivery) {
		this.delivery = delivery;
	}

	public Integer getDias_DescFab() {
		return dias_DescFab;
	}

	public void setDias_DescFab(Integer dias_DescFab) {
		this.dias_DescFab = dias_DescFab;
	}

	public String getCodigo_Ibge() {
		return codigo_Ibge;
	}

	public void setCodigo_Ibge(String codigo_Ibge) {
		this.codigo_Ibge = codigo_Ibge;
	}

	public Boolean isCreadiario() {
		return creadiario;
	}

	public void setCreadiario(Boolean creadiario) {
		this.creadiario = creadiario;
	}

	public Boolean isPergNota() {
		return pergNota;
	}

	public void setPergNota(Boolean pergNota) {
		this.pergNota = pergNota;
	}

	public Boolean isDescMaxGrupo() {
		return descMaxGrupo;
	}

	public void setDescMaxGrupo(Boolean descMaxGrupo) {
		this.descMaxGrupo = descMaxGrupo;
	}

	public Boolean isPergPontoVenda() {
		return pergPontoVenda;
	}

	public void setPergPontoVenda(Boolean pergPontoVenda) {
		this.pergPontoVenda = pergPontoVenda;
	}

	public Boolean isUsarProcPromo() {
		return usarProcPromo;
	}

	public void setUsarProcPromo(Boolean usarProcPromo) {
		this.usarProcPromo = usarProcPromo;
	}

	public Boolean isUsarDescVista() {
		return usarDescVista;
	}

	public void setUsarDescVista(Boolean usarDescVista) {
		this.usarDescVista = usarDescVista;
	}

	public Boolean isPermDesc() {
		return permDesc;
	}

	public void setPermDesc(Boolean permDesc) {
		this.permDesc = permDesc;
	}

	public Boolean isPedirTransp() {
		return pedirTransp;
	}

	public void setPedirTransp(Boolean pedirTransp) {
		this.pedirTransp = pedirTransp;
	}
	
	public Boolean isFarmaciaPopular() {
		return farmaciaPopular;
	}

	public void setFarmaciaPopular(Boolean farmaciaPopular) {
		this.farmaciaPopular = farmaciaPopular;
	}
	
	public Boolean isControleVencto() {
		return controleVencto;
	}

	public void setControleVencto(Boolean controleVencto) {
		this.controleVencto = controleVencto;
	}

	public String getMsgBoleto1() {
		return msgBoleto1;
	}

	public void setMsgBoleto1(String msgBoleto1) {
		this.msgBoleto1 = msgBoleto1;
	}

	public String getMsgBoleto2() {
		return msgBoleto2;
	}

	public void setMsgBoleto2(String msgBoleto2) {
		this.msgBoleto2 = msgBoleto2;
	}

	public Integer getMesReceb() {
		return mesReceb;
	}

	public void setMesReceb(Integer mesReceb) {
		this.mesReceb = mesReceb;
	}

	public String getMascara() {
		return mascara;
	}

	public void setMascara(String mascara) {
		this.mascara = mascara;
	}

	public Boolean isCupomFisc() {
		return cupomFisc;
	}

	public void setCupomFisc(Boolean cupomFisc) {
		this.cupomFisc = cupomFisc;
	}

	public Boolean isEmitirBoletoBanc() {
		return emitirBoletoBanc;
	}

	public void setEmitirBoletoBanc(Boolean emitirBoletoBanc) {
		this.emitirBoletoBanc = emitirBoletoBanc;
	}

	public Integer getVias_Pagto() {
		return vias_Pagto;
	}

	public void setVias_Pagto(Integer vias_Pagto) {
		this.vias_Pagto = vias_Pagto;
	}

	public Boolean isLog() {
		return log;
	}

	public void setLog(Boolean log) {
		this.log = log;
	}

	public Date getDataAltera() {
		return dataAltera;
	}

	public void setDataAltera(Date dataAltera) {
		this.dataAltera = dataAltera;
	}

	public Boolean isImpCv() {
		return impCv;
	}

	public void setImpCv(Boolean impCv) {
		this.impCv = impCv;
	}

	public TipoVencto getTipo_Vencto() {
		return TipoVencto.toEnum(tipo_Vencto);
	}
	
	public void setTipo_Vencto(TipoVencto tipo_Vencto) {
		this.tipo_Vencto = tipo_Vencto.getCodigo();
	}

	public Boolean isIgnorarSaldo() {
		return ignorarSaldo;
	}

	public void setIgnorarSaldo(Boolean ignorarSaldo) {
		this.ignorarSaldo = ignorarSaldo;
	}

	public String getMsg_Venda() {
		return msg_Venda;
	}

	public void setMsg_Venda(String msg_Venda) {
		this.msg_Venda = msg_Venda;
	}

	public Boolean isManterDescEmp() {
		return manterDescEmp;
	}

	public void setManterDescEmp(Boolean manterDescEmp) {
		this.manterDescEmp = manterDescEmp;
	}

	public Boolean isSemComissao() {
		return semComissao;
	}

	public void setSemComissao(Boolean semComissao) {
		this.semComissao = semComissao;
	}

	public Boolean isNumAutoriz() {
		return numAutoriz;
	}

	public void setNumAutoriz(Boolean numAutoriz) {
		this.numAutoriz = numAutoriz;
	}

	public Boolean isIgnorarPrecoPrazo() {
		return ignorarPrecoPrazo;
	}

	public void setIgnorarPrecoPrazo(Boolean ignorarPrecoPrazo) {
		this.ignorarPrecoPrazo = ignorarPrecoPrazo;
	}

	public Float getPercent_CartaFrete() {
		return percent_CartaFrete;
	}
	
	public void setPercent_CartaFrete(Float percent_CartaFrete) {
		this.percent_CartaFrete = percent_CartaFrete;
	}
	
	public Float getPercent_Vista() {
		return percent_Vista;
	}
	
	public void setPercent_Vista(Float percent_Vista) {
		this.percent_Vista = percent_Vista;
	}

	public Integer getPontos_PorReal() {
		return pontos_PorReal;
	}

	public void setPontos_PorReal(Integer pontos_PorReal) {
		this.pontos_PorReal = pontos_PorReal;
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<ProprietarioSocio> getProprietariosSocios() {
		return proprietariosSocios;
	}
	
	public void setProprietariosSocios(List<ProprietarioSocio> proprietariosSocios) {
		this.proprietariosSocios = proprietariosSocios;
	}
	
	public List<RamoAtividade> getRamoAtividades() {
		return ramoAtividades;
	}
	
	public void setRamoAtividades(List<RamoAtividade> ramoAtividades) {
		this.ramoAtividades = ramoAtividades;
	}
}
