package com.erp.adm.enums;

public enum TipoUnidade {

	CAIXA(1, "Caixa"),
	FRASCO(2, "Frasco"),
	COMPRIMIDO(3, "Comprimido"),
	GALOES(4, "Galões"),
	AMPOLA(5, "Ampola");
	
	private int codigo;
	private String descricao;
	
	
	private TipoUnidade(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoUnidade toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoUnidade x: TipoUnidade.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
}
