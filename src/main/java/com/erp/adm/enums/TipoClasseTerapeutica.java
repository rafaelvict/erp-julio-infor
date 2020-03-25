package com.erp.adm.enums;

public enum TipoClasseTerapeutica {

	ANTIMICROBIANOS(1, "Antimicrobianos"),
	SUJEITOACONTROLEESPECIAL(2, "Sujeito a controle especial");
	
	private int codigo;
	private String descricao;
	
	private TipoClasseTerapeutica(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoClasseTerapeutica toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoClasseTerapeutica x: TipoClasseTerapeutica.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
}
