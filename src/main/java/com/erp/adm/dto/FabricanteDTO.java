package com.erp.adm.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import com.erp.adm.domain.Fabricante;

public class FabricanteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=40, message="Tamanho deve ser de até 40 caracteres")
	private String nomeFab;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=30, message="Tamanho deve ser de até 30 caracteres")
	private String razaoFab;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=30, message="Tamanho deve ser de até 30 caracteres")
	private String fantasiaFab;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@CNPJ
	private String cnpjFab;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=9, max=9, message="Tamanho deve ser de 6 caracteres")
	private String inscEstadualFab;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email(message="Email inválido!")
	private String emailFab;
	
	public FabricanteDTO() {
		
	}
	
	public FabricanteDTO(Fabricante obj) {
		id = obj.getCodigo();
		nomeFab = obj.getNomeFab();
		razaoFab = obj.getRazaoFab();
		fantasiaFab = obj.getFantasiaFab();
		cnpjFab = obj.getFantasiaFab();
		inscEstadualFab = obj.getInscEstadualFab();
		emailFab = obj.getEmailFab();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeFab() {
		return nomeFab;
	}

	public void setNomeFab(String nomeFab) {
		this.nomeFab = nomeFab;
	}

	public String getRazaoFab() {
		return razaoFab;
	}

	public void setRazaoFab(String razaoFab) {
		this.razaoFab = razaoFab;
	}

	public String getFantasiaFab() {
		return fantasiaFab;
	}

	public void setFantasiaFab(String fantasiaFab) {
		this.fantasiaFab = fantasiaFab;
	}

	public String getCnpjFab() {
		return cnpjFab;
	}

	public void setCnpjFab(String cnpjFab) {
		this.cnpjFab = cnpjFab;
	}

	public String getInscEstadualFab() {
		return inscEstadualFab;
	}

	public void setInscEstadualFab(String inscEstadualFab) {
		this.inscEstadualFab = inscEstadualFab;
	}

	public String getEmailFab() {
		return emailFab;
	}

	public void setEmailFab(String emailFab) {
		this.emailFab = emailFab;
	}

	
	
}
