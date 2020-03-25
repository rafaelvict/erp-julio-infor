package com.erp.adm.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class GrupoMercadoria extends GenericDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	
	public GrupoMercadoria() {
		
	}

	public GrupoMercadoria(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
