package com.erp.adm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.erp.adm.enums.TipoUsuario;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Usuario extends GenericDomain implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Float redComissao;
	private Float maxComissao;
	private Float redComissaoDataC1;
	private Float redComissaoDataC2;
	private Date dataAltera;
	
	@JsonIgnore
	private String senha;
	private String crf;
	private Date contaDtInicio;
	private Integer qtdVendaData;
	private String codCartao;
	private String loginFarmaPop;
	
	@JsonIgnore
	private String senhaFarmaPop;
	private Integer tipo;
	private boolean ativo;
	
	@Transient
	private String senhaSemCriptografia;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="funcionario_id")
	private Funcionario funcionario;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="proprietarioSocio_id")
	private ProprietarioSocio proprietarioSocio;
	
	public Usuario() {
		
	}

	public Usuario(Float redComissao, Float maxComissao, Float redComissaoDataC1, Float redComissaoDataC2, Date dataAltera, String senha, String crf, Date contaDtInicio, Integer qtdVendaData,
			String codCartao, String loginFarmaPop, String senhaFarmaPop, String senhaSemCriptografia,
			Funcionario funcionario, boolean ativo, TipoUsuario tipo, ProprietarioSocio proprietarioSocio) {
		super();
		this.redComissao = redComissao;
		this.maxComissao = maxComissao;
		this.redComissaoDataC1 = redComissaoDataC1;
		this.redComissaoDataC2 = redComissaoDataC2;
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
		this.tipo = tipo.getCodigo();
		this.proprietarioSocio = proprietarioSocio;
	}

	public Float getRedComissao() {
		return redComissao;
	}

	public void setRedComissao(Float redComissao) {
		this.redComissao = redComissao;
	}

	public Float getMaxComissao() {
		return maxComissao;
	}

	public void setMaxComissao(Float maxComissao) {
		this.maxComissao = maxComissao;
	}

	public Float getRedComissaoDataC1() {
		return redComissaoDataC1;
	}

	public void setRedComissaoDataC1(Float redComissaoDataC1) {
		this.redComissaoDataC1 = redComissaoDataC1;
	}

	public Float getRedComissaoDataC2() {
		return redComissaoDataC2;
	}

	public void setRedComissaoDataC2(Float redComissaoDataC2) {
		this.redComissaoDataC2 = redComissaoDataC2;
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


	public TipoUsuario getTipo() {
		return TipoUsuario.toEnum(tipo);
	}
	
	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo.getCodigo();
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public ProprietarioSocio getProprietarioSocio() {
		return proprietarioSocio;
	}

	public void setProprietarioSocio(ProprietarioSocio proprietarioSocio) {
		this.proprietarioSocio = proprietarioSocio;
	}
	
	
	
}
