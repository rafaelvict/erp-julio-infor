package com.erp.adm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Banco extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	private String nomeBanco;
	private Integer agencia;
	private Integer contaCorrente;
	private Date dataAlteraBanco;
	
	@OneToMany(mappedBy = "banco")
	private List<Cliente> clientes = new ArrayList<>();
	
	
	public Banco() {
		
	}

	public Banco(String nomeBanco, Integer agencia, Integer contaCorrente, Date dataAlteraBanco) {
		super();
		this.nomeBanco = nomeBanco;
		this.agencia = agencia;
		this.contaCorrente = contaCorrente;
		this.dataAlteraBanco = dataAlteraBanco;
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

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	
	
	
}
