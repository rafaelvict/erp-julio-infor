package com.erp.adm.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.Telefone;
import com.erp.adm.enums.TipoTelefone;

public class TelefoneDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=3, max=3, message="Tamanho deve ser de 3 caracteres")
	private Integer ddd;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=8, max=30, message="Tamanho deve ser entre 8 e 30 caracteres")
	private String telefone;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=10, message="Tamanho deve ser entre 5 e 10 caracteres")
	private Integer tipo;

	
	public TelefoneDTO() {
		
	}
	
	public TelefoneDTO(Telefone obj) {		id = obj.getCodigo();
		ddd = obj.getDdd();
		telefone = obj.getTelefone();
		tipo = obj.getTipo().getCod();
	}
	
	
	public TelefoneDTO(Long id, Integer ddd, String telefone, TipoTelefone tipo) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.telefone = telefone;
		this.tipo = tipo.getCod();
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

	public TipoTelefone getTipo() {
		return TipoTelefone.toEnum(tipo);
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo.getCod();
	}
	
	
	
	
}
