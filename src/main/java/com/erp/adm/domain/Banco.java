package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Banco extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	private String nomeBanco;
	private Integer agencia;
	private Integer contaCorrente;
	private Date dataAlteraBanco;

	@JsonIgnore
	@OneToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	public Banco() {
		
	}

	public Banco(String nomeBanco, Integer agencia, Integer contaCorrente, Date dataAlteraBanco, Cliente cliente) {
		super();
		this.nomeBanco = nomeBanco;
		this.agencia = agencia;
		this.contaCorrente = contaCorrente;
		this.dataAlteraBanco = dataAlteraBanco;
		this.cliente = cliente;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(Integer contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public Date getDataAlteraBanco() {
		return dataAlteraBanco;
	}

	public void setDataAlteraBanco(Date dataAlteraBanco) {
		this.dataAlteraBanco = dataAlteraBanco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
}
