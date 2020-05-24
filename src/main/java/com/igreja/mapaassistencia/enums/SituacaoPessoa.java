package com.igreja.mapaassistencia.enums;

/**
 * 
 * @author Pablo
 *
 */
public enum SituacaoPessoa {

	MEMBRO_NAO_BATISADO(1, "Membro não Batisado"), MEMBRO(2, "Membro"), VISITANTE(3, "Visitante"),
	VISITANTE_FREQUENTE(4, "Visitante Frequente"), NOVO_CONVERTIDO(5, "Novo Convertido");

	private int key;
	private String desc;

	private SituacaoPessoa(int key, String desc) {
		this.key = key;
		this.desc = desc;
	}

	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

}
