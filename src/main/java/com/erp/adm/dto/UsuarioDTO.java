package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.Usuario;

public class UsuarioDTO extends FuncionarioDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@Length(max=20, message="Tamanho deve ser de 20 caracteres")
	private String crf;
	
	@Length(max=8, message="Tamanho deve ser de 8 caracteres")
	private Date contaDtInicio;
	
	@Length(max=10, message="Tamanho deve ser de 10 caracteres")
	private Integer qtdVendaData;
	
	@Length(max=15, message="Tamanho deve ser de 15 caracteres")
	private String codCartao;
	
	@Length(max=20, message="Tamanho deve ser de 20 caracteres")
	private String loginFarmaPop;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=1, max=1, message="Tamanho deve ser de 1 caractere")
	private Character tipo;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=1, max=1, message="Tamanho deve ser de 1 caractere")
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
