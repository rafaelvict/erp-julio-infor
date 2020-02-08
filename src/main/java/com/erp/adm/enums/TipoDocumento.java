package com.erp.adm.enums;

public enum TipoDocumento {

	RG(1, "Registro Geral"),
	CPF(2, "Certidão Pessoa Física"),
	CNH(3, "Carteira Nacional de Habilitação");
	
	private int codigo;
	private String descricao;
	
	private TipoDocumento(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoDocumento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoDocumento x: TipoDocumento.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
}
