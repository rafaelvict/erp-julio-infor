package com.erp.adm.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

public class FornecedorNewDTO {

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 2, max = 50, message = "Tamanho deve ser entre 2 e 50 caracteres")
	private String nome;

	@NotEmpty(message = "Preenchimento obrigatório")
	private String cpfCnpj;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Email(message = "Email inválido!")
	private String email;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(max = 30, message = "Tamanho deve ser de até 30 caracteres")
	private String fantasia;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 9, max = 9, message = "Tamanho deve ser de 6 caracteres")
	private String inscEstadual;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 11, max = 11, message = "Tamanho deve ser de 11 caracteres")
	private String inscMunicipal;

	private Date nascimento;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 5, max = 30, message = "Tamanho deve ser entre 5 e 30 caracteres")
	private String nascionalidade;

	@NotNull
	private Integer tipoEstadoCivil;

	@NotNull
	private Integer tipoSexo;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(max = 30, message = "Tamanho deve ser de até 30 caracteres")
	private String razao;

	@Length(max = 30, message = "Tamanho deve ser de até 30 caracteres")
	private String suframa;

	@NotNull
	private Integer tipoFornecedor;

	@Length(min = 9, max = 9, message = "Tamanho deve ser de 9  caracteres")
	private String codIbge;

	@Length(max = 50, message = "Tamanho deve ser de até 50 caracteres")
	private String obs;

	@NotNull
	private boolean inativo;

	// Endereco
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 5, max = 40, message = "Tamanho deve ser entre 5 e 40 caracteres")
	private String rua;

	@NotNull
	private Integer numero;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 3, max = 40, message = "Tamanho deve ser entre 3 e 40 caracteres")
	private String bairro;

	@Length(min = 2, max = 30, message = "Tamanho deve ser entre 2 e 30 caracteres")
	private String complemento;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 2, max = 30, message = "Tamanho deve ser entre 2 e 30 caracteres")
	private String cep;

	@NotNull
	private Integer tipo_End;

	@NotNull
	private Long cidadeId;

	// Telefone
	@NotNull
	private Integer ddd;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 8, max = 30, message = "Tamanho deve ser entre 8 e 30 caracteres")
	private String telefone;

	@NotNull
	private Integer tipo;

	private Date data_altera;

	// Ramo Atividade
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 5, max = 100, message = "Tamanho deve ser entre 5 e 100 caracteres")
	private String descricao;
	
	//Empresa
	private Long empresaId;
	
	
	//Transportadora
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 2, max = 50, message = "Tamanho deve ser entre 2 e 50 caracteres")	
	private String nomeTransp;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@CNPJ
	private String cnpj;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 2, max = 2, message = "Tamanho deve ser de 2 caracteres")
	private String uf;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 9, max = 9, message = "Tamanho deve ser de 6 caracteres")
	private String inscEstadualTransp;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Email(message = "Email inválido!")
	private String emailTransp;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(max = 7, message = "Tamanho deve ser de no máximo 7 caracteres")
	private String placa;
	
	@NotNull
	private boolean log;
	
	private Date dtAltera;
	
	@Length(min = 9, max = 9, message = "Tamanho deve ser de 9  caracteres")
	private String codIbgeTransp;
	
	@Length(max = 30, message = "Tamanho deve ser de até 30 caracteres")
	private String suframaTransp;
	
	//Fabricante
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 2, max = 50, message = "Tamanho deve ser entre 2 e 50 caracteres")	
	private String nomeFab;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(max = 30, message = "Tamanho deve ser de até 30 caracteres")
	private String razaoFab;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(max = 30, message = "Tamanho deve ser de até 30 caracteres")
	private String fantasiaFab;
	
	@NotNull
	private Float descontoFab;
	
	private Date dataCadFab;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@CNPJ
	private String cnpjFab;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 9, max = 9, message = "Tamanho deve ser de 6 caracteres")
	private String inscEstadualFab;
	
	@NotNull
	private boolean logFab;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Email(message = "Email inválido!")
	private String emailFab;
	

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(max = 30, message = "Tamanho deve ser de até 30 caracteres")
	private String siteFab;
	
	private Date dtAlteraFab;
	
	public FornecedorNewDTO() {
		// TODO Auto-generated constructor stub
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

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public String getInscMunicipal() {
		return inscMunicipal;
	}

	public void setInscMunicipal(String inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
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

	public Integer getTipoEstadoCivil() {
		return tipoEstadoCivil;
	}

	public void setTipoEstadoCivil(Integer tipoEstadoCivil) {
		this.tipoEstadoCivil = tipoEstadoCivil;
	}

	public Integer getTipoSexo() {
		return tipoSexo;
	}

	public void setTipoSexo(Integer tipoSexo) {
		this.tipoSexo = tipoSexo;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public String getSuframa() {
		return suframa;
	}

	public void setSuframa(String suframa) {
		this.suframa = suframa;
	}

	public Integer getTipoFornecedor() {
		return tipoFornecedor;
	}

	public void setTipoFornecedor(Integer tipoFornecedor) {
		this.tipoFornecedor = tipoFornecedor;
	}

	public String getCodIbge() {
		return codIbge;
	}

	public void setCodIbge(String codIbge) {
		this.codIbge = codIbge;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public boolean isInativo() {
		return inativo;
	}

	public void setInativo(boolean inativo) {
		this.inativo = inativo;
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

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
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

	public Long getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Long empresaId) {
		this.empresaId = empresaId;
	}

	public String getNomeTransp() {
		return nomeTransp;
	}

	public void setNomeTransp(String nomeTransp) {
		this.nomeTransp = nomeTransp;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getInscEstadualTransp() {
		return inscEstadualTransp;
	}

	public void setInscEstadualTransp(String inscEstadualTransp) {
		this.inscEstadualTransp = inscEstadualTransp;
	}

	public String getEmailTransp() {
		return emailTransp;
	}

	public void setEmailTransp(String emailTransp) {
		this.emailTransp = emailTransp;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public boolean isLog() {
		return log;
	}

	public void setLog(boolean log) {
		this.log = log;
	}

	public Date getDtAltera() {
		return dtAltera;
	}

	public void setDtAltera(Date dtAltera) {
		this.dtAltera = dtAltera;
	}

	public String getCodIbgeTransp() {
		return codIbgeTransp;
	}

	public void setCodIbgeTransp(String codIbgeTransp) {
		this.codIbgeTransp = codIbgeTransp;
	}

	public String getSuframaTransp() {
		return suframaTransp;
	}

	public void setSuframaTransp(String suframaTransp) {
		this.suframaTransp = suframaTransp;
	}

	public String getNomeFab() {
		return nomeFab;
	}

	public void setNomeFab(String nomeFab) {
		this.nomeFab = nomeFab;
	}

	public String getRazaoFab() {
		return razaoFab;
	}

	public void setRazaoFab(String razaoFab) {
		this.razaoFab = razaoFab;
	}

	public String getFantasiaFab() {
		return fantasiaFab;
	}

	public void setFantasiaFab(String fantasiaFab) {
		this.fantasiaFab = fantasiaFab;
	}

	public Float getDescontoFab() {
		return descontoFab;
	}

	public void setDescontoFab(Float descontoFab) {
		this.descontoFab = descontoFab;
	}

	public Date getDataCadFab() {
		return dataCadFab;
	}

	public void setDataCadFab(Date dataCadFab) {
		this.dataCadFab = dataCadFab;
	}

	public String getCnpjFab() {
		return cnpjFab;
	}

	public void setCnpjFab(String cnpjFab) {
		this.cnpjFab = cnpjFab;
	}

	public String getInscEstadualFab() {
		return inscEstadualFab;
	}

	public void setInscEstadualFab(String inscEstadualFab) {
		this.inscEstadualFab = inscEstadualFab;
	}

	public boolean isLogFab() {
		return logFab;
	}

	public void setLogFab(boolean logFab) {
		this.logFab = logFab;
	}

	public String getEmailFab() {
		return emailFab;
	}

	public void setEmailFab(String emailFab) {
		this.emailFab = emailFab;
	}

	public String getSiteFab() {
		return siteFab;
	}

	public void setSiteFab(String siteFab) {
		this.siteFab = siteFab;
	}

	public Date getDtAlteraFab() {
		return dtAlteraFab;
	}

	public void setDtAlteraFab(Date dtAlteraFab) {
		this.dtAlteraFab = dtAlteraFab;
	}
	
	
	
}
