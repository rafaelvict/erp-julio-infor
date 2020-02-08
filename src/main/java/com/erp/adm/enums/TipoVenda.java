package com.erp.adm.enums;

public enum TipoVenda {

	TRANSFERENCIA(1, "Transferência"),
	PRAZO(2, "Á Prazo"),
	VISTA(3, "Á Vista"),
	OPCAO(4, "Opção");
	
	private int codigo;
	private String descricao;
	
	private TipoVenda(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoVenda toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(TipoVenda x: TipoVenda.values()) {
			if(codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ codigo);
	}
}
