package com.erp.adm.dto;

import java.io.Serializable;

import com.erp.adm.domain.Empresa;

public class EmpresaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String cnpjRaiz;
	private String cnpjOrdem;
	private Integer insc_Estadual;
	private Integer insc_Municipal;
	private String email;
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
