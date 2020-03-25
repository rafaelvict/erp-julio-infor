package com.erp.adm.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class TotalizadorFiscal extends GenericDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String apelido;
	private String descricao;
	private Integer icms;
	private String impFiscal;
	
	public TotalizadorFiscal() {
		
	}

	public TotalizadorFiscal(String apelido, String descricao, Integer icms, String impFiscal) {
		super();
		this.apelido = apelido;
		this.descricao = descricao;
		this.icms = icms;
		this.impFiscal = impFiscal;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getIcms() {
		return icms;
	}

	public void setIcms(Integer icms) {
		this.icms = icms;
	}

	public String getImpressora() {
		return impFiscal;
	}

	public void setImpressora(String impFiscal) {
		this.impFiscal = impFiscal;
	}
	
	
}
