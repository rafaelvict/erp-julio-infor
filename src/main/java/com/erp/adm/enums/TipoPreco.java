package com.erp.adm.enums;

public enum TipoPreco {
	
	VAREJO(1, "Varejo"),
	ATACADO1(2, "Atacado 1"),
	ATACADO2(3, "Atacado 2");
	
	private int codigo;
	private String descricao;
	
	private TipoPreco(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoPreco toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(TipoPreco x: TipoPreco.values()) {
			if(codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ codigo);
	}
	
}
