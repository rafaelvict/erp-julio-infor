package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import com.erp.adm.domain.Usuario;

public class UsuarioDTO  implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String crf;
	private Date contaDtInicio;
	private Integer qtdVendaData;
	private String codCartao;
	private String loginFarmaPop;
	private Character tipo;
	private Boolean ativo;
	
	public UsuarioDTO() {
		
	}
	
	public UsuarioDTO(Usuario obj) {
		id = obj.getCodigo();
		crf = obj.getCrf();
		contaDtInicio = obj.getContaDtInicio();
		qtdVendaData = obj.getQtdVendaData();
		codCartao = obj.getCodCartao();
		loginFarmaPop = obj.getLoginFarmaPop();
		tipo = obj.getTipo();
		ativo = obj.getAtivo();
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

	public Character getTipo() {
		return tipo;
	}

	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
