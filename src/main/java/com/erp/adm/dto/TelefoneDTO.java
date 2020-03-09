package com.erp.adm.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.Telefone;
import com.erp.adm.enums.TipoTelefone;

public class TelefoneDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotNull
	private Integer ddd;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=8, max=30, message="Tamanho deve ser entre 8 e 30 caracteres")
	private String telefone;

	
	public TelefoneDTO() {
		
	}
	
	public TelefoneDTO(Telefone obj) {		id = obj.getCodigo();
		ddd = obj.getDdd();
		telefone = obj.getTelefone();
	}
	
	
	public TelefoneDTO(Long id, Integer ddd, String telefone, TipoTelefone tipo) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.telefone = telefone;
	}
		

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
