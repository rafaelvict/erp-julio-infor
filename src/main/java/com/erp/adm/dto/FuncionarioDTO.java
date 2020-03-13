package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.Funcionario;

public class FuncionarioDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=50, message="Tamanho deve ser entre 5 e 50 caracteres")
	private String nome;
	
	
	private Date nascimento;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=4, max=30, message="Tamanho deve ser entre 4 e 30 caracteres")
	private String nascionalidade;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=30, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String cpf;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email(message="Email inválido!")
	private String email;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=10, max=20, message="Tamanho deve ser entre 10 e 20 caracteres")
	private String carteiraTrabalho;
	
	
	private Date dataAdmissao;
	
	public FuncionarioDTO() {
		
	}
	
	public FuncionarioDTO(Funcionario obj) {
		id = obj.getCodigo();
		nome = obj.getNome();
		nascimento = obj.getNascimento();
		nascionalidade = obj.getNascionalidade();
		cpf = obj.getCpf();
		email = obj.getEmail();
		carteiraTrabalho = obj.getCarteiraTrabalho();
		dataAdmissao = obj.getDataAdmissao();
		
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
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}
	
	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}
	
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
