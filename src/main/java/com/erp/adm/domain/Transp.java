package com.erp.adm.domain;

import java.io.Serializable;
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
public class Transp extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	private String nomeTransp;
	private String cnpjTransp;
	private String ufTransp;
	private String inscEstadualTransp;
	private String emailTransp;
	private String placaTransp;
	private boolean logTransp;
	private Date dtAlteraTransp;
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
	private List<Telefone> telefonesTransp = new ArrayList<>();
	
	
	public Transp() {
		
	}

	
	public Transp(String nomeTransp, String cnpjTransp, String ufTransp, String inscEstadualTransp, String emailTransp,
			String placaTransp, boolean logTransp, Date dtAlteraTransp, String codIbgeTransp, String suframaTransp,
			Fornecedor fornecedor) {
		super();
		this.nomeTransp = nomeTransp;
		this.cnpjTransp = cnpjTransp;
		this.ufTransp = ufTransp;
		this.inscEstadualTransp = inscEstadualTransp;
		this.emailTransp = emailTransp;
		this.placaTransp = placaTransp;
		this.logTransp = logTransp;
		this.dtAlteraTransp = dtAlteraTransp;
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


	public String getCnpjTransp() {
		return cnpjTransp;
	}


	public void setCnpjTransp(String cnpjTransp) {
		this.cnpjTransp = cnpjTransp;
	}


	public String getUfTransp() {
		return ufTransp;
	}


	public void setUfTransp(String ufTransp) {
		this.ufTransp = ufTransp;
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


	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}


	public List<Endereco> getEnderecosTransp() {
		return enderecosTransp;
	}


	public void setEnderecosTransp(List<Endereco> enderecosTransp) {
		this.enderecosTransp = enderecosTransp;
	}


	public List<Telefone> getTelefonesTransp() {
		return telefonesTransp;
	}


	public void setTelefonesTransp(List<Telefone> telefonesTransp) {
		this.telefonesTransp = telefonesTransp;
	}


	
}
