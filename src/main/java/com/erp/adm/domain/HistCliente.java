package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class HistCliente extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Date data;
	private Float valorAntigo;
	private Float valorNovo;
	private String nomeCampo;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="usuarioVenda_id")
	private Usuario usuario;
	
	
	public HistCliente() {
		
	}
	
	public HistCliente(Date data, Float valorAntigo, Float valorNovo, String nomeCampo, Cliente cliente,
			Usuario usuario) {
		super();
		this.data = data;
		this.valorAntigo = valorAntigo;
		this.valorNovo = valorNovo;
		this.nomeCampo = nomeCampo;
		this.cliente = cliente;
		this.usuario = usuario;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Float getValorAntigo() {
		return valorAntigo;
	}


	public void setValorAntigo(Float valorAntigo) {
		this.valorAntigo = valorAntigo;
	}


	public Float getValorNovo() {
		return valorNovo;
	}


	public void setValorNovo(Float valorNovo) {
		this.valorNovo = valorNovo;
	}


	public String getNomeCampo() {
		return nomeCampo;
	}


	public void setNomeCampo(String nomeCampo) {
		this.nomeCampo = nomeCampo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
