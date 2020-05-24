package com.igreja.mapaassistencia.enums;

/**
 * 
 * @author Pablo
 *
 */
public enum Categoria {
	PEQUENO(1, "Pequeno"), CRIANCA(2, "Criança"), INTERMEDIARIO(3, "Intermediario"), ADOLESCENTE(4, "Adolescente"),
	JOVEM(5, "Jovem"), ADULTO(6, "Adulto"), IDOSO(7, "Idoso");

	private int key;
	private String desc;

	/**
	 * 
	 * @param key
	 * @param desc
	 */
	private Categoria(int key, String desc) {
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
