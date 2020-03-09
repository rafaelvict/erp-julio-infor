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
	private Date data_altera;
	
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


	public Telefone() {
		
	}

	public Telefone(Integer ddd, String telefone, TipoTelefone tipo_Tel, Date data_altera, Empresa empresa,
			Funcionario funcionario, ProprietarioSocio proprietarioSocio) {
		super();
		this.ddd = ddd;
		this.telefone = telefone;
		this.tipo_Tel = (tipo_Tel==null) ? null : tipo_Tel.getCod();
		this.data_altera = data_altera;
		this.empresa = empresa;
		this.funcionario = funcionario;
		this.proprietarioSocio = proprietarioSocio;
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
	public Date getData_altera() {
		return data_altera;
	}

	public void setData_altera(Date data_altera) {
		this.data_altera = data_altera;
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

	
	
	
}
