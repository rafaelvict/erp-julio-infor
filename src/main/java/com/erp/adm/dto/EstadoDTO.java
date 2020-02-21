package com.erp.adm.dto;

import java.io.Serializable;

import com.erp.adm.domain.Estado;

public class EstadoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String sigla;
	private String nome;

	public EstadoDTO() {
		
	}
	
	public EstadoDTO(Estado obj) {
		id = obj.getCodigo();
		sigla = obj.getSigla();
		nome = obj.getNome();
	}

	public EstadoDTO(Long id, String sigla, String nome) {
		super();
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
