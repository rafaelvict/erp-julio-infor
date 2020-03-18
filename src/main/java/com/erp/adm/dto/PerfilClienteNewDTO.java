package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class PerfilClienteNewDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=10, max=50, message="Tamanho deve ser entre 10 e 50 caracteres")
	private String descricaoPerf;
	
	@NotNull
	private Float acrescimo;

	private Date dtPrimComp;

	private Date dtUltComp;

	@NotNull
	private Float desconto;

	@NotNull
	private Float descMaxVista;

	@NotNull
	private Float descMaxPrazo;

	@NotNull
	private boolean somenteVista;

	private Date dataCad;

	private Integer diasAtraso;

	@NotNull
	private Float saldoDev;

	@NotNull
	private Float saldoMes;

	@NotNull
	private Float credito;

	@NotNull
	private Float limite;

	@NotNull
	private Float limiteMes;

	@NotNull
	private Integer maxDiasAtraso;

	private Integer codigoIbge;

	private Integer diaVencto;

	@Length(max=20, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String abc;

	private Date dtAlteraPerf;
	
	//Cliente
	private Long clienteId;
	
	
	public PerfilClienteNewDTO() {
		
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


	public boolean isSomenteVista() {
		return somenteVista;
	}


	public void setSomenteVista(boolean somenteVista) {
		this.somenteVista = somenteVista;
	}


	public Date getDataCad() {
		return dataCad;
	}


	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
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


	public Date getDtAlteraPerf() {
		return dtAlteraPerf;
	}


	public void setDtAlteraPerf(Date dtAlteraPerf) {
		this.dtAlteraPerf = dtAlteraPerf;
	}


	public Long getClienteId() {
		return clienteId;
	}


	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}


	public Float getAcrescimo() {
		return acrescimo;
	}


	public void setAcrescimo(Float acrescimo) {
		this.acrescimo = acrescimo;
	}
	
	
}
