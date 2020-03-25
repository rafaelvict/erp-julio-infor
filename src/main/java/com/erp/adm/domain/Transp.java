package com.erp.adm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Transp extends GenericDomain {

	private String nomeTransp;
	private String cnpj;
	private String uf;
	private String inscEstadual;
	private String email;
	private String placa;
	private boolean log;
	private Date dtAltera;
	private String codIbge;
	private String suframa;

	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "fornecedor_id")
	private Fornecedor fornecedor;
	
	@JsonIgnore
	@OneToMany(mappedBy = "transp", cascade = CascadeType.ALL)
	private List<Endereco> enderecosTransp = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "transp", cascade = CascadeType.ALL)
	private List<Telefone> telefones = new ArrayList<>();
	
	
	public Transp() {
		
	}

	public Transp(String nomeTransp, String cnpj, String uf, String inscEstadual, String email, String placa,
			boolean log, Date dtAltera, String codIbge, String suframa, Fornecedor fornecedor) {
		super();
		this.nomeTransp = nomeTransp;
		this.cnpj = cnpj;
		this.uf = uf;
		this.inscEstadual = inscEstadual;
		this.email = email;
		this.placa = placa;
		this.log = log;
		this.dtAltera = dtAltera;
		this.codIbge = codIbge;
		this.suframa = suframa;
		this.fornecedor = fornecedor;
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

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getCodIbge() {
		return codIbge;
	}

	public void setCodIbge(String codIbge) {
		this.codIbge = codIbge;
	}

	public String getSuframa() {
		return suframa;
	}

	public void setSuframa(String suframa) {
		this.suframa = suframa;
	}

	public List<Endereco> getEnderecosTransp() {
		return enderecosTransp;
	}

	public void setEnderecosTransp(List<Endereco> enderecosTransp) {
		this.enderecosTransp = enderecosTransp;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	
}
