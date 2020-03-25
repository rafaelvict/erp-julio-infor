package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class SubGrupo extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	private boolean log;
	private Date dtAltera;
	private boolean controlado;
	private String msgVenda;
	private boolean bloqVenda;
	
	public SubGrupo() {
		 
	}

	public SubGrupo(String descricao, boolean log, Date dtAltera, boolean controlado, String msgVenda,
			boolean bloqVenda) {
		super();
		this.descricao = descricao;
		this.log = log;
		this.dtAltera = dtAltera;
		this.controlado = controlado;
		this.msgVenda = msgVenda;
		this.bloqVenda = bloqVenda;
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

	public boolean isControlado() {
		return controlado;
	}

	public void setControlado(boolean controlado) {
		this.controlado = controlado;
	}

	public String getMsgVenda() {
		return msgVenda;
	}

	public void setMsgVenda(String msgVenda) {
		this.msgVenda = msgVenda;
	}

	public boolean isBloqVenda() {
		return bloqVenda;
	}

	public void setBloqVenda(boolean bloqVenda) {
		this.bloqVenda = bloqVenda;
	}
	
	
}
