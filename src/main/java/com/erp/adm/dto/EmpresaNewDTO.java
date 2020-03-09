package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

public class EmpresaNewDTO implements Serializable {
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
	
	//Endereco
	private String rua;
	private Integer numero;
	private String bairro;
	private String complemento;
	private String cep;
	private Integer tipo_End;
	
	private Long cidadeId;
	
	//Telefone
	private Integer ddd;
	private String telefone;
	private Integer tipo;
	private Date data_altera;
	
	//Ramo Atividade
	private String descricao;
	
	public EmpresaNewDTO() {
		
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

	public Boolean getBolBancario() {
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

	public Float getDesconto_Funcionario() {
		return desconto_Funcionario;
	}

	public void setDesconto_Funcionario(Float desconto_Funcionario) {
		this.desconto_Funcionario = desconto_Funcionario;
	}

	public Float getDesconto_Empresa() {
		return desconto_Empresa;
	}

	public void setDesconto_Empresa(Float desconto_Empresa) {
		this.desconto_Empresa = desconto_Empresa;
	}

	public Float getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(Float acrescimo) {
		this.acrescimo = acrescimo;
	}

	public Integer getTipo_Venda() {
		return tipo_Venda;
	}

	public void setTipo_Venda(Integer tipo_Venda) {
		this.tipo_Venda = tipo_Venda;
	}

	public Integer getTipo_Preco() {
		return tipo_Preco;
	}

	public void setTipo_Preco(Integer tipo_Preco) {
		this.tipo_Preco = tipo_Preco;
	}

	public Boolean getDelivery() {
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

	public Boolean getCreadiario() {
		return creadiario;
	}

	public void setCreadiario(Boolean creadiario) {
		this.creadiario = creadiario;
	}

	public Boolean getPergNota() {
		return pergNota;
	}

	public void setPergNota(Boolean pergNota) {
		this.pergNota = pergNota;
	}

	public Boolean getDescMaxGrupo() {
		return descMaxGrupo;
	}

	public void setDescMaxGrupo(Boolean descMaxGrupo) {
		this.descMaxGrupo = descMaxGrupo;
	}

	public Boolean getPergPontoVenda() {
		return pergPontoVenda;
	}

	public void setPergPontoVenda(Boolean pergPontoVenda) {
		this.pergPontoVenda = pergPontoVenda;
	}

	public Boolean getUsarProcPromo() {
		return usarProcPromo;
	}

	public void setUsarProcPromo(Boolean usarProcPromo) {
		this.usarProcPromo = usarProcPromo;
	}

	public Boolean getUsarDescVista() {
		return usarDescVista;
	}

	public void setUsarDescVista(Boolean usarDescVista) {
		this.usarDescVista = usarDescVista;
	}

	public Boolean getPermDesc() {
		return permDesc;
	}

	public void setPermDesc(Boolean permDesc) {
		this.permDesc = permDesc;
	}

	public Boolean getPedirTransp() {
		return pedirTransp;
	}

	public void setPedirTransp(Boolean pedirTransp) {
		this.pedirTransp = pedirTransp;
	}

	public Boolean getFarmaciaPopular() {
		return farmaciaPopular;
	}

	public void setFarmaciaPopular(Boolean farmaciaPopular) {
		this.farmaciaPopular = farmaciaPopular;
	}

	public Boolean getControleVencto() {
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

	public Boolean getCupomFisc() {
		return cupomFisc;
	}

	public void setCupomFisc(Boolean cupomFisc) {
		this.cupomFisc = cupomFisc;
	}

	public Boolean getEmitirBoletoBanc() {
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

	public Boolean getLog() {
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

	public Boolean getImpCv() {
		return impCv;
	}

	public void setImpCv(Boolean impCv) {
		this.impCv = impCv;
	}

	public Integer getTipo_Vencto() {
		return tipo_Vencto;
	}

	public void setTipo_Vencto(Integer tipo_Vencto) {
		this.tipo_Vencto = tipo_Vencto;
	}

	public Boolean getIgnorarSaldo() {
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

	public Boolean getManterDescEmp() {
		return manterDescEmp;
	}

	public void setManterDescEmp(Boolean manterDescEmp) {
		this.manterDescEmp = manterDescEmp;
	}

	public Boolean getSemComissao() {
		return semComissao;
	}

	public void setSemComissao(Boolean semComissao) {
		this.semComissao = semComissao;
	}

	public Boolean getNumAutoriz() {
		return numAutoriz;
	}

	public void setNumAutoriz(Boolean numAutoriz) {
		this.numAutoriz = numAutoriz;
	}

	public Boolean getIgnorarPrecoPrazo() {
		return ignorarPrecoPrazo;
	}

	public void setIgnorarPrecoPrazo(Boolean ignorarPrecoPrazo) {
		this.ignorarPrecoPrazo = ignorarPrecoPrazo;
	}

	public Float getPercent_Vista() {
		return percent_Vista;
	}

	public void setPercent_Vista(Float percent_Vista) {
		this.percent_Vista = percent_Vista;
	}

	public Float getPercent_CartaFrete() {
		return percent_CartaFrete;
	}

	public void setPercent_CartaFrete(Float percent_CartaFrete) {
		this.percent_CartaFrete = percent_CartaFrete;
	}

	public Integer getPontos_PorReal() {
		return pontos_PorReal;
	}

	public void setPontos_PorReal(Integer pontos_PorReal) {
		this.pontos_PorReal = pontos_PorReal;
	}


	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getTipo_End() {
		return tipo_End;
	}

	public void setTipo_End(Integer tipo_End) {
		this.tipo_End = tipo_End;
	}

	public Long getCidadeId() {
		return cidadeId;
	}

	public void setCidadeId(Long cidadeId) {
		this.cidadeId = cidadeId;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getTipo_tel() {
		return tipo;
	}

	public void setTipo_tel(Integer tipo) {
		this.tipo = tipo;
	}

	public Date getData_altera() {
		return data_altera;
	}

	public void setData_altera(Date data_altera) {
		this.data_altera = data_altera;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
