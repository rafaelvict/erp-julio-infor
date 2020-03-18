package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.HistCliente;

public class HistClienteDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private Date data;
	
	@NotNull
	private Float valorAntigo;
	
	@NotNull
	private Float valorNovo;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=3, max=20, message="Tamanho deve ser entre 3 e 20 caracteres")
	private String nomeCampo;
	
	public HistClienteDTO() {
		
	}
	
	public HistClienteDTO(HistCliente obj) {
		id = obj.getCodigo();
		data = obj.getData();
		valorAntigo = obj.getValorAntigo();
		valorNovo = obj.getValorNovo();
		nomeCampo = obj.getNomeCampo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Float getValorAntigo() {
		return valorAntigo;
	}

	public void setValorAntigo(Float valorAntigo) {
		this.valorAntigo = valorAntigo;
	}

	public Float getValorNovo() {
		return valorNovo;
	}

	public void setValorNovo(Float valorNovo) {
		this.valorNovo = valorNovo;
	}

	public String getNomeCampo() {
		return nomeCampo;
	}

	public void setNomeCampo(String nomeCampo) {
		this.nomeCampo = nomeCampo;
	}
	
	
}
