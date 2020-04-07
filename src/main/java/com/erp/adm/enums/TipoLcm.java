package com.erp.adm.enums;

public enum TipoLcm {
	
	LIBERADO(1, "Liberado"),
	CONTROLADO(2, "Controlado"),
	MONITORADO(3, "Monitorado");
	
	private int codigo;
	private String descricao;
	
	
	private TipoLcm(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoLcm toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoLcm x: TipoLcm.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
}
