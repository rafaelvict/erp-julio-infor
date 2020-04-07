package com.erp.adm.enums;

public enum TipoItem {

	MATERIAPRIMA(1, "Matéria-Prima"),
	EMBALAGEM(2, "Embalagem"),
	PRODUTOEMPROCESSO(3, "Produto em Processo"),
	PRODUTOACABADO(4, "Produto Acabado"),
	SUBPRODUTO(5, "Sub Produto"),
	PRODUTOINTERMEDIARIO(6, "Produto Intermediário"),
	MATERIALUSOCONSUMO(7, "Material de Uso e consumo"),
	ATIVOIMOBILIZADO(8, "Ativo Imobilizado"),
	SERVICOS(9, "Serviços"),
	OUTROSINSUMOS(10, "Outros Insumos"),
	OUTRAS(11, "Outras");
	
	private int codigo;
	private String descricao;
	
	private TipoItem(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	

	public static TipoItem toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoItem x: TipoItem.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Invalido: "+ cod);
	}
}
