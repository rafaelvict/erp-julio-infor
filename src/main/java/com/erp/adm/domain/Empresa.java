package com.erp.adm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.erp.adm.enums.TipoPreco;
import com.erp.adm.enums.TipoVencto;
import com.erp.adm.enums.TipoVenda;

@Entity
public class Empresa extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 50, nullable = false)
	private String cnpjRaiz;
	
	@Column(length = 50, nullable = false)
	private String cnpjOrdem;
	
	@Column(nullable = false)
	private char tipo;

	@Column(length = 30, nullable = false)
	private Integer insc_Estadual;
	
	@Column(length = 30, nullable = false)
	private Integer insc_Municipal;
	
	@Column(length = 50, nullable = false)
	private String email;
	
	@Column(nullable = false)
	private Integer vias;
	
	@Column(nullable = false)
	private Integer vias_Boleto;
	
	@Column(nullable = false)
	private Integer dias_Juros;
	
	@Column(nullable = false)
	private Float multa;
	
	@Column(nullable = false)
	private Integer mora;
	
	@Column(nullable = false)
	private Integer ini_Mes;
	
	@Column(nullable = false)
	private Integer fim_Mes;
	
	@Column(nullable = false)
	private boolean bolBancario;
	
	@Column(length = 20, nullable = false)
	private Double valor_IsencaoBoleto;
	
	@Column(length = 20, nullable = false)
	private Double valor_AdcBoleto;
	
	@Column(length = 20, nullable = false)
	private Float desconto_Funcionario;
	
	@Column(length = 20, nullable = false)
	private Float desconto_Empresa;
	
	@Column(length = 30, nullable = false)
	private Double acrescimo;
	
	@Column(nullable = false)
	private Integer tipo_Venda;
	
	@Column(nullable = false)
	private Integer tipo_Preco;
	
	@Column(nullable = false)
	private boolean delivery;
	
	@Column(nullable = false)
	private Integer dias_DescFab;
	
	@Column(length = 50, nullable = false)
	private Integer codigo_Ibge;
	
	@Column(nullable = false)
	private boolean creadiario;
	
	@Column(nullable = false)
	private boolean pergNota;
	
	@Column(nullable = false)
	private boolean descMaxGrupo;
	
	@Column(nullable = false)
	private boolean pergPontoVenda;
	
	@Column(nullable = false)
	private boolean usarProcPromo;
	
	@Column(nullable = false)
	private boolean usarDescVista;
	
	@Column(nullable = false)
	private boolean permDesc;
	
	@Column(nullable = false)
	private boolean pedirTransp;
	
	@Column(nullable = false)
	private boolean farmaciaPopular;
	
	@Column(nullable = false)
	private boolean controleVencto;
	
	@Column(length = 100, nullable = true)
	private String msgBoleto1;
	
	@Column(length = 100, nullable = true)
	private String msgBoleto2;
	
	@Column(nullable = false)
	private Integer mesReceb;
	
	@Column(length = 20, nullable = false)
	private String mascara;
	
	@Column(nullable = false)
	private boolean cupomFisc;
	
	@Column(nullable = false)
	private boolean emitirBoletoBanc;
	
	@Column(nullable = false)
	private Integer vias_Pagto;
	
	@Column(nullable = false)
	private boolean log;
	
	@Column(nullable = false)
	private Date dataAltera;
	
	@Column(nullable = false)
	private boolean impCv;
	
	@Column(nullable = false)
	private Integer tipo_Vencto;
	
	@Column(nullable = false)
	private boolean ignorarSaldo;
	
	@Column(length = 300, nullable = false)
	private String msg_Venda;
	
	@Column(nullable = false)
	private boolean manterDescEmp;
	
	@Column(nullable = false)
	private boolean semComissao;
	
	@Column(nullable = false)
	private boolean numAutoriz;
	
	@Column(nullable = false)
	private boolean ignorarPrecoPrazo;
	
	@Column(nullable = false)
	private Float percent_Vista;
	
	@Column(nullable = false)
	private Float percent_CartaFrete;
	
	@Column(nullable = false)
	private Integer pontos_PorReal;
	
	@OneToMany(mappedBy = "empresa")
	private List<Endereco> enderecos = new ArrayList<>();
	
	@OneToMany(mappedBy = "empresa")
	private List<Funcionario> funcionarios = new ArrayList<>();
	
	@OneToMany(mappedBy = "empresa")
	private List<Telefone> telefones = new ArrayList<>();
	
	public Empresa() {
		
	}

	public Empresa(String nome, String cnpjRaiz, String cnpjOrdem, char tipo, Integer insc_Estadual,
			Integer insc_Municipal, String email, Integer vias, Integer vias_Boleto, Integer dias_Juros, Float multa,
			Integer mora, Integer ini_Mes, Integer fim_Mes, boolean bolBancario, Double valor_IsencaoBoleto,
			Double valor_AdcBoleto, Float desconto_Funcionario, Float desconto_Empresa, Double acrescimo,
			TipoVenda tipo_Venda, TipoPreco tipo_Preco, boolean delivery, Integer dias_DescFab, Integer codigo_Ibge,
			boolean creadiario, boolean pergNota, boolean descMaxGrupo, boolean pergPontoVenda, boolean usarProcPromo,
			boolean usarDescVista, boolean permDesc, boolean pedirTransp, boolean farmaciaPopular,
			boolean controleVencto, String msgBoleto1, String msgBoleto2, Integer mesReceb, String mascara,
			boolean cupomFisc, boolean emitirBoletoBanc, Integer vias_Pagto, boolean log, Date dataAltera,
			boolean impCv, TipoVencto tipo_Vencto, boolean ignorarSaldo, String msg_Venda, boolean manterDescEmp,
			boolean semComissao, boolean numAutoriz, boolean ignorarPrecoPrazo, Float percent_Vista,
			Float percent_CartaFrete, Integer pontos_PorReal) {
		super();
		this.nome = nome;
		this.cnpjRaiz = cnpjRaiz;
		this.cnpjOrdem = cnpjOrdem;
		this.tipo = tipo;
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
		this.tipo_Venda = tipo_Venda.getCodigo();
		this.tipo_Preco = tipo_Preco.getCodigo();
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
		this.tipo_Vencto = tipo_Vencto.getCodigo();
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

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public Integer getInsc_Estadual() {
		return insc_Estadual;
	}

	public void setInsc_Estadual(Integer insc_Estadual) {
		this.insc_Estadual = insc_Estadual;
	}

	public Integer getInsc_Municipal() {
		return insc_Municipal;
	}

	public void setInsc_Municipal(Integer insc_Municipal) {
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

	public Integer getMora() {
		return mora;
	}

	public void setMora(Integer mora) {
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

	public boolean isBolBancario() {
		return bolBancario;
	}

	public void setBolBancario(boolean bolBancario) {
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

	public Double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(Double acrescimo) {
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

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

	public Integer getDias_DescFab() {
		return dias_DescFab;
	}

	public void setDias_DescFab(Integer dias_DescFab) {
		this.dias_DescFab = dias_DescFab;
	}

	public Integer getCodigo_Ibge() {
		return codigo_Ibge;
	}

	public void setCodigo_Ibge(Integer codigo_Ibge) {
		this.codigo_Ibge = codigo_Ibge;
	}

	public boolean isCreadiario() {
		return creadiario;
	}

	public void setCreadiario(boolean creadiario) {
		this.creadiario = creadiario;
	}

	public boolean isPergNota() {
		return pergNota;
	}

	public void setPergNota(boolean pergNota) {
		this.pergNota = pergNota;
	}

	public boolean isDescMaxGrupo() {
		return descMaxGrupo;
	}

	public void setDescMaxGrupo(boolean descMaxGrupo) {
		this.descMaxGrupo = descMaxGrupo;
	}

	public boolean isPergPontoVenda() {
		return pergPontoVenda;
	}

	public void setPergPontoVenda(boolean pergPontoVenda) {
		this.pergPontoVenda = pergPontoVenda;
	}

	public boolean isUsarProcPromo() {
		return usarProcPromo;
	}

	public void setUsarProcPromo(boolean usarProcPromo) {
		this.usarProcPromo = usarProcPromo;
	}

	public boolean isUsarDescVista() {
		return usarDescVista;
	}

	public void setUsarDescVista(boolean usarDescVista) {
		this.usarDescVista = usarDescVista;
	}

	public boolean isPermDesc() {
		return permDesc;
	}

	public void setPermDesc(boolean permDesc) {
		this.permDesc = permDesc;
	}

	public boolean isPedirTransp() {
		return pedirTransp;
	}

	public void setPedirTransp(boolean pedirTransp) {
		this.pedirTransp = pedirTransp;
	}
	
	public boolean isFarmaciaPopular() {
		return farmaciaPopular;
	}

	public void setFarmaciaPopular(boolean farmaciaPopular) {
		this.farmaciaPopular = farmaciaPopular;
	}
	
	public boolean isControleVencto() {
		return controleVencto;
	}

	public void setControleVencto(boolean controleVencto) {
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

	public boolean isCupomFisc() {
		return cupomFisc;
	}

	public void setCupomFisc(boolean cupomFisc) {
		this.cupomFisc = cupomFisc;
	}

	public boolean isEmitirBoletoBanc() {
		return emitirBoletoBanc;
	}

	public void setEmitirBoletoBanc(boolean emitirBoletoBanc) {
		this.emitirBoletoBanc = emitirBoletoBanc;
	}

	public Integer getVias_Pagto() {
		return vias_Pagto;
	}

	public void setVias_Pagto(Integer vias_Pagto) {
		this.vias_Pagto = vias_Pagto;
	}

	public boolean isLog() {
		return log;
	}

	public void setLog(boolean log) {
		this.log = log;
	}

	public Date getDataAltera() {
		return dataAltera;
	}

	public void setDataAltera(Date dataAltera) {
		this.dataAltera = dataAltera;
	}

	public boolean isImpCv() {
		return impCv;
	}

	public void setImpCv(boolean impCv) {
		this.impCv = impCv;
	}

	public TipoVencto getTipo_Vencto() {
		return TipoVencto.toEnum(tipo_Vencto);
	}
	
	public void setTipo_Vencto(TipoVencto tipo_Vencto) {
		this.tipo_Vencto = tipo_Vencto.getCodigo();
	}

	public boolean isIgnorarSaldo() {
		return ignorarSaldo;
	}

	public void setIgnorarSaldo(boolean ignorarSaldo) {
		this.ignorarSaldo = ignorarSaldo;
	}

	public String getMsg_Venda() {
		return msg_Venda;
	}

	public void setMsg_Venda(String msg_Venda) {
		this.msg_Venda = msg_Venda;
	}

	public boolean isManterDescEmp() {
		return manterDescEmp;
	}

	public void setManterDescEmp(boolean manterDescEmp) {
		this.manterDescEmp = manterDescEmp;
	}

	public boolean isSemComissao() {
		return semComissao;
	}

	public void setSemComissao(boolean semComissao) {
		this.semComissao = semComissao;
	}

	public boolean isNumAutoriz() {
		return numAutoriz;
	}

	public void setNumAutoriz(boolean numAutoriz) {
		this.numAutoriz = numAutoriz;
	}

	public boolean isIgnorarPrecoPrazo() {
		return ignorarPrecoPrazo;
	}

	public void setIgnorarPrecoPrazo(boolean ignorarPrecoPrazo) {
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

	
}
