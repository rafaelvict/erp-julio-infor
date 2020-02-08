package com.erp.adm.enums;

public enum TipoOperacionalNf {
	
	DEVOLUCAO(1, "Devolução"),
	VENDA(2, "Venda"),
	AJUSTE(3, "Ajuste"),
	COMPLEMENTAR(4, "Complementar");
	
	private int codigo;
	private String descricao;
	
	private TipoOperacionalNf(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoOperacionalNf toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoOperacionalNf x: TipoOperacionalNf.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
}
