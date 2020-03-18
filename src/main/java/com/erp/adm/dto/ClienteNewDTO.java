package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.services.validation.ClienteInsert;
import com.fasterxml.jackson.annotation.JsonIgnore;

@ClienteInsert
public class ClienteNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=30, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String nome;
	
	@NotEmpty(message="Preenchimento obrigatório")
	private String cpfCnpj;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email(message="Email inválido!")
	private String email;
	
	@NotNull
	private boolean ativo;
	
	@NotNull
	private Integer insc_Estadual;
	
	@NotNull
	private Integer insc_Municipal;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=50, message="Tamanho deve ser de 50 caracteres")
	private String fantasia;
	
	@NotNull
	private Integer estadoCivil;
	
	@NotNull
	private Integer sexo;
	
	private boolean online;
	
	private String status;
	
	private Date nascimento;
	
	@NotEmpty(message="Preenchimento obrigatório")
	private String nascionalidade;
	
	@JsonIgnore
	private String senha;
	
	@NotNull
	private Integer tipoPessoa;
	
	@NotNull
	private boolean bloqManual;
	
	@Length(max=15, message="Tamanho deve ser de no máximo 15 caracteres")
	private String cartaoFidelidade;
	
	@NotNull
	private Integer pontosFidelidade;
	
	@NotNull
	private boolean vidaLink;
	
	@NotNull
	private Integer acrescimo;
	
	@NotNull
	private boolean epharma;
	
	@Length(max=30, message="Tamanho deve ser de no máximo 30 caracteres")
	private String suframa;
	
	@NotNull
	private boolean nExtConta;
	
	@NotNull
	private boolean mostraMsg;
	
	@NotNull
	private boolean geraCobranca;
	
	@Length(max=10, message="Tamanho deve ser de no máximo 10 caracteres")
	private String docOrgaoExp;
	
	@Length(max=2, message="Tamanho deve ser de no máximo 2 caracteres")
	private String docUfEmissao;
	
	private Integer docTipo;
	
	@Length(max=15, message="Tamanho deve ser de no máximo 15 caracteres")
	private String codControle;
	
	private String obs;
	
	private Date dtAlteraCli;
	
	@Length(max=20, message="Tamanho deve ser de no máximo 20 caracteres")
	private String numeroChapa;
	
	@NotNull
	private boolean ultraCard;
	
	
	//Endereço
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
	private Integer tipo_Tel;
		
	private Date dataAlteraTel;
	
	
	
	//Perfil CLiente
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=10, max=50, message="Tamanho deve ser entre 10 e 50 caracteres")
	private String descricaoPerf;
	
	private Date dtPrimComp;
	
	private Date dtUltComp;
	
	@NotNull
	private Float desconto;
	
	@NotNull
	private Float descMaxVista;
	
	@NotNull
	private Float descMaxPrazo;
	
	@NotNull
	private boolean somenteVista;
	
	private Date dataCad;
	
	private Integer diasAtraso;
	
	@NotNull
	private Float saldoDev;
	
	@NotNull
	private Float saldoMes;
	
	@NotNull
	private Float credito;
	
	@NotNull
	private Float limite;
	
	@NotNull
	private Float limiteMes;
	
	@NotNull
	private Integer maxDiasAtraso;
	
	@Length(max=9, message="Tamanho deve ser de no máximo 9 caracteres")
	private Integer codigoIbge;
	
	private Integer diaVencto;
	
	@Length(max=20, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String abc;
	
	private Date dtAlteraPerf;
	
	
	//Banco
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=30, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String nomeBanco;
	
	@NotNull
	private Integer agencia;
	
	@NotNull
	private Integer contaCorrente;
	
	private Date dataAlteraBanco;
	
	
	//RamoAtividade
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=100, message="Tamanho deve ser entre 5 e 100 caracteres")
	private String descricaoRamo;
	
	//Empresa
	private Long empresaId;
	
	
	
	//Usuario
	private Long usuarioId;
	
	public ClienteNewDTO() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
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

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public Integer getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(Integer estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getNascionalidade() {
		return nascionalidade;
	}

	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(Integer tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public boolean isBloqManual() {
		return bloqManual;
	}

	public void setBloqManual(boolean bloqManual) {
		this.bloqManual = bloqManual;
	}

	public String getCartaoFidelidade() {
		return cartaoFidelidade;
	}

	public void setCartaoFidelidade(String cartaoFidelidade) {
		this.cartaoFidelidade = cartaoFidelidade;
	}

	public Integer getPontosFidelidade() {
		return pontosFidelidade;
	}

	public void setPontosFidelidade(Integer pontosFidelidade) {
		this.pontosFidelidade = pontosFidelidade;
	}

	public boolean isVidaLink() {
		return vidaLink;
	}

	public void setVidaLink(boolean vidaLink) {
		this.vidaLink = vidaLink;
	}

	public Integer getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(Integer acrescimo) {
		this.acrescimo = acrescimo;
	}

	public boolean isEpharma() {
		return epharma;
	}

	public void setEpharma(boolean epharma) {
		this.epharma = epharma;
	}

	public String getSuframa() {
		return suframa;
	}

	public void setSuframa(String suframa) {
		this.suframa = suframa;
	}

	public boolean isnExtConta() {
		return nExtConta;
	}

	public void setnExtConta(boolean nExtConta) {
		this.nExtConta = nExtConta;
	}

	public boolean isMostraMsg() {
		return mostraMsg;
	}

	public void setMostraMsg(boolean mostraMsg) {
		this.mostraMsg = mostraMsg;
	}

	public boolean isGeraCobranca() {
		return geraCobranca;
	}

	public void setGeraCobranca(boolean geraCobranca) {
		this.geraCobranca = geraCobranca;
	}

	public String getDocOrgaoExp() {
		return docOrgaoExp;
	}

	public void setDocOrgaoExp(String docOrgaoExp) {
		this.docOrgaoExp = docOrgaoExp;
	}

	public String getDocUfEmissao() {
		return docUfEmissao;
	}

	public void setDocUfEmissao(String docUfEmissao) {
		this.docUfEmissao = docUfEmissao;
	}

	public Integer getDocTipo() {
		return docTipo;
	}

	public void setDocTipo(Integer docTipo) {
		this.docTipo = docTipo;
	}

	public String getCodControle() {
		return codControle;
	}

	public void setCodControle(String codControle) {
		this.codControle = codControle;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Date getDtAlteraCli() {
		return dtAlteraCli;
	}

	public void setDtAlteraCli(Date dtAlteraCli) {
		this.dtAlteraCli = dtAlteraCli;
	}

	public String getNumeroChapa() {
		return numeroChapa;
	}

	public void setNumeroChapa(String numeroChapa) {
		this.numeroChapa = numeroChapa;
	}

	public boolean isUltraCard() {
		return ultraCard;
	}

	public void setUltraCard(boolean ultraCard) {
		this.ultraCard = ultraCard;
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

	public Integer getTipo_Tel() {
		return tipo_Tel;
	}

	public void setTipo_Tel(Integer tipo_Tel) {
		this.tipo_Tel = tipo_Tel;
	}
	
	public String getDescricaoPerf() {
		return descricaoPerf;
	}

	public void setDescricaoPerf(String descricaoPerf) {
		this.descricaoPerf = descricaoPerf;
	}

	public String getDescricaoRamo() {
		return descricaoRamo;
	}

	public void setDescricaoRamo(String descricaoRamo) {
		this.descricaoRamo = descricaoRamo;
	}

	public Date getDtPrimComp() {
		return dtPrimComp;
	}

	public void setDtPrimComp(Date dtPrimComp) {
		this.dtPrimComp = dtPrimComp;
	}

	public Date getDtUltComp() {
		return dtUltComp;
	}

	public void setDtUltComp(Date dtUltComp) {
		this.dtUltComp = dtUltComp;
	}

	public Float getDesconto() {
		return desconto;
	}

	public void setDesconto(Float desconto) {
		this.desconto = desconto;
	}

	public Float getDescMaxVista() {
		return descMaxVista;
	}

	public void setDescMaxVista(Float descMaxVista) {
		this.descMaxVista = descMaxVista;
	}

	public Float getDescMaxPrazo() {
		return descMaxPrazo;
	}

	public void setDescMaxPrazo(Float descMaxPrazo) {
		this.descMaxPrazo = descMaxPrazo;
	}

	public boolean isSomenteVista() {
		return somenteVista;
	}

	public void setSomenteVista(boolean somenteVista) {
		this.somenteVista = somenteVista;
	}

	public Date getDataCad() {
		return dataCad;
	}

	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
	}

	public Integer getDiasAtraso() {
		return diasAtraso;
	}

	public void setDiasAtraso(Integer diasAtraso) {
		this.diasAtraso = diasAtraso;
	}

	public Float getSaldoDev() {
		return saldoDev;
	}

	public void setSaldoDev(Float saldoDev) {
		this.saldoDev = saldoDev;
	}

	public Float getSaldoMes() {
		return saldoMes;
	}

	public void setSaldoMes(Float saldoMes) {
		this.saldoMes = saldoMes;
	}

	public Float getCredito() {
		return credito;
	}

	public void setCredito(Float credito) {
		this.credito = credito;
	}

	public Float getLimite() {
		return limite;
	}

	public void setLimite(Float limite) {
		this.limite = limite;
	}

	public Float getLimiteMes() {
		return limiteMes;
	}

	public void setLimiteMes(Float limiteMes) {
		this.limiteMes = limiteMes;
	}

	public Integer getMaxDiasAtraso() {
		return maxDiasAtraso;
	}

	public void setMaxDiasAtraso(Integer maxDiasAtraso) {
		this.maxDiasAtraso = maxDiasAtraso;
	}

	public Integer getCodigoIbge() {
		return codigoIbge;
	}

	public void setCodigoIbge(Integer codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	public Integer getDiaVencto() {
		return diaVencto;
	}

	public void setDiaVencto(Integer diaVencto) {
		this.diaVencto = diaVencto;
	}

	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(Integer contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public Long getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Long empresaId) {
		this.empresaId = empresaId;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Date getDataAlteraTel() {
		return dataAlteraTel;
	}

	public void setDataAlteraTel(Date dataAlteraTel) {
		this.dataAlteraTel = dataAlteraTel;
	}

	public Date getDataAlteraBanco() {
		return dataAlteraBanco;
	}

	public void setDataAlteraBanco(Date dataAlteraBanco) {
		this.dataAlteraBanco = dataAlteraBanco;
	}

	public Date getDtAlteraPerf() {
		return dtAlteraPerf;
	}

	public void setDtAlteraPerf(Date dtAlteraPerf) {
		this.dtAlteraPerf = dtAlteraPerf;
	}

}
