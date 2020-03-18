package com.erp.adm.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.RamoAtividade;

public class RamoAtividadeDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;

	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=100, message="Tamanho deve ser entre 5 e 100 caracteres")
	private String descricaoRamo;
	
	public RamoAtividadeDTO() {
		
	}

	public RamoAtividadeDTO(RamoAtividade obj) {
		id = obj.getCodigo();
		descricaoRamo = obj.getDescricaoRamo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoRamo() {
		return descricaoRamo;
	}

	public void setDescricaoRamo(String descricaoRamo) {
		this.descricaoRamo = descricaoRamo;
	}
	
	
}
