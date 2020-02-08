package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.erp.adm.enums.TipoTelefone;

@Entity
public class Telefone extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(length = 3, nullable = false)
	private int ddd;
	
	@Column(length = 30, nullable = false)
	private String telefone;
	
	@Column(length = 50, nullable = false)
	private Integer tipo;
	
	@Column(nullable = false)
	private Boolean log;
	
	@Column(length = 12, nullable = false)
	private Date data_altera;
	
	@ManyToOne
	@JoinColumn(nullable = true)
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(nullable = true)
	private Funcionario funcionario;


	public Telefone() {
		
	}

	public Telefone(int ddd, String telefone, TipoTelefone tipo, Boolean log, Date data_altera, Empresa empresa, Funcionario funcionario) {
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

	public void setDdd(int ddd) {
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

	public Boolean getLog() {
		return log;
	}

	public void setLog(Boolean log) {
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
