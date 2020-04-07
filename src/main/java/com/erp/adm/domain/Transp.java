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
	private String inscEstadualTransp;
	private String emailTransp;
	private String placa;
	private boolean log;
	private Date dtAltera;
	private String codIbgeTransp;
	private String suframaTransp;

	
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

	public Transp(String nomeTransp, String cnpj, String uf, String inscEstadualTransp, String emailTransp, String placa,
			boolean log, Date dtAltera, String codIbgeTransp, String suframaTransp, Fornecedor fornecedor) {
		super();
		this.nomeTransp = nomeTransp;
		this.cnpj = cnpj;
		this.uf = uf;
		this.inscEstadualTransp = inscEstadualTransp;
		this.emailTransp = emailTransp;
		this.placa = placa;
		this.log = log;
		this.dtAltera = dtAltera;
		this.codIbgeTransp = codIbgeTransp;
		this.suframaTransp = suframaTransp;
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
		return inscEstadualTransp;
	}

	public void setInscEstadual(String inscEstadualTransp) {
		this.inscEstadualTransp = inscEstadualTransp;
	}

	public String getEmail() {
		return emailTransp;
	}

	public void setEmail(String emailTransp) {
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

	public String getCodIbge() {
		return codIbgeTransp;
	}

	public void setCodIbge(String codIbgeTransp) {
		this.codIbgeTransp = codIbgeTransp;
	}

	public String getSuframa() {
		return suframaTransp;
	}

	public void setSuframa(String suframaTransp) {
		this.suframaTransp = suframaTransp;
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
