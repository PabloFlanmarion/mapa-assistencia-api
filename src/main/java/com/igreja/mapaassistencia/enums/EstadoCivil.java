package com.igreja.mapaassistencia.enums;

/**
 * 
 * @author Pablo
 *
 */
public enum EstadoCivil {

	SOLTEIRO(1, "Solteiro", "Sol"), AMASIADO(2, "Amasiado", "Ama"), DIVORCIADO(3, "Divorciado", "Div"),
	CASADO(4, "Casado", "Cas"), VIUVO(5, "Viúvo", "Viu");

	private int key;
	private String desc;
	private String abrev;

	/**
	 * 
	 * @param key
	 * @param desc
	 * @param abrev
	 */
	private EstadoCivil(int key, String desc, String abrev) {
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
