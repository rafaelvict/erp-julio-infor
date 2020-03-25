package com.erp.adm.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Medico extends GenericDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer crm;
	private String uf;
	private String nomeConselho;
	private String telefone;
	private String celular;
	private Integer registroPro;
	private Integer conselhoPro;
	private Integer cep;
	
	public Medico() {
		
	}

	public Medico(Integer crm, String uf, String nomeConselho, String telefone, String celular, Integer registroPro,
			Integer conselhoPro, Integer cep) {
		super();
		this.crm = crm;
		this.uf = uf;
		this.nomeConselho = nomeConselho;
		this.telefone = telefone;
		this.celular = celular;
		this.registroPro = registroPro;
		this.conselhoPro = conselhoPro;
		this.cep = cep;
	}

	public Integer getCrm() {
		return crm;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNomeConselho() {
		return nomeConselho;
	}

	public void setNomeConselho(String nomeConselho) {
		this.nomeConselho = nomeConselho;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Integer getRegistroPro() {
		return registroPro;
	}

	public void setRegistroPro(Integer registroPro) {
		this.registroPro = registroPro;
	}

	public Integer getConselhoPro() {
		return conselhoPro;
	}

	public void setConselhoPro(Integer conselhoPro) {
		this.conselhoPro = conselhoPro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}
	
}
