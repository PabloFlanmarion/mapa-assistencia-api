package com.igreja.mapaassistencia.enums;

public enum Status {

	ATIVO(1, "Ativo"), INATIVO(2, "Inativo");

	private int key;
	private String desc;

	/**
	 * 
	 * @param key
	 * @param desc
	 */
	private Status(int key, String desc) {
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
