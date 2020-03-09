package com.erp.adm.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import com.erp.adm.domain.Empresa;

public class EmpresaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=50, message="Tamanho deve ser entre 2 e 50 caracteres")
	private String nome;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@CNPJ
	private String cnpj;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=9, max=9, message="Tamanho deve ser de 6 caracteres")
	private String insc_Estadual;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=11, max=11, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String insc_Municipal;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email(message="Email inválido!")
	private String email;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=9, max=9, message="Tamanho deve ser de 9  caracteres")
	private String codigo_Ibge;
	
	public EmpresaDTO() {
		
	}
	
	public EmpresaDTO(Empresa obj) {
		id = obj.getCodigo();
		nome = obj.getNome();
		cnpj = obj.getCnpj();
		insc_Estadual = obj.getInsc_Estadual();
		insc_Municipal = obj.getInsc_Municipal();
		email = obj.getEmail();
		codigo_Ibge = obj.getCodigo_Ibge();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInsc_Estadual() {
		return insc_Estadual;
	}

	public void setInsc_Estadual(String insc_Estadual) {
		this.insc_Estadual = insc_Estadual;
	}

	public String getInsc_Municipal() {
		return insc_Municipal;
	}

	public void setInsc_Municipal(String insc_Municipal) {
		this.insc_Municipal = insc_Municipal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodigo_Ibge() {
		return codigo_Ibge;
	}

	public void setCodigo_Ibge(String codigo_Ibge) {
		this.codigo_Ibge = codigo_Ibge;
	}
	
	
}
