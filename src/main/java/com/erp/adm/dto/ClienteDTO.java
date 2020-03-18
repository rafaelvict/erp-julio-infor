package com.erp.adm.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.Cliente;
import com.erp.adm.services.validation.ClienteUpdate;

@ClienteUpdate
public class ClienteDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=2, max=30, message="Tamanho deve ser entre 2 e 30 caracteres")
	private String nome;
	
	@NotEmpty(message="Preenchimento obrigatório")
	private String cpfCnpj;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Email(message="Email inválido!")
	private String email;
	
	@NotNull
	private boolean ativo;
	
	@NotNull
	private Integer insc_Estadual;
	
	@NotNull
	private Integer insc_Municipal;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(max=50, message="Tamanho deve ser de 50 caracteres")
	private String fantasia;
	
	public ClienteDTO() {
		
	}
	
	public ClienteDTO(Cliente obj) {
		id = obj.getCodigo();
		nome = obj.getNome();
		cpfCnpj = obj.getCpfCnpj();
		email = obj.getEmail();
		ativo = obj.isAtivo();
		insc_Estadual = obj.getInsc_Estadual();
		insc_Municipal = obj.getInsc_Municipal();
		fantasia = obj.getFantasia();
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

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
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

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	
	
	
}
