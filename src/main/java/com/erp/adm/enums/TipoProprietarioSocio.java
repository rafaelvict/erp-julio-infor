package com.erp.adm.enums;

public enum TipoProprietarioSocio {
	
	PROPRIETARIO(1, "Proprietário"),
	SOCIO(2, "Sócio");
	
	private int codigo;
	private String descricao;
	
	private TipoProprietarioSocio(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoProprietarioSocio toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(TipoProprietarioSocio x: TipoProprietarioSocio.values()) {
			if(codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ codigo);
	}
	
}
