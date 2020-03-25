package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Unidade extends GenericDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	private boolean frac;
	private boolean log;
	private Date dtAltera;
	private String balanca;
	private Integer tipo;
	private String anvisa;
	
	
	public Unidade() {
		
	}

	public Unidade(String descricao, boolean frac, boolean log, Date dtAltera, String balanca, Integer tipo,
			String anvisa) {
		super();
		this.descricao = descricao;
		this.frac = frac;
		this.log = log;
		this.dtAltera = dtAltera;
		this.balanca = balanca;
		this.tipo = tipo;
		this.anvisa = anvisa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isFrac() {
		return frac;
	}

	public void setFrac(boolean frac) {
		this.frac = frac;
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

	public String getBalanca() {
		return balanca;
	}

	public void setBalanca(String balanca) {
		this.balanca = balanca;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getAnvisa() {
		return anvisa;
	}

	public void setAnvisa(String anvisa) {
		this.anvisa = anvisa;
	}
	
}
