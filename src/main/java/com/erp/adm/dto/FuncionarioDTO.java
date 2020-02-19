package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import com.erp.adm.domain.Funcionario;
import com.erp.adm.enums.TipoEstadoCivil;
import com.erp.adm.enums.TipoSexo;

public class FuncionarioDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private Date nascimento;
	private String nascionalidade;
	private String cpf;
	private String email;
	private Integer estadoCivil;
	private Integer sexo;
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
		estadoCivil = obj.getEstadoCivil().getCodigo();
		sexo = obj.getSexo().getCod();
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
	
	public TipoEstadoCivil getEstadoCivil() {
		return TipoEstadoCivil.toEnum(estadoCivil);
	}
	
	public void setEstadoCivil(TipoEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil.getCodigo();
	}
	
	public TipoSexo getSexo() {
		return TipoSexo.toEnum(sexo);
	}
	
	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo.getCod();
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
