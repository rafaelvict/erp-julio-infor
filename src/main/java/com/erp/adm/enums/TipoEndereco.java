package com.erp.adm.enums;

public enum TipoEndereco {

	RESIDENCIAL(1, "Residencial"),
	COMERCIAL(2, "Comercial");
	
	private int cod;
	private String descricao;
	
	private TipoEndereco(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	
	public static TipoEndereco toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoEndereco x: TipoEndereco.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
}
