package com.erp.adm.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import com.erp.adm.domain.Transp;

public class TranspDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=40, message="Tamanho deve ser de até 40 caracteres")
	private String nomeTransp;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@CNPJ
	private String cnpjTransp;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=20, message="Tamanho deve ser de até 20 caracteres")
	private String inscEstadualTransp;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email
	private String emailTransp;
	
	public TranspDTO() {
		
	}
	
	public TranspDTO(Transp obj) {
		id = obj.getCodigo();
		nomeTransp = obj.getNomeTransp();
		cnpjTransp = obj.getCnpjTransp();
		inscEstadualTransp = obj.getInscEstadualTransp();
		emailTransp = obj.getEmailTransp();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeTransp() {
		return nomeTransp;
	}

	public void setNomeTransp(String nomeTransp) {
		this.nomeTransp = nomeTransp;
	}

	public String getCnpjTransp() {
		return cnpjTransp;
	}

	public void setCnpjTransp(String cnpjTransp) {
		this.cnpjTransp = cnpjTransp;
	}

	public String getInscEstadualTransp() {
		return inscEstadualTransp;
	}

	public void setInscEstadualTransp(String inscEstadualTransp) {
		this.inscEstadualTransp = inscEstadualTransp;
	}

	public String getEmailTransp() {
		return emailTransp;
	}

	public void setEmailTransp(String emailTransp) {
		this.emailTransp = emailTransp;
	}
	
	
}
