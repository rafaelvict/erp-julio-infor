package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class GrupoLinhas extends GenericDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	private Float mgVar;
	private Float icmsDentro;
	private Float redBaseSuv;
	private Float icmsFora;
	private boolean log;
	private Date dtAltera;
	
	
	public GrupoLinhas() {
		
	}


	public GrupoLinhas(String descricao, Float mgVar, Float icmsDentro, Float redBaseSuv, Float icmsFora, boolean log,
			Date dtAltera) {
		super();
		this.descricao = descricao;
		this.mgVar = mgVar;
		this.icmsDentro = icmsDentro;
		this.redBaseSuv = redBaseSuv;
		this.icmsFora = icmsFora;
		this.log = log;
		this.dtAltera = dtAltera;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Float getMgVar() {
		return mgVar;
	}


	public void setMgVar(Float mgVar) {
		this.mgVar = mgVar;
	}


	public Float getIcmsDentro() {
		return icmsDentro;
	}


	public void setIcmsDentro(Float icmsDentro) {
		this.icmsDentro = icmsDentro;
	}


	public Float getRedBaseSuv() {
		return redBaseSuv;
	}


	public void setRedBaseSuv(Float redBaseSuv) {
		this.redBaseSuv = redBaseSuv;
	}


	public Float getIcmsFora() {
		return icmsFora;
	}


	public void setIcmsFora(Float icmsFora) {
		this.icmsFora = icmsFora;
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
