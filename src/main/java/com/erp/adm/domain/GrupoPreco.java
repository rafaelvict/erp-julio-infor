package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class GrupoPreco extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	private boolean log;
	private Date dtAltera;
	
	
	public GrupoPreco() {
		
	}

	public GrupoPreco(String descricao, boolean log, Date dtAltera) {
		super();
		this.descricao = descricao;
		this.log = log;
		this.dtAltera = dtAltera;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isLog() {
		return log;
	}

	public void setLog(boolean log) {
		this.log = log;
	}

	public Date getDtAltera() {
		return dtAltera;
	}

	public void setDtAltera(Date dtAltera) {
		this.dtAltera = dtAltera;
	}
	
}
