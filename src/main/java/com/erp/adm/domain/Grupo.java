package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Grupo extends GenericDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	private Float comissao;
	private Float descMax;
	private Float margem;
	private boolean log;
	private Date dtAltera;
	private boolean custoMedio;
	private boolean naltPrcComp;
	private boolean repassarDescCompra;
	private boolean cmPrecoVar;
	private Integer tipoFrasco;
	private String grupMat;
	private Float ivast;
	private Integer tipo;
	
	@OneToOne
	@JoinColumn(name = "tipoMercadoria_id")
	private TipoMercadoria tipoMercadoria;
	
	public Grupo() {
		
	}

	public Grupo(String descricao, Float comissao, Float descMax, Float margem, boolean log, Date dtAltera,
			boolean custoMedio, boolean naltPrcComp, boolean repassarDescCompra, boolean cmPrecoVar, Integer tipoFrasco,
			String grupMat, Float ivast, Integer tipo, TipoMercadoria tipoMercadoria) {
		super();
		this.descricao = descricao;
		this.comissao = comissao;
		this.descMax = descMax;
		this.margem = margem;
		this.log = log;
		this.dtAltera = dtAltera;
		this.custoMedio = custoMedio;
		this.naltPrcComp = naltPrcComp;
		this.repassarDescCompra = repassarDescCompra;
		this.cmPrecoVar = cmPrecoVar;
		this.tipoFrasco = tipoFrasco;
		this.grupMat = grupMat;
		this.ivast = ivast;
		this.tipo = tipo;
		this.tipoMercadoria = tipoMercadoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getComissao() {
		return comissao;
	}

	public void setComissao(Float comissao) {
		this.comissao = comissao;
	}

	public Float getDescMax() {
		return descMax;
	}

	public void setDescMax(Float descMax) {
		this.descMax = descMax;
	}

	public Float getMargem() {
		return margem;
	}

	public void setMargem(Float margem) {
		this.margem = margem;
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

	public boolean isCustoMedio() {
		return custoMedio;
	}

	public void setCustoMedio(boolean custoMedio) {
		this.custoMedio = custoMedio;
	}

	public boolean isNaltPrcComp() {
		return naltPrcComp;
	}

	public void setNaltPrcComp(boolean naltPrcComp) {
		this.naltPrcComp = naltPrcComp;
	}

	public boolean isRepassarDescCompra() {
		return repassarDescCompra;
	}

	public void setRepassarDescCompra(boolean repassarDescCompra) {
		this.repassarDescCompra = repassarDescCompra;
	}

	public boolean isCmPrecoVar() {
		return cmPrecoVar;
	}

	public void setCmPrecoVar(boolean cmPrecoVar) {
		this.cmPrecoVar = cmPrecoVar;
	}

	public Integer getTipoFrasco() {
		return tipoFrasco;
	}

	public void setTipoFrasco(Integer tipoFrasco) {
		this.tipoFrasco = tipoFrasco;
	}

	public String getGrupMat() {
		return grupMat;
	}

	public void setGrupMat(String grupMat) {
		this.grupMat = grupMat;
	}

	public Float getIvast() {
		return ivast;
	}

	public void setIvast(Float ivast) {
		this.ivast = ivast;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public TipoMercadoria getTipoMercadoria() {
		return tipoMercadoria;
	}

	public void setTipoMercadoria(TipoMercadoria tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}
	
	
}
