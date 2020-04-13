package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

public class TranspNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=40, message="Tamanho deve ser de até 40 caracteres")
	private String nomeTransp;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@CNPJ
	private String cnpjTransp;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=20, message="Tamanho deve ser de até 20 caracteres")
	private String inscEstadualTransp;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email
	private String emailTransp;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=2, message="Tamanho deve ser de até 2 caracteres")
	private String ufTransp;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=10, message="Tamanho deve ser de até 10 caracteres")
	private String placaTransp;
	
	@NotNull
	private boolean logTransp;
	
	
	private Date dtAlteraTransp;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=9, message="Tamanho deve ser de até 9 caracteres")
	private String codIbgeTransp;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=30, message="Tamanho deve ser de até 30 caracteres")
	private String suframaTransp;
	
	
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
	private Integer tipoEnd;
	
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
	
	
	private Date dataAltera;
	
	
	//Fornecedor
	private Long fornecedorId;
	
	
	public TranspNewDTO() {
		
	}


	public String getNomeTransp() {
		return nomeTransp;
	}


	public void setNomeTransp(String nomeTransp) {
		this.nomeTransp = nomeTransp;
	}


	public String getCnpjTransp() {
		return cnpjTransp;
	}


	public void setCnpjTransp(String cnpjTransp) {
		this.cnpjTransp = cnpjTransp;
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


	public String getUfTransp() {
		return ufTransp;
	}


	public void setUfTransp(String ufTransp) {
		this.ufTransp = ufTransp;
	}


	public String getPlacaTransp() {
		return placaTransp;
	}


	public void setPlacaTransp(String placaTransp) {
		this.placaTransp = placaTransp;
	}


	public boolean isLogTransp() {
		return logTransp;
	}


	public void setLogTransp(boolean logTransp) {
		this.logTransp = logTransp;
	}


	public Date getDtAlteraTransp() {
		return dtAlteraTransp;
	}


	public void setDtAlteraTransp(Date dtAlteraTransp) {
		this.dtAlteraTransp = dtAlteraTransp;
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


	public Date getDataAltera() {
		return dataAltera;
	}


	public void setDataAltera(Date dataAltera) {
		this.dataAltera = dataAltera;
	}


	public Long getFornecedorId() {
		return fornecedorId;
	}


	public void setFornecedorId(Long fornecedorId) {
		this.fornecedorId = fornecedorId;
	}

}
