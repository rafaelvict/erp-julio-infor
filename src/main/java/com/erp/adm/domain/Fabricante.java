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
	
	
	private String razao;
	private String fantasia;
	private Integer desconto;
	private Date dataCad;
	private String cnpj;
	private String inscEstadual;
	private boolean inativo;
	
	@Column(unique = true)
	private String email;
	private String site;
	private Date dtAltera;
	
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

	public Fabricante(String razao, String fantasia, Integer desconto, Date dataCad, String cnpj, String inscEstadual,
			boolean inativo, String email, String site, Date dtAltera) {
		super();
		this.razao = razao;
		this.fantasia = fantasia;
		this.desconto = desconto;
		this.dataCad = dataCad;
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
		this.inativo = inativo;
		this.email = email;
		this.site = site;
		this.dtAltera = dtAltera;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public Integer getDesconto() {
		return desconto;
	}

	public void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}

	public Date getDataCad() {
		return dataCad;
	}

	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public boolean isInativo() {
		return inativo;
	}

	public void setInativo(boolean inativo) {
		this.inativo = inativo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Date getDtAltera() {
		return dtAltera;
	}

	public void setDtAltera(Date dtAltera) {
		this.dtAltera = dtAltera;
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

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	
}
