package com.erp.adm.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.Cidade;

public class CidadeDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=30, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String nomeCidade;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=10, message="Tamanho deve ser entre 5 e 10 caracteres")
	private String codigoIbge;
	
	public CidadeDTO() {
		
	}
	
	public CidadeDTO(Cidade obj) {
		id = obj.getCodigo();
		nomeCidade = obj.getNome();
		codigoIbge = obj.getCodigoIbge();
	}

	public String getNome() {
		return nomeCidade;
	}

	public void setNome(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getCodigoIbge() {
		return codigoIbge;
	}

	public void setCodigoIbge(String codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
