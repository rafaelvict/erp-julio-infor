package com.erp.adm.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.Fornecedor;

public class FornecedorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=50, message="Tamanho deve ser entre 2 e 50 caracteres")
	private String nome;
	
	@NotEmpty(message="Preenchimento obrigatório")
	private String cpfCnpj; 
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email(message="Email inválido!")
	private String email;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=30, message="Tamanho deve ser de até 30 caracteres")
	private String fantasia;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=9, max=9, message="Tamanho deve ser de 6 caracteres")
	private String inscEstadual;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=11, max=11, message="Tamanho deve ser de 11 caracteres")
	private String inscMunicipal;
	
	public FornecedorDTO() {
		
	}
	
	public FornecedorDTO(Fornecedor obj) {
		id = obj.getCodigo();
		nome = obj.getNome();
		cpfCnpj = obj.getCpfCnpj();
		email = obj.getEmail();
		fantasia = obj.getFantasia();
		inscEstadual = obj.getInscEstadual();
		inscMunicipal = obj.getInscMunicipal();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public String getInscMunicipal() {
		return inscMunicipal;
	}

	public void setInscMunicipal(String inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
	}
	
	
}
