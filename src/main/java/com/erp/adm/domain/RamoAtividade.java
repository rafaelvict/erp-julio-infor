package com.erp.adm.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class RamoAtividade extends GenericDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String descricaoRamo;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	
	public RamoAtividade() {
		
	}
	
	public RamoAtividade(String descricaoRamo, Empresa empresa, Cliente cliente) {
		super();
		this.descricaoRamo = descricaoRamo;
		this.empresa = empresa;
		this.cliente = cliente;
	}


	public String getDescricaoRamo() {
		return descricaoRamo;
	}

	public void setDescricaoRamo(String descricaoRamo) {
		this.descricaoRamo = descricaoRamo;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
