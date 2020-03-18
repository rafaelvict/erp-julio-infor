package com.erp.adm.enums;

public enum TipoEtnia {

	BRANCO(1, "Branco"),
	PARDO(2, "Pardo"),
	NEGRO(3, "Negro"),
	INDIGENA(4, "Indígena"),
	AMARELO(5, "Amarelo"),
	OUTRO(6, "Outro");
	
	private int codigo;
	private String descricao;
	
	private TipoEtnia(int codigo, String descricao) {
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
	
	public static TipoEtnia toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoEtnia x: TipoEtnia.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
	
}
