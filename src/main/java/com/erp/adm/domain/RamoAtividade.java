package com.erp.adm.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class RamoAtividade extends GenericDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
	
	public RamoAtividade() {
		
	}
	
	public RamoAtividade(String descricao, Empresa empresa) {
		super();
		this.descricao = descricao;
		this.empresa = empresa;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}
