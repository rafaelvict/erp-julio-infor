package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.erp.adm.enums.TipoTelefone;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Telefone extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer ddd;
	private String telefone;
	private Integer tipo_Tel;
	private Date dataAlteraTel;
	
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

	public Telefone() {
		
	}

	public Telefone(Integer ddd, String telefone, TipoTelefone tipo_Tel, Date dataAlteraTel, Empresa empresa,
			Funcionario funcionario, ProprietarioSocio proprietarioSocio, Cliente cliente, Fabricante fabricante, Transp transp) {
		super();
		this.ddd = ddd;
		this.telefone = telefone;
		this.tipo_Tel = (tipo_Tel==null) ? null : tipo_Tel.getCod();
		this.dataAlteraTel = dataAlteraTel;
		this.empresa = empresa;
		this.funcionario = funcionario;
		this.proprietarioSocio = proprietarioSocio;
		this.cliente = cliente;
		this.fabricante = fabricante;
		this.transp = transp;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public TipoTelefone getTipo() {
		return TipoTelefone.toEnum(tipo_Tel);
	}

	public void setTipo(TipoTelefone tipo_Tel) {
		this.tipo_Tel = tipo_Tel.getCod();
	}

	public Date getDataAlteraTel() {
		return dataAlteraTel;
	}

	public void setDataAlteraTel(Date dataAlteraTel) {
		this.dataAlteraTel = dataAlteraTel;
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
	
	
}
