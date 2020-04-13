package com.erp.adm.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

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
	private Integer tipoEnd;

	@NotNull
	private Long cidadeId;

	// Telefone
	@NotNull
	private Integer ddd;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 8, max = 30, message = "Tamanho deve ser entre 8 e 30 caracteres")
	private String telefone;

	@NotNull
	private Integer tipoTel;

	private Date dataAlteraTel;

	// Ramo Atividade
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 5, max = 100, message = "Tamanho deve ser entre 5 e 100 caracteres")
	private String descricao;
	
	//Empresa
	private Long empresaId;
	
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
	
	public Integer getTipoEnd() {
		return tipoEnd;
	}

	public void setTipoEnd(Integer tipoEnd) {
		this.tipoEnd = tipoEnd;
	}

	public Integer getTipoTel() {
		return tipoTel;
	}

	public void setTipoTel(Integer tipoTel) {
		this.tipoTel = tipoTel;
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

	public Date getDataAlteraTel() {
		return dataAlteraTel;
	}

	public void setDataAlteraTel(Date dataAlteraTel) {
		this.dataAlteraTel = dataAlteraTel;
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

}
