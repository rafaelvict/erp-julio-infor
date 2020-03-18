package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class DetalhesGerais extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	private Date dtAltera;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="dependente_id")
	private Dependente dependente;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="detalhesGrupo_id")
	private DetalhesGrupo detalhesGrupo;
	
	public DetalhesGerais() {
		
	}
	
	public DetalhesGerais(String descricao, Date dtAltera, DetalhesGrupo detalhesGrupo, Dependente dependente) {
		super();
		this.descricao = descricao;
		this.dtAltera = dtAltera;
		this.detalhesGrupo = detalhesGrupo;
		this.dependente = dependente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDtAltera() {
		return dtAltera;
	}

	public void setDtAltera(Date dtAltera) {
		this.dtAltera = dtAltera;
	}

	public DetalhesGrupo getDetalhesGrupo() {
		return detalhesGrupo;
	}

	public void setDetalhesGrupo(DetalhesGrupo detalhesGrupo) {
		this.detalhesGrupo = detalhesGrupo;
	}

	public Dependente getDependente() {
		return dependente;
	}

	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}

	
}
