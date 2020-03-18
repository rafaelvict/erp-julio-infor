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
	
	private Integer insc_Estadual;
	
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
	

	public String getDescricaoRamo() {
		return descricaoRamo;
	}

	public void setDescricaoRamo(String descricaoRamo) {
		this.descricaoRamo = descricaoRamo;
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

}
