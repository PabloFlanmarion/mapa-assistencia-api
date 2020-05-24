package com.igreja.mapaassistencia.enums;

/**
 * 
 * @author Pablo
 *
 */
public enum TipoContato {
	EMAIL(1, "E-mail"), CELULAR(2, "Celular"), TELEFONE(3, "Telefone");

	private int key;

	private String desc;

	/**
	 * 
	 * @param key
	 * @param desc
	 */
	private TipoContato(int key, String desc) {
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
