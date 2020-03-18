package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PerfilCliente extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String descricaoPerf;
	private Date dtPrimComp;
	private Date dtUltComp;
	private Float desconto;
	private Float descMaxVista;
	private Float descMaxPrazo;
	private Date dataCad;
	private boolean somenteVista;
	private Integer diasAtraso;
	private Float saldoDev;
	private Float saldoMes;
	private Float credito;
	private Float limite;
	private Float limiteMes;
	private Integer maxDiasAtraso;
	private Integer acrescimo;
	private Integer codigoIbge;
	private Integer diaVencto;
	private String abc;
	private Date dtAlteraPerf;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	public PerfilCliente() {
		
	}

	public PerfilCliente(String descricaoPerf, Date dtPrimComp, Date dtUltComp, Float desconto, Float descMaxVista,
			Float descMaxPrazo, Date dataCad, boolean somenteVista, Integer diasAtraso, Float saldoDev, Float saldoMes,
			Float credito, Float limite, Float limiteMes, Integer maxDiasAtraso, Integer acrescimo, Integer codigoIbge,
			Integer diaVencto, String abc, Date dtAlteraPerf, Cliente cliente) {
		super();
		this.descricaoPerf = descricaoPerf;
		this.dtPrimComp = dtPrimComp;
		this.dtUltComp = dtUltComp;
		this.desconto = desconto;
		this.descMaxVista = descMaxVista;
		this.descMaxPrazo = descMaxPrazo;
		this.dataCad = dataCad;
		this.somenteVista = somenteVista;
		this.diasAtraso = diasAtraso;
		this.saldoDev = saldoDev;
		this.saldoMes = saldoMes;
		this.credito = credito;
		this.limite = limite;
		this.limiteMes = limiteMes;
		this.maxDiasAtraso = maxDiasAtraso;
		this.acrescimo = acrescimo;
		this.codigoIbge = codigoIbge;
		this.diaVencto = diaVencto;
		this.abc = abc;
		this.dtAlteraPerf = dtAlteraPerf;
		this.cliente = cliente;
	}

	public String getDescricaoPerf() {
		return descricaoPerf;
	}

	public void setDescricaoPerf(String descricaoPerf) {
		this.descricaoPerf = descricaoPerf;
	}

	public Date getDtPrimComp() {
		return dtPrimComp;
	}

	public void setDtPrimComp(Date dtPrimComp) {
		this.dtPrimComp = dtPrimComp;
	}

	public Date getDtUltComp() {
		return dtUltComp;
	}

	public void setDtUltComp(Date dtUltComp) {
		this.dtUltComp = dtUltComp;
	}

	public Float getDesconto() {
		return desconto;
	}

	public void setDesconto(Float desconto) {
		this.desconto = desconto;
	}

	public Float getDescMaxVista() {
		return descMaxVista;
	}

	public void setDescMaxVista(Float descMaxVista) {
		this.descMaxVista = descMaxVista;
	}

	public Float getDescMaxPrazo() {
		return descMaxPrazo;
	}

	public void setDescMaxPrazo(Float descMaxPrazo) {
		this.descMaxPrazo = descMaxPrazo;
	}

	public Date getDataCad() {
		return dataCad;
	}

	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
	}

	public boolean isSomenteVista() {
		return somenteVista;
	}

	public void setSomenteVista(boolean somenteVista) {
		this.somenteVista = somenteVista;
	}

	public Integer getDiasAtraso() {
		return diasAtraso;
	}

	public void setDiasAtraso(Integer diasAtraso) {
		this.diasAtraso = diasAtraso;
	}

	public Float getSaldoDev() {
		return saldoDev;
	}

	public void setSaldoDev(Float saldoDev) {
		this.saldoDev = saldoDev;
	}

	public Float getSaldoMes() {
		return saldoMes;
	}

	public void setSaldoMes(Float saldoMes) {
		this.saldoMes = saldoMes;
	}

	public Float getCredito() {
		return credito;
	}

	public void setCredito(Float credito) {
		this.credito = credito;
	}

	public Float getLimite() {
		return limite;
	}

	public void setLimite(Float limite) {
		this.limite = limite;
	}

	public Float getLimiteMes() {
		return limiteMes;
	}

	public void setLimiteMes(Float limiteMes) {
		this.limiteMes = limiteMes;
	}

	public Integer getMaxDiasAtraso() {
		return maxDiasAtraso;
	}

	public void setMaxDiasAtraso(Integer maxDiasAtraso) {
		this.maxDiasAtraso = maxDiasAtraso;
	}

	public Integer getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(Integer acrescimo) {
		this.acrescimo = acrescimo;
	}

	public Integer getCodigoIbge() {
		return codigoIbge;
	}

	public void setCodigoIbge(Integer codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	public Integer getDiaVencto() {
		return diaVencto;
	}

	public void setDiaVencto(Integer diaVencto) {
		this.diaVencto = diaVencto;
	}

	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDtAlteraPerf() {
		return dtAlteraPerf;
	}

	public void setDtAlteraPerf(Date dtAlteraPerf) {
		this.dtAlteraPerf = dtAlteraPerf;
	}
	
	
	
}
