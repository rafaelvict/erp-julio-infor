package com.erp.adm.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.erp.adm.enums.TipoEndereco;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Endereco extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	private String rua;
	private Integer numero;
	private String bairro;
	private String complemento;
	private String cep;
	private Integer tipo_End;
	
	@OneToOne
	@JoinColumn(name="cidade_id")
	private Cidade cidade;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="funcionario_id")
	private Funcionario funcionario;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="proprietarioSocio_id")
	private ProprietarioSocio proprietarioSocio;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	
	public Endereco() {
		
	}

	public Endereco(String rua, Integer numero, String bairro, String complemento, String cep, TipoEndereco tipo_End, Cidade cidade, Empresa empresa,
			Funcionario funcionario, ProprietarioSocio proprietarioSocio, Cliente cliente) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.tipo_End = (tipo_End==null) ? null : tipo_End.getCod();
		this.cidade = cidade;
		this.empresa = empresa;
		this.funcionario = funcionario;
		this.proprietarioSocio = proprietarioSocio;
		this.cliente = cliente;
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

	public void setNumero(Integer numero) {
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
		return TipoEndereco.toEnum(tipo_End);
	}

	public void setTipo(TipoEndereco tipo_End) {
		this.tipo_End = tipo_End.getCod();
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

	public ProprietarioSocio getProprietarioSocio() {
		return proprietarioSocio;
	}

	public void setProprietarioSocio(ProprietarioSocio proprietarioSocio) {
		this.proprietarioSocio = proprietarioSocio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
