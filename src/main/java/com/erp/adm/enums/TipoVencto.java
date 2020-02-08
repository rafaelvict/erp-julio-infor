package com.erp.adm.enums;

public enum TipoVencto {
	
	TESTE(1, "Teste");
	
	private int codigo;
	private String descricao;
	
	private TipoVencto(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoVencto toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(TipoVencto x: TipoVencto.values()) {
			if(codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ codigo);
	}
}
