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
	private Integer tipoEnd;
	
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
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="fabricante_id")
	private Fabricante fabricante;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "transp_id")
	private Transp transp;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "fornecedor_id")
	private Fornecedor fornecedor;
	
	
	public Endereco() {
		
	}

	public Endereco(String rua, Integer numero, String bairro, String complemento, String cep, TipoEndereco tipoEnd, Cidade cidade, Empresa empresa,
			Funcionario funcionario, ProprietarioSocio proprietarioSocio, Cliente cliente, Fabricante fabricante, Transp transp, Fornecedor fornecedor) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.tipoEnd = (tipoEnd==null) ? null : tipoEnd.getCod();
		this.cidade = cidade;
		this.empresa = empresa;
		this.funcionario = funcionario;
		this.proprietarioSocio = proprietarioSocio;
		this.cliente = cliente;
		this.fabricante = fabricante;
		this.transp = transp;
		this.fornecedor = fornecedor;
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

	public TipoEndereco getTipoEnd() {
		return TipoEndereco.toEnum(tipoEnd);
	}

	public void setTipoEnd(TipoEndereco tipoEnd) {
		this.tipoEnd = tipoEnd.getCod();
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

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Transp getTransp() {
		return transp;
	}

	public void setTransp(Transp transp) {
		this.transp = transp;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
