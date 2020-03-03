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
	private Integer tipo;
	private boolean log;
	private Date data_altera;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="funcionario_id")
	private Funcionario funcionario;


	public Telefone() {
		
	}
	
	public Telefone(Integer ddd, String telefone, TipoTelefone tipo) {
		this.ddd = ddd;
		this.telefone = telefone;
		this.tipo = tipo.getCod();
	}

	public Telefone(Integer ddd, String telefone, TipoTelefone tipo, boolean log, Date data_altera, Empresa empresa, Funcionario funcionario) {
		super();
		this.ddd = ddd;
		this.telefone = telefone;
		this.tipo = tipo.getCod();
		this.log = log;
		this.data_altera = data_altera;
		this.empresa = empresa;
		this.funcionario = funcionario;
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
		return TipoTelefone.toEnum(tipo);
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo.getCod();
	}

	public boolean getLog() {
		return log;
	}

	public void setLog(boolean log) {
		this.log = log;
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

	
	
	
}
