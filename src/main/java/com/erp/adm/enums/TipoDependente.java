package com.erp.adm.enums;

public enum TipoDependente {
	
	FILHO(1, "Filho"),
	ENTEADO(2, "Enteado"),
	IRMAO(3, "Irmão"),
	NETO(4, "Neto"),
	BISNETO(5, "Bisneto"),
	MENOR(6, "Menor"),
	INCAPAZ(7, "Incapaz"),
	COMPANHEIRO(8, "Companheiro"),
	CONJUGUE(9, "Cônjugue"),
	PAIS(10, "Pais"),
	AVOS(11, "Avós"),
	BISAVOS(12, "Bisavós");
	
	private int codigo;
	private String descricao;
	
	private TipoDependente(int codigo, String descricao) {
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
	
	public static TipoDependente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoDependente x: TipoDependente.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
}
