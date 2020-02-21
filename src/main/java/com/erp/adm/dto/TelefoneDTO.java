package com.erp.adm.dto;

import java.io.Serializable;

import com.erp.adm.domain.Telefone;
import com.erp.adm.enums.TipoTelefone;

public class TelefoneDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer ddd;
	private String telefone;
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
