package com.igreja.mapaassistencia.enums;

/**
 * 
 * @author Pablo
 *
 */
public enum Genero {
	MASCULINO(1, "Masculino", "Mas"), FEMININO(2, "Feminino", "Fem");

	private int key;
	private String desc;
	private String abrev;

	/**
	 * 
	 * @param key
	 * @param desc
	 * @param abrev
	 */
	private Genero(int key, String desc, String abrev) {
		this.key = key;
		this.desc = desc;
		this.abrev = abrev;
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

	/**
	 * @return the abrev
	 */
	public String getAbrev() {
		return abrev;
	}
}
