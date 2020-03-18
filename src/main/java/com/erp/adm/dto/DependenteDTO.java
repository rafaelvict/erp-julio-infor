package com.erp.adm.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import com.erp.adm.domain.Dependente;

public class DependenteDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=10, max=50, message="Tamanho deve ser entre 10 e 50 caracteres")
	private String nomeDep;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@CPF
	private String cpf;
	
	@NotEmpty(message="Preenchimento obrigatório")
	private String rg;
	
	private String cor;
	
	private String racaAnimal;

	public DependenteDTO() {
		
	}
	
	public DependenteDTO(Dependente obj) {
		id = obj.getCodigo();
		nomeDep = obj.getNomeDep();
		cpf = obj.getCpf();
		rg = obj.getRg();
		cor = obj.getCor();
		racaAnimal = obj.getRacaAnimal();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	
}
