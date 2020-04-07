package com.erp.adm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Fabricante extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nomeFab;
	private String razaoFab;
	private String fantasiaFab;
	private Float descontoFab;
	private Date dataCadFab;
	private String cnpjFab;
	private String inscEstadualFab;
	private boolean logFab;
	
	@Column(unique = true)
	private String emailFab;
	private String siteFab;
	private Date dtAlteraFab;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "FABRICANTE_FORNECEDOR",
			joinColumns = @JoinColumn(name = "fabricante_id"),
			inverseJoinColumns = @JoinColumn(name = "fornecedor_id")
	)
	private List<Fornecedor> fornecedores = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL)
	private List<Produto> produtos = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL)
	private List<Telefone> telefones = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL)
	private List<Endereco> enderecos = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL)
	private List<RamoAtividade> ramoAtividades = new ArrayList<>();
	
	public Fabricante() {
		
	}

	public Fabricante(String nomeFab, String razaoFab, String fantasiaFab, Float descontoFab, Date dataCadFab,
			String cnpjFab, String inscEstadualFab, boolean logFab, String emailFab, String siteFab, Date dtAlteraFab) {
		super();
		this.nomeFab = nomeFab;
		this.razaoFab = razaoFab;
		this.fantasiaFab = fantasiaFab;
		this.descontoFab = descontoFab;
		this.dataCadFab = dataCadFab;
		this.cnpjFab = cnpjFab;
		this.inscEstadualFab = inscEstadualFab;
		this.logFab = logFab;
		this.emailFab = emailFab;
		this.siteFab = siteFab;
		this.dtAlteraFab = dtAlteraFab;
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

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<RamoAtividade> getRamoAtividades() {
		return ramoAtividades;
	}

	public void setRamoAtividades(List<RamoAtividade> ramoAtividades) {
		this.ramoAtividades = ramoAtividades;
	}



	
	
}
