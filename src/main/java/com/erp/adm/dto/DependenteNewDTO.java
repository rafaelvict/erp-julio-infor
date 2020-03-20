package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

public class DependenteNewDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=50, message="Tamanho deve ser entre 10 e 50 caracteres")
	private String nomeDep;
	
	@CPF
	private String cpf;
	
	private String rg;
	
	@Length(max=1, message="Tamanho deve ser de 1 caractere")
	private String status;
	
	@Length(max=20, message="Tamanho deve ser de no máximo 20 caracteres")
	private String cor;
	
	@Length(max=30, message="Tamanho deve ser de no máximo 30 caracteres")
	private String racaAnimal;
	
	@NotNull
	private Integer tipoDep;
	
	private Date dataCad;
	
	private Date nascimento;
	
	private Date dataAltera;
	
	private Integer tipoAnimal;
	
	private Integer tipoSexo;
	
	private Integer tipoPorte;
	
	private boolean vivo;
	
	@Length(max=50, message="Tamanho deve ser de no máximo 50 caracteres")
	private String obs;
	
	@Length(max=50, message="Tamanho deve ser de no máximo 50 caracteres")
	private String obs2;
	
	//Detalhes Gerais
	@Length(max=50, message="Tamanho deve ser de no máximo 50 caracteres")
	private String descricao;
	
	private Date dtAltera;
	
	//Cliente
	private Long clienteId;
	
	//GrupoDetalhes
	private Long grupoId;
	
	public DependenteNewDTO() {
		
	}

	public String getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getRacaAnimal() {
		return racaAnimal;
	}

	public void setRacaAnimal(String racaAnimal) {
		this.racaAnimal = racaAnimal;
	}

	public Integer getTipoDep() {
		return tipoDep;
	}

	public void setTipoDep(Integer tipoDep) {
		this.tipoDep = tipoDep;
	}

	public Date getDataCad() {
		return dataCad;
	}

	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public Date getDataAltera() {
		return dataAltera;
	}

	public void setDataAltera(Date dataAltera) {
		this.dataAltera = dataAltera;
	}

	public Integer getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(Integer tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public Integer getTipoSexo() {
		return tipoSexo;
	}

	public void setTipoSexo(Integer tipoSexo) {
		this.tipoSexo = tipoSexo;
	}

	public Integer getTipoPorte() {
		return tipoPorte;
	}

	public void setTipoPorte(Integer tipoPorte) {
		this.tipoPorte = tipoPorte;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getObs2() {
		return obs2;
	}

	public void setObs2(String obs2) {
		this.obs2 = obs2;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDtAltera() {
		return dtAltera;
	}

	public void setDtAltera(Date dtAltera) {
		this.dtAltera = dtAltera;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public Long getGrupoId() {
		return grupoId;
	}

	public void setGrupoId(Long grupoId) {
		this.grupoId = grupoId;
	}
	
	

}
