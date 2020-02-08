package com.erp.adm.enums;

public enum TipoEstadoCivil {

	SOLTEIRO(1, "Solteiro"),
	CASADO(2, "Casado"),
	DIVORCIADO(3, "Divorciado"),
	UNIAO_ESTAVEL(4, "União Estável");
	
	private int codigo;
	private String descricao;
	
	private TipoEstadoCivil(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoEstadoCivil toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(TipoEstadoCivil x: TipoEstadoCivil.values()) {
			if(codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ codigo);
	}
}
