package com.erp.adm.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class TipoMercadoria extends GenericDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descricao;
	
	@Transient
	@OneToOne(cascade = CascadeType.ALL)
	private Grupo grupo;
	
	public TipoMercadoria() {
		
	}

	public TipoMercadoria(String descricao, Grupo grupo) {
		super();
		this.descricao = descricao;
		this.grupo = grupo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	
}
