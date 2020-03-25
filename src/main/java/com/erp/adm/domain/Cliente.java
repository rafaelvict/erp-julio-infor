package com.erp.adm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.erp.adm.enums.TipoDocumento;
import com.erp.adm.enums.TipoEstadoCivil;
import com.erp.adm.enums.TipoPessoa;
import com.erp.adm.enums.TipoSexo;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cliente extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	private String nome;
	private Date nascimento;
	private String nascionalidade;
	private String cpfCnpj;
	
	@Column(unique = true)
	private String email;
	private Integer estadoCivil;
	private Integer sexo;
	private boolean ativo;
	private boolean online;
	private String status;
	
	@JsonIgnore
	private String senha;
	private Integer insc_Estadual;
	private Integer insc_Municipal;
	private Integer tipoPessoa;
	private String fantasia;
	private boolean bloqManual;
	private String cartaoFidelidade;
	private Integer pontosFidelidade;
	private boolean vidaLink;
	private Integer acrescimo;
	private boolean epharma;
	private String suframa;
	private boolean nExtConta;
	private boolean mostraMsg;
	private boolean geraCobranca;
	private String docOrgaoExp;
	private String docUfEmissao;
	private Integer docTipo;
	private String codControle;
	private String obs;
	private Date dtAlteraCli;
	private String numeroChapa;
	private boolean ultraCard;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="usuarioCad_id")
	private Usuario usuario;
	
	@Transient
	@OneToOne(cascade = CascadeType.ALL)
	private PerfilCliente perfilCliente;
	
	@Transient
	@OneToOne(cascade = CascadeType.ALL)
	private Banco banco;
	
	@JsonIgnore
	@ElementCollection
	@CollectionTable(name="obsimp")
	private Set<String> obsImps = new HashSet<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<HistCliente> historicosCliente = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<RamoAtividade> ramoAtividades = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Dependente> dependentes = new ArrayList<>();
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Endereco> enderecos = new ArrayList<>();
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Telefone> telefones =  new ArrayList<>();
	
	public Cliente() {
		
	}

	public Cliente(String nome, Date nascimento, String nascionalidade, String cpfCnpj, String email,
			TipoEstadoCivil estadoCivil, TipoSexo sexo, boolean ativo, boolean online, String status, String senha,
			Integer insc_Estadual, Integer insc_Municipal, TipoPessoa tipoPessoa, String fantasia, boolean bloqManual,
			String cartaoFidelidade, Integer pontosFidelidade, boolean vidaLink, Integer acrescimo, boolean epharma,
			String suframa, boolean nExtConta, boolean mostraMsg, boolean geraCobranca, String docOrgaoExp,
			String docUfEmissao, TipoDocumento docTipo, String codControle, String obs, Date dtAlteraCli, String numeroChapa,
			boolean ultraCard, Empresa empresa, Usuario usuario, PerfilCliente perfilCliente, Banco banco) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.nascionalidade = nascionalidade;
		this.cpfCnpj = cpfCnpj;
		this.email = email;
		this.estadoCivil = (estadoCivil==null) ? null : estadoCivil.getCodigo();
		this.sexo = (sexo==null) ? null : sexo.getCod();
		this.ativo = ativo;
		this.online = online;
		this.status = status;
		this.senha = senha;
		this.insc_Estadual = insc_Estadual;
		this.insc_Municipal = insc_Municipal;
		this.tipoPessoa = (tipoPessoa==null) ? null : tipoPessoa.getCodigo();
		this.fantasia = fantasia;
		this.bloqManual = bloqManual;
		this.cartaoFidelidade = cartaoFidelidade;
		this.pontosFidelidade = pontosFidelidade;
		this.vidaLink = vidaLink;
		this.acrescimo = acrescimo;
		this.epharma = epharma;
		this.suframa = suframa;
		this.nExtConta = nExtConta;
		this.mostraMsg = mostraMsg;
		this.geraCobranca = geraCobranca;
		this.docOrgaoExp = docOrgaoExp;
		this.docUfEmissao = docUfEmissao;
		this.docTipo = (docTipo==null) ? null : docTipo.getCodigo();
		this.codControle = codControle;
		this.obs = obs;
		this.dtAlteraCli = dtAlteraCli;
		this.numeroChapa = numeroChapa;
		this.ultraCard = ultraCard;
		this.empresa = empresa;
		this.usuario = usuario;
		this.perfilCliente = perfilCliente;
		this.banco = banco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public TipoEstadoCivil getEstadoCivil() {
		return TipoEstadoCivil.toEnum(estadoCivil);
	}

	public void setEstadoCivil(TipoEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil.getCodigo();
	}

	public TipoSexo getSexo() {
		return TipoSexo.toEnum(sexo);
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo.getCod();
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	public TipoPessoa getTipoPessoa() {
		return TipoPessoa.toEnum(tipoPessoa);
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa.getCodigo();
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
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

	public TipoDocumento getDocTipo() {
		return TipoDocumento.toEnum(docTipo);
	}

	public void setDocTipo(TipoDocumento docTipo) {
		this.docTipo = docTipo.getCodigo();
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

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public PerfilCliente getPerfilCliente() {
		return perfilCliente;
	}

	public void setPerfilCliente(PerfilCliente perfilCliente) {
		this.perfilCliente = perfilCliente;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public List<HistCliente> getHistoricosCliente() {
		return historicosCliente;
	}

	public void setHistoricosCliente(List<HistCliente> historicosCliente) {
		this.historicosCliente = historicosCliente;
	}

	public List<RamoAtividade> getRamoAtividades() {
		return ramoAtividades;
	}

	public void setRamoAtividades(List<RamoAtividade> ramoAtividades) {
		this.ramoAtividades = ramoAtividades;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Set<String> getObsImps() {
		return obsImps;
	}

	public void setObsImps(Set<String> obsImps) {
		this.obsImps = obsImps;
	}
}
