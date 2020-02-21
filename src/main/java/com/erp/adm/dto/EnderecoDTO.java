package com.erp.adm.dto;

import java.io.Serializable;

import com.erp.adm.domain.Endereco;
import com.erp.adm.enums.TipoEndereco;

public class EnderecoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String rua;
	private int numero;
	private String bairro;
	private String complemento;
	private String cep;
	private Integer tipo;
	
	public EnderecoDTO() {
		
	}
	
	public EnderecoDTO(Endereco obj) {
		id = obj.getCodigo();
		rua = obj.getRua();
		numero = obj.getNumero();
		bairro = obj.getBairro();
		complemento = obj.getComplemento();
		cep = obj.getCep();
		tipo = obj.getTipo().getCod();
	}

	public EnderecoDTO(Long id, String rua, int numero, String bairro, String complemento, String cep, TipoEndereco tipo) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.tipo = tipo.getCod();
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
