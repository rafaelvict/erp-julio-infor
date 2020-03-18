package com.erp.adm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class DetalhesGrupo extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	private String descricao;
	private boolean supervisor;
	private Date dtAltera;
	
	@OneToMany(mappedBy = "detalhesGrupo", cascade = CascadeType.ALL)
	private List<DetalhesGerais> detalhesGerais = new ArrayList<>();
	
	
	public DetalhesGrupo() {
		
	}
	
	public DetalhesGrupo(String descricao, boolean supervisor, Date dtAltera) {
		super();
		this.descricao = descricao;
		this.supervisor = supervisor;
		this.dtAltera = dtAltera;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isSupervisor() {
		return supervisor;
	}

	public void setSupervisor(boolean supervisor) {
		this.supervisor = supervisor;
	}

	public Date getDtAltera() {
		return dtAltera;
	}

	public void setDtAltera(Date dtAltera) {
		this.dtAltera = dtAltera;
	}

	public List<DetalhesGerais> getDetalhesGerais() {
		return detalhesGerais;
	}

	public void setDetalhesGerais(List<DetalhesGerais> detalhesGerais) {
		this.detalhesGerais = detalhesGerais;
	}

	
}
