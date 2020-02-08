package com.erp.adm.enums;

public enum TipoReceituario {

	RECEITAAMARELA(1, "Receita Amarela"),
	RECEITAAZUL(2, "Receita Azul"),
	RECEITABRANCA(3, "Receita Branca");
	
	private int codigo;
	private String descricao;
	
	private TipoReceituario(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoReceituario toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(TipoReceituario x: TipoReceituario.values()) {
			if(codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ codigo);
	}
}
