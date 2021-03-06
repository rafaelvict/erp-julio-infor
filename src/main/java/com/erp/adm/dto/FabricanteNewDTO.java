package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import com.sun.istack.NotNull;

public class FabricanteNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=40, message="Tamanho deve ser de até 40 caracteres")
	private String nomeFab;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=30, message="Tamanho deve ser de até 30 caracteres")
	private String razaoFab;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=30, message="Tamanho deve ser de até 30 caracteres")
	private String fantasiaFab;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@CNPJ
	private String cnpjFab;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=9, max=9, message="Tamanho deve ser de 6 caracteres")
	private String inscEstadualFab;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email(message="Email inválido!")
	private String emailFab;
	
	@NotNull
	private Float descontoFab;
	
	private Date dataCadFab;
	
	private boolean logFab;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=50, message="Tamanho deve ser de até 50 caracteres")
	private String siteFab;
	
	private Date dtAlteraFab;
	
	
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
	private Integer tipoTel;
	
	private Date dataAlteraTel;
	
	
	//Ramo Atividade
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=100, message="Tamanho deve ser entre 5 e 100 caracteres")
	private String descricao;
	
	
	@NotNull
	private Long fornecedorId;
	
	
	public FabricanteNewDTO() {
		
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

	public String getEmailFab() {
		return emailFab;
	}

	public void setEmailFab(String emailFab) {
		this.emailFab = emailFab;
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

	public boolean isLogFab() {
		return logFab;
	}

	public void setLogFab(boolean logFab) {
		this.logFab = logFab;
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


	public Integer getTipoTel() {
		return tipoTel;
	}


	public void setTipoTel(Integer tipoTel) {
		this.tipoTel = tipoTel;
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

	
	public Long getFornecedorId() {
		return fornecedorId;
	}
	

	public void setFornecedorId(Long fornecedorId) {
		this.fornecedorId = fornecedorId;
	}
		
}
