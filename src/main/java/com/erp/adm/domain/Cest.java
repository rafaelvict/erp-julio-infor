package com.erp.adm.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Cest extends GenericDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer cest;
	private Integer ncm;
	private String descricao;
	
	public Cest() {
		
	}

	public Cest(Integer cest, Integer ncm, String descricao) {
		super();
		this.cest = cest;
		this.ncm = ncm;
		this.descricao = descricao;
	}

	public Integer getCest() {
		return cest;
	}

	public void setCest(Integer cest) {
		this.cest = cest;
	}

	public Integer getNcm() {
		return ncm;
	}

	public void setNcm(Integer ncm) {
		this.ncm = ncm;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
