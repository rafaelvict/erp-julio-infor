package com.erp.adm.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Cidade extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 20, nullable = false)
	private Integer codigoIbge;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Estado estado;
	
	public Cidade() {
		
	}
	
	public Cidade(String nome, Integer codigoIbge, Estado estado) {
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
	
	
	public Integer getCodigoIbge() {
		return codigoIbge;
	}
	
	public void setCodigoIbge(Integer codigoIbge) {
		this.codigoIbge = codigoIbge;
	}
	
}



