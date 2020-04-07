package com.erp.adm.dto;


import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import com.erp.adm.domain.Produto;
import com.sun.istack.NotNull;

public class ProdutoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@Length(max=50, message="Tamanho deve ser de aé 50 caracteres")
	private String descricao;
	
	@Length(max=15, message="Tamanho deve ser até 15 caracteres")
	private String codBarra;
	
	@Length(min=1, max=1, message="Tamanho deve ser de 1 caractere")
	private String abc;
	
	@Length(max=12, message="Tamanho deve ser entre 2 e 50 caracteres")
	private String ncm;
	
	@NotNull
	private Integer precoCompraCaixa;
	
	@NotNull
	private Integer precoVendaCaixa;
	
	@NotNull
	private Integer comissao;
	
	@NotNull
	private Double precoAnt;
	
	@NotNull
	private Double precoMedioCompra;
	
	private Integer estMin;
	
	private Integer estMax;
	
	public ProdutoDTO() {
		
	}
	
	public ProdutoDTO(Produto obj) {
		id = obj.getCodigo();
		descricao = obj.getDescricao();
		codBarra = obj.getCodBarra();
		abc = obj.getAbc();
		ncm = obj.getNcm();
		precoCompraCaixa = obj.getPrecoCompraCaixa();
		precoVendaCaixa = obj.getPrecoVendaCaixa();
		comissao = obj.getComissao();
		precoAnt = obj.getPrecoAnt();
		precoMedioCompra = obj.getPrecoMedioCompra();
		estMin  = obj.getEstMin();
		estMax = obj.getEstMax();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodBarra() {
		return codBarra;
	}

	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}

	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public Integer getPrecoCompraCaixa() {
		return precoCompraCaixa;
	}

	public void setPrecoCompraCaixa(Integer precoCompraCaixa) {
		this.precoCompraCaixa = precoCompraCaixa;
	}

	public Integer getPrecoVendaCaixa() {
		return precoVendaCaixa;
	}

	public void setPrecoVendaCaixa(Integer precoVendaCaixa) {
		this.precoVendaCaixa = precoVendaCaixa;
	}

	public Integer getComissao() {
		return comissao;
	}

	public void setComissao(Integer comissao) {
		this.comissao = comissao;
	}

	public Double getPrecoAnt() {
		return precoAnt;
	}

	public void setPrecoAnt(Double precoAnt) {
		this.precoAnt = precoAnt;
	}

	public Double getPrecoMedioCompra() {
		return precoMedioCompra;
	}

	public void setPrecoMedioCompra(Double precoMedioCompra) {
		this.precoMedioCompra = precoMedioCompra;
	}

	public Integer getEstMin() {
		return estMin;
	}

	public void setEstMin(Integer estMin) {
		this.estMin = estMin;
	}

	public Integer getEstMax() {
		return estMax;
	}

	public void setEstMax(Integer estMax) {
		this.estMax = estMax;
	}
	
	
}
