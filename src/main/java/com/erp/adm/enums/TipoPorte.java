package com.erp.adm.enums;

public enum TipoPorte {
	
	GRANDE(1, "Porte Grande"),
	MEDIO(2, "Porte Médio"),
	PEQUENO(3, "Porte Pequeno");
	
	private int codigo;
	private String descricao;
	
	private TipoPorte(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static TipoPorte toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoPorte x: TipoPorte.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
	
	
}
