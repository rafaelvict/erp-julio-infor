package com.erp.adm.enums;

public enum TipoUsoMedicamento {

	USOPROLONGADO(1, "Uso Prolongado"),
	USONAOPROLONGADO(2, "Uso não Prolongado");
	
	private int codigo;
	private String descricao;
	
	
	private TipoUsoMedicamento(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoUsoMedicamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoUsoMedicamento x: TipoUsoMedicamento.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
}
