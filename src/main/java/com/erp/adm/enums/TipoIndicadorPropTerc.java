package com.erp.adm.enums;

public enum TipoIndicadorPropTerc {
	
	PROPRIO(1, "Próprio"),
	TERCEIROS(2, "Terceiros");
	
	private int codigo;
	private String descricao;
	
	private TipoIndicadorPropTerc(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoIndicadorPropTerc toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoIndicadorPropTerc x: TipoIndicadorPropTerc.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
}
