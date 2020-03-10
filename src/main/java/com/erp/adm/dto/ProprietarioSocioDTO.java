package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.ProprietarioSocio;

public class ProprietarioSocioDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=10, max=50, message="Tamanho deve ser entre 10 e 50 caracteres")
	private String nome;
	
	private Date nascimento;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=30, message="Tamanho deve ser entre 5 e 30 caracteres")
	private String nascionalidade;
	
	@NotEmpty(message="Preenchimento obrigatório")
	private String cpfCnpj;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email(message="Email inválido!")
	private String email;
	
	public ProprietarioSocioDTO() {
		
	}
	
	public ProprietarioSocioDTO(ProprietarioSocio obj) {
		id = obj.getCodigo();
		nome = obj.getNome();
		nascimento = obj.getNascimento();
		nascionalidade = obj.getNascionalidade();
		cpfCnpj = obj.getCpfCnpj();
		email = obj.getEmail();
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

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getNascionalidade() {
		return nascionalidade;
	}

	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
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
	
	

}
