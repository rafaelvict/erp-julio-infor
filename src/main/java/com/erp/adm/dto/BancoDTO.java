package com.erp.adm.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.Banco;

public class BancoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	Long id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=30, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String nomeBanco;
	
	@NotNull
	private Integer agencia;
	
	@NotNull
	private Integer contaCorrente;
	
	public BancoDTO() {
		
	}
	
	public BancoDTO(Banco obj) {
		id = obj.getCodigo();
		nomeBanco = obj.getNomeBanco();
		agencia = obj.getAgencia();
		contaCorrente = obj.getContaCorrente();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
}
