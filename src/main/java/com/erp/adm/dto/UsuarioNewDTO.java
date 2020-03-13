package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UsuarioNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=20, message="Tamanho deve ser de 20 caracteres")
	private String crf;
	
	
	private Date contaDtInicio;
	
	@NotNull
	private Integer qtdVendaData;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=15, message="Tamanho deve ser de 15 caracteres")
	private String codCartao;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=20, message="Tamanho deve ser de 20 caracteres")
	private String loginFarmaPop;
	
	@NotNull
	private Float redComissao;
	
	@NotNull
	private Float maxComissao;
	
	@NotNull
	private Float redComissaoDataC1;
	
	@NotNull
	private Float redComissaoDataC2;
	
	private Date dataAltera;
	
	@NotNull
	private Integer tipo;
	
	@NotNull
	private boolean ativo;
	
	@JsonIgnore
	private String senha;
	
	@JsonIgnore
	private String senhaFarmaPop;
	
	@Transient
	private String senhaSemCriptografia;
	
	//Funcionario
	@NotNull
	private Long funcId;
	
	
	public UsuarioNewDTO() {
		
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

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Long getFuncId() {
		return funcId;
	}

	public void setFuncId(Long funcId) {
		this.funcId = funcId;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	
}
