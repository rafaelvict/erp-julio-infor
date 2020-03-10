package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import com.erp.adm.services.validation.EmpresaInsert;

@EmpresaInsert
public class EmpresaNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	//Empresa
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=50, message="Tamanho deve ser entre 2 e 50 caracteres")
	private String nome;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@CNPJ
	private String cnpj;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=9, max=9, message="Tamanho deve ser de 6 caracteres")
	private String insc_Estadual;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=11, max=11, message="Tamanho deve ser de 11 caracteres")
	private String insc_Municipal;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email(message="Email inválido!")
	private String email;
	
	private Integer vias;
	
	private Integer vias_Boleto;
	
	private Integer dias_Juros;
	
	private Float multa;
	
	private Float mora;
	
	private Integer ini_Mes;
	
	private Integer fim_Mes;
	
	private boolean bolBancario;
	
	private Double valor_IsencaoBoleto;
	
	private Double valor_AdcBoleto;
	
	private Float desconto_Funcionario;
	
	private Float desconto_Empresa;
	
	private Float acrescimo;
	
	private Integer tipo_Venda;
	
	private Integer tipo_Preco;
	
	@NotNull
	private boolean delivery;
	
	private Integer dias_DescFab;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=9, max=9, message="Tamanho deve ser de 9  caracteres")
	private String codigo_Ibge;
	
	@NotNull
	private boolean creadiario;
	
	@NotNull
	private boolean pergNota;
	
	@NotNull
	private boolean descMaxGrupo;
	
	@NotNull
	private boolean pergPontoVenda;
	
	@NotNull
	private boolean usarProcPromo;
	
	@NotNull
	private boolean usarDescVista;
	
	@NotNull
	private boolean permDesc;
	
	@NotNull
	private boolean pedirTransp;
	
	@NotNull
	private boolean farmaciaPopular;
	
	@NotNull
	private boolean controleVencto;
	
	@Length(max=40, message="Tamanho deve ser de até 40 caracteres")
	private String msgBoleto1;
	
	@Length(max=40, message="Tamanho deve ser de até 40 caracteres")
	private String msgBoleto2;
	
	private Integer mesReceb;
	
	@Length(max=20, message="Tamanho deve ser de até 20 caracteres")
	private String mascara;
	
	@NotNull
	private boolean cupomFisc;
	
	@NotNull
	private boolean emitirBoletoBanc;
	
	private Integer vias_Pagto;
	
	@NotNull
	private boolean log;
	
	private Date dataAltera;
	
	@NotNull
	private boolean impCv;
	
	@NotNull
	private Integer tipo_Vencto;
	
	@NotNull
	private boolean ignorarSaldo;
	
	@Length(max=150, message="Tamanho deve ser de até 150 caracteres")
	private String msg_Venda;
	
	@NotNull
	private boolean manterDescEmp;
	
	@NotNull
	private boolean semComissao;
	
	@NotNull
	private boolean numAutoriz;
	
	@NotNull
	private boolean ignorarPrecoPrazo;
	
	@NotNull
	private Float percent_Vista;
	
	@NotNull
	private Float percent_CartaFrete;
	
	@NotNull
	private Integer pontos_PorReal;
	
	
	
	//Endereco
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=40, message="Tamanho deve ser entre 5 e 40 caracteres")
	private String rua;
	
	@NotNull
	private Integer numero;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=3, max=40, message="Tamanho deve ser entre 3 e 40 caracteres")
	private String bairro;
	
	@Length(min=2, max=30, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String complemento;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=30, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String cep;
	
	@NotNull
	private Integer tipo_End;
	
	@NotNull
	private Long cidadeId;
	
	
	
	//Telefone
	@NotNull
	private Integer ddd;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=8, max=30, message="Tamanho deve ser entre 8 e 30 caracteres")
	private String telefone;
	
	@NotNull
	private Integer tipo;
	
	@NotNull
	private Date data_altera;
	
	//Ramo Atividade
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=100, message="Tamanho deve ser entre 5 e 100 caracteres")
	private String descricao;
	
	public EmpresaNewDTO() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public boolean getBolBancario() {
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

	public boolean getDelivery() {
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

	public String getCodigo_Ibge() {
		return codigo_Ibge;
	}

	public void setCodigo_Ibge(String codigo_Ibge) {
		this.codigo_Ibge = codigo_Ibge;
	}

	public boolean getCreadiario() {
		return creadiario;
	}

	public void setCreadiario(boolean creadiario) {
		this.creadiario = creadiario;
	}

	public boolean getPergNota() {
		return pergNota;
	}

	public void setPergNota(boolean pergNota) {
		this.pergNota = pergNota;
	}

	public boolean getDescMaxGrupo() {
		return descMaxGrupo;
	}

	public void setDescMaxGrupo(boolean descMaxGrupo) {
		this.descMaxGrupo = descMaxGrupo;
	}

	public boolean getPergPontoVenda() {
		return pergPontoVenda;
	}

	public void setPergPontoVenda(boolean pergPontoVenda) {
		this.pergPontoVenda = pergPontoVenda;
	}

	public boolean getUsarProcPromo() {
		return usarProcPromo;
	}

	public void setUsarProcPromo(boolean usarProcPromo) {
		this.usarProcPromo = usarProcPromo;
	}

	public boolean getUsarDescVista() {
		return usarDescVista;
	}

	public void setUsarDescVista(boolean usarDescVista) {
		this.usarDescVista = usarDescVista;
	}

	public boolean getPermDesc() {
		return permDesc;
	}

	public void setPermDesc(boolean permDesc) {
		this.permDesc = permDesc;
	}

	public boolean getPedirTransp() {
		return pedirTransp;
	}

	public void setPedirTransp(boolean pedirTransp) {
		this.pedirTransp = pedirTransp;
	}

	public boolean getFarmaciaPopular() {
		return farmaciaPopular;
	}

	public void setFarmaciaPopular(boolean farmaciaPopular) {
		this.farmaciaPopular = farmaciaPopular;
	}

	public boolean getControleVencto() {
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

	public boolean getCupomFisc() {
		return cupomFisc;
	}

	public void setCupomFisc(boolean cupomFisc) {
		this.cupomFisc = cupomFisc;
	}

	public boolean getEmitirBoletoBanc() {
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

	public boolean getLog() {
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

	public boolean getImpCv() {
		return impCv;
	}

	public void setImpCv(boolean impCv) {
		this.impCv = impCv;
	}

	public Integer getTipo_Vencto() {
		return tipo_Vencto;
	}

	public void setTipo_Vencto(Integer tipo_Vencto) {
		this.tipo_Vencto = tipo_Vencto;
	}

	public boolean getIgnorarSaldo() {
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

	public boolean getManterDescEmp() {
		return manterDescEmp;
	}

	public void setManterDescEmp(boolean manterDescEmp) {
		this.manterDescEmp = manterDescEmp;
	}

	public boolean getSemComissao() {
		return semComissao;
	}

	public void setSemComissao(boolean semComissao) {
		this.semComissao = semComissao;
	}

	public boolean getNumAutoriz() {
		return numAutoriz;
	}

	public void setNumAutoriz(boolean numAutoriz) {
		this.numAutoriz = numAutoriz;
	}

	public boolean getIgnorarPrecoPrazo() {
		return ignorarPrecoPrazo;
	}

	public void setIgnorarPrecoPrazo(boolean ignorarPrecoPrazo) {
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
