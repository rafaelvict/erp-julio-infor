package com.erp.adm.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.PerfilCliente;

public class PerfilClienteDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=10, max=50, message="Tamanho deve ser entre 10 e 50 caracteres")
	private String descricaoPerf;
	
	
	private Date dtPrimComp;
	
	private Date dtUltComp;
	
	@NotNull
	private Float desconto;
	
	@NotNull
	private Float descMaxVista;
	
	@NotNull
	private Float descMaxPrazo;
	
	@NotNull
	private boolean somenteVista;
	
	public PerfilClienteDTO() {
		
	}

	public PerfilClienteDTO(PerfilCliente obj) {
		id = obj.getCodigo();
		descricaoPerf = obj.getDescricaoPerf();
		dtPrimComp = obj.getDtPrimComp();
		dtUltComp = obj.getDtUltComp();
		desconto = obj.getDesconto();
		descMaxPrazo = obj.getDescMaxPrazo();
		descMaxVista = obj.getDescMaxVista();
		somenteVista = obj.isSomenteVista();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoPerf() {
		return descricaoPerf;
	}

	public void setDescricaoPerf(String descricaoPerf) {
		this.descricaoPerf = descricaoPerf;
	}

	public Date getDtPrimComp() {
		return dtPrimComp;
	}

	public void setDtPrimComp(Date dtPrimComp) {
		this.dtPrimComp = dtPrimComp;
	}

	public Date getDtUltComp() {
		return dtUltComp;
	}

	public void setDtUltComp(Date dtUltComp) {
		this.dtUltComp = dtUltComp;
	}

	public Float getDesconto() {
		return desconto;
	}

	public void setDesconto(Float desconto) {
		this.desconto = desconto;
	}

	public Float getDescMaxVista() {
		return descMaxVista;
	}

	public void setDescMaxVista(Float descMaxVista) {
		this.descMaxVista = descMaxVista;
	}

	public Float getDescMaxPrazo() {
		return descMaxPrazo;
	}

	public void setDescMaxPrazo(Float descMaxPrazo) {
		this.descMaxPrazo = descMaxPrazo;
	}

	public boolean isSomenteVista() {
		return somenteVista;
	}

	public void setSomenteVista(boolean somenteVista) {
		this.somenteVista = somenteVista;
	}
	
	
}
