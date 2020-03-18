package com.erp.adm.enums;

public enum TipoAnimal {
	
	CACHORRO(1, "Cachorro"),
	GATO(2, "Gato"),
	PASSARO(3, "Pássaro"),
	ROEDOR(4, "Roedor"),
	OUTRO(5, "Outro");
	
	private int codigo;
	private String descricao;
	
	private TipoAnimal(int codigo, String descricao) {
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
	
	public static TipoAnimal toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoAnimal x: TipoAnimal.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
}
