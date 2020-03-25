package com.erp.adm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Fornecedor extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Date nascimento;
	private String nascionalidade;
	private String cpfCnpj;
	
	@Column(unique = true)
	private String email;
	private Integer tipoEstadoCivil;
	private Integer tipoSexo;
	private String razao;
	private String fantasia;
	private String inscEstadual;
	private String inscMunicipal;
	private Integer suframa;
	private Integer tipoFornecedor;
	private String codIbge;
	private String obs;
	private boolean inativo;
	
	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "fornecedores")
	private List<Fabricante> fabricantes = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL)
	private List<Transp> transportadoras = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL)
	private List<RamoAtividade> ramoAtividades = new ArrayList<>();
	
	public Fornecedor() {
		
	}

	public Fornecedor(String nome, Date nascimento, String nascionalidade, String cpfCnpj, String email,
			Integer tipoEstadoCivil, Integer tipoSexo, String razao, String fantasia, String inscEstadual,
			String inscMunicipal, Integer suframa, Integer tipoFornecedor, String codIbge, String obs, boolean inativo,
			Empresa empresa) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.nascionalidade = nascionalidade;
		this.cpfCnpj = cpfCnpj;
		this.email = email;
		this.tipoEstadoCivil = tipoEstadoCivil;
		this.tipoSexo = tipoSexo;
		this.razao = razao;
		this.fantasia = fantasia;
		this.inscEstadual = inscEstadual;
		this.inscMunicipal = inscMunicipal;
		this.suframa = suframa;
		this.tipoFornecedor = tipoFornecedor;
		this.codIbge = codIbge;
		this.obs = obs;
		this.inativo = inativo;
		this.empresa = empresa;
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

	public Integer getSuframa() {
		return suframa;
	}

	public void setSuframa(Integer suframa) {
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

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Transp> getTransportadoras() {
		return transportadoras;
	}

	public void setTransportadoras(List<Transp> transportadoras) {
		this.transportadoras = transportadoras;
	}

	public List<RamoAtividade> getRamoAtividades() {
		return ramoAtividades;
	}

	public void setRamoAtividades(List<RamoAtividade> ramoAtividades) {
		this.ramoAtividades = ramoAtividades;
	}
	
	
}
