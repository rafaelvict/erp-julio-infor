package com.erp.adm.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Cidade extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	private String nome;
	private String codigoIbge;
	
	@ManyToOne
	@JoinColumn(name="estado_id")
	private Estado estado;
	
	public Cidade() {
		
	}
	
	public Cidade(String nome, String codigoIbge) {
		this.nome = nome;
		this.codigoIbge = codigoIbge;
	}
	
	public Cidade(String nome, String codigoIbge, Estado estado) {
		super();
		this.nome = nome;
		this.codigoIbge = codigoIbge;
		this.estado = estado;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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



