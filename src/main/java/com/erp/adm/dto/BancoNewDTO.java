package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class BancoNewDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=30, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String nomeBanco;
	
	@NotNull
	private Integer agencia;
	
	@NotNull
	private Integer contaCorrente;
	
	private Date dataAlteraBanco;
	
	//Cliente
	@NotNull
	private Long clienteId;
	
	
	public BancoNewDTO() {
		
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


	public Long getClienteId() {
		return clienteId;
	}


	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}


	public Date getDataAlteraBanco() {
		return dataAlteraBanco;
	}


	public void setDataAlteraBanco(Date dataAlteraBanco) {
		this.dataAlteraBanco = dataAlteraBanco;
	}
	
	
	
}
