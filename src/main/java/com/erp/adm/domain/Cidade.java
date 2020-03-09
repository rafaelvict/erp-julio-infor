package com.erp.adm.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Cidade extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	private String nomeCidade;
	private String codigoIbge;
	
	@ManyToOne
	@JoinColumn(name="estado_id")
	private Estado estado;
	
	public Cidade() {
		
	}
	
	public Cidade(String nomeCidade, String codigoIbge, Estado estado) {
		super();
		this.nomeCidade = nomeCidade;
		this.codigoIbge = codigoIbge;
		this.estado = estado;
	}
	
	public String getNome() {
		return nomeCidade;
	}

	public void setNome(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	public String getCodigoIbge() {
		return codigoIbge;
	}
	
	public void setCodigoIbge(String codigoIbge) {
		this.codigoIbge = codigoIbge;
	}
	
}



