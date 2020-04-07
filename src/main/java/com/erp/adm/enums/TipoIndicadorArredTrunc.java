package com.erp.adm.enums;

public enum TipoIndicadorArredTrunc {

	ARRENDODAMENTO(1, "Arrendodamento"),
	TRUNCAMENTO(2, "Truncamento");
	
	private int codigo;
	private String descricao;
	
	private TipoIndicadorArredTrunc(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoIndicadorArredTrunc toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoIndicadorArredTrunc x: TipoIndicadorArredTrunc.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
}
