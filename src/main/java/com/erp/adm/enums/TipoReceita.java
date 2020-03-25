package com.erp.adm.enums;

public enum TipoReceita {

	RECEITAAMARELA(1, "Receita Amarela"),
	RECEITAAZUL(2, "Receita Azul"),
	RECEITABRANCA(3, "Receita Branca");
	
	private int codigo;
	private String descricao;
	
	private TipoReceita(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoReceita toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(TipoReceita x: TipoReceita.values()) {
			if(codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ codigo);
	}
}
