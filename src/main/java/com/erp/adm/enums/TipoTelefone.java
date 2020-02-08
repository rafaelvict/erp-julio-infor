package com.erp.adm.enums;

public enum TipoTelefone {
	
	
	TELEFONE_CELULAR(1,"Telefone Celular"),
	TELEFONE_FIXO(2, "Telefone Fixo"),
	TELEFONE_COMERCIAL(3, "Telefone Comercial");
	
	private int cod;
	private String descricao;
	
	private TipoTelefone(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoTelefone toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoTelefone x: TipoTelefone.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
}
