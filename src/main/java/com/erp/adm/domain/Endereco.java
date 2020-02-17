package com.erp.adm.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.erp.adm.domain.Cidade;

import com.erp.adm.enums.TipoEndereco;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Endereco extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(length = 40, nullable = false)
	private String rua;
	
	@Column(length = 10, nullable = false)
	private int numero;
	
	@Column(length = 40, nullable = false)
	private String bairro;
	
	@Column(length = 30, nullable = false)
	private String complemento;
	
	@Column(length = 30, nullable = false)
	private String cep;
	
	@Column(nullable = false)
	private Integer tipo;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Cidade cidade;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(nullable = false)
	private Empresa empresa;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(nullable = true)
	private Funcionario funcionario;
	
	
	public Endereco() {
		
	}

	public Endereco(String rua, int numero, String bairro, String complemento, String cep, TipoEndereco tipo, Cidade cidade, Empresa empresa, Funcionario funcionario) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.tipo = tipo.getCod();
		this.cidade = cidade;
		this.empresa = empresa;
		this.funcionario = funcionario;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public TipoEndereco getTipo() {
		return TipoEndereco.toEnum(tipo);
	}

	public void setTipo(TipoEndereco tipo) {
		this.tipo = tipo.getCod();
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
}
