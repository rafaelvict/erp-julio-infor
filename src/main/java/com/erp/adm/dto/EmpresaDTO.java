package com.erp.adm.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.Empresa;

public class EmpresaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=50, message="Tamanho deve ser entre 2 e 50 caracteres")
	private String nome;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=8, max=8, message="Tamanho deve ser de 8 caracteres")
	private String cnpjRaiz;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=6, max=6, message="Tamanho deve ser de 6 caracteres")
	private String cnpjOrdem;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=20, max=20, message="Tamanho deve ser de 20 caracteres")
	private Integer insc_Estadual;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=11, max=11, message="Tamanho deve ser entre 2 e 30 caracteres")
	private Integer insc_Municipal;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=50, message="Tamanho deve ser entre 5 e 50 caracteres")
	private String email;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=9, max=9, message="Tamanho deve ser de 9  caracteres")
	private Integer codigo_Ibge;
	
	public EmpresaDTO() {
		
	}
	
	public EmpresaDTO(Empresa obj) {
		id = obj.getCodigo();
		nome = obj.getNome();
		cnpjRaiz = obj.getCnpjRaiz();
		cnpjOrdem = obj.getCnpjOrdem();
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

	public String getCnpjRaiz() {
		return cnpjRaiz;
	}

	public void setCnpjRaiz(String cnpjRaiz) {
		this.cnpjRaiz = cnpjRaiz;
	}

	public String getCnpjOrdem() {
		return cnpjOrdem;
	}

	public void setCnpjOrdem(String cnpjOrdem) {
		this.cnpjOrdem = cnpjOrdem;
	}

	public Integer getInsc_Estadual() {
		return insc_Estadual;
	}

	public void setInsc_Estadual(Integer insc_Estadual) {
		this.insc_Estadual = insc_Estadual;
	}

	public Integer getInsc_Municipal() {
		return insc_Municipal;
	}

	public void setInsc_Municipal(Integer insc_Municipal) {
		this.insc_Municipal = insc_Municipal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCodigo_Ibge() {
		return codigo_Ibge;
	}

	public void setCodigo_Ibge(Integer codigo_Ibge) {
		this.codigo_Ibge = codigo_Ibge;
	}
	
	
}
