package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Usuario extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(length = 30, nullable = false)
	private String redComissao;
	
	@Column(nullable = false)
	private Float maxComissao;
	
	@Column(nullable = false)
	private Integer redComissaoDataC1;
	
	@Column(nullable = false)
	private Integer redComissaoDataC2;
	
	@Column(nullable = false)
	private boolean log;
	
	@Column(nullable = false)
	private Date dataAltera;
	
	@Column(length = 100, nullable = false)
	private String senha;
	
	@Column(length = 30, nullable = false)
	private String crf;
	
	@Column(nullable = false)
	private Date contaDtInicio;
	
	@Column(nullable = false)
	private Integer qtdVendaData;
	
	@Column(length = 20, nullable = false)
	private String codCartao;
	
	@Column(length = 20, nullable = false)
	private String loginFarmaPop;
	
	@Column(length = 10, nullable = false)
	private String senhaFarmaPop;
	
	@Transient
	private String senhaSemCriptografia;
	
	@Column(nullable = false)
	private Character tipo;
	
	@Column(nullable = false)
	private Boolean ativo;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Funcionario funcionario;
	
	public Usuario() {
		
	}

	public Usuario(String redComissao, Float maxComissao, Integer redComissaoDataC1, Integer redComissaoDataC2,
			boolean log, Date dataAltera, String senha, String crf, Date contaDtInicio, Integer qtdVendaData,
			String codCartao, String loginFarmaPop, String senhaFarmaPop, String senhaSemCriptografia,
			Funcionario funcionario, Boolean ativo, Character tipo) {
		super();
		this.redComissao = redComissao;
		this.maxComissao = maxComissao;
		this.redComissaoDataC1 = redComissaoDataC1;
		this.redComissaoDataC2 = redComissaoDataC2;
		this.log = log;
		this.dataAltera = dataAltera;
		this.senha = senha;
		this.crf = crf;
		this.contaDtInicio = contaDtInicio;
		this.qtdVendaData = qtdVendaData;
		this.codCartao = codCartao;
		this.loginFarmaPop = loginFarmaPop;
		this.senhaFarmaPop = senhaFarmaPop;
		this.senhaSemCriptografia = senhaSemCriptografia;
		this.funcionario = funcionario;
		this.ativo = ativo;
		this.tipo = tipo;
	}

	public String getRedComissao() {
		return redComissao;
	}

	public void setRedComissao(String redComissao) {
		this.redComissao = redComissao;
	}

	public Float getMaxComissao() {
		return maxComissao;
	}

	public void setMaxComissao(Float maxComissao) {
		this.maxComissao = maxComissao;
	}

	public Integer getRedComissaoDataC1() {
		return redComissaoDataC1;
	}

	public void setRedComissaoDataC1(Integer redComissaoDataC1) {
		this.redComissaoDataC1 = redComissaoDataC1;
	}

	public Integer getRedComissaoDataC2() {
		return redComissaoDataC2;
	}

	public void setRedComissaoDataC2(Integer redComissaoDataC2) {
		this.redComissaoDataC2 = redComissaoDataC2;
	}

	public boolean isLog() {
		return log;
	}

	public void setLog(boolean log) {
		this.log = log;
	}

	public Date getDataAltera() {
		return dataAltera;
	}

	public void setDataAltera(Date dataAltera) {
		this.dataAltera = dataAltera;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCrf() {
		return crf;
	}

	public void setCrf(String crf) {
		this.crf = crf;
	}

	public Date getContaDtInicio() {
		return contaDtInicio;
	}

	public void setContaDtInicio(Date contaDtInicio) {
		this.contaDtInicio = contaDtInicio;
	}

	public Integer getQtdVendaData() {
		return qtdVendaData;
	}

	public void setQtdVendaData(Integer qtdVendaData) {
		this.qtdVendaData = qtdVendaData;
	}

	public String getCodCartao() {
		return codCartao;
	}

	public void setCodCartao(String codCartao) {
		this.codCartao = codCartao;
	}

	public String getLoginFarmaPop() {
		return loginFarmaPop;
	}

	public void setLoginFarmaPop(String loginFarmaPop) {
		this.loginFarmaPop = loginFarmaPop;
	}

	public String getSenhaFarmaPop() {
		return senhaFarmaPop;
	}

	public void setSenhaFarmaPop(String senhaFarmaPop) {
		this.senhaFarmaPop = senhaFarmaPop;
	}

	public String getSenhaSemCriptografia() {
		return senhaSemCriptografia;
	}

	public void setSenhaSemCriptografia(String senhaSemCriptografia) {
		this.senhaSemCriptografia = senhaSemCriptografia;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public Character getTipo() {
		return tipo;
	}
	
	@Transient
	public String getTipoFormatado() {
		String tipoFormatado = null;
		
		if(tipo == 'A') {
			tipoFormatado = "Administrador";
		}else if(tipo == 'B') {
			tipoFormatado = "Balconista";
		}else if(tipo == 'G') {
			tipoFormatado = "Gerente";
		}
		return tipoFormatado;
	}

	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}

	public Boolean getAtivo() {
		return ativo;
	}
	
	public String getAtivoFormatado() {
		String ativoFormatado = "Não";
		if(ativo) {
			ativoFormatado = "Sim";
		}
		return ativoFormatado;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
}
