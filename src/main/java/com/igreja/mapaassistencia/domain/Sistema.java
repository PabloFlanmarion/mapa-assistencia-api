package com.igreja.mapaassistencia.domain;

import java.time.LocalDate;

import javax.persistence.Entity;

import com.sun.istack.NotNull;

/**
 * 
 * @author Pablo
 *
 */
@Entity
public class Sistema {
	
	@NotNull
	private String nomeIgreja;
	
	@NotNull
	private Pessoa pastor;
	
	@NotNull
	private LocalDate dataCriacao;
	
	@NotNull
	private LocalDate dataAtualizacao;

	/**
	 * @return the nomeIgreja
	 */
	public String getNomeIgreja() {
		return nomeIgreja;
	}

	/**
	 * @param nomeIgreja the nomeIgreja to set
	 */
	public void setNomeIgreja(String nomeIgreja) {
		this.nomeIgreja = nomeIgreja;
	}

	/**
	 * @return the pastor
	 */
	public Pessoa getPastor() {
		return pastor;
	}

	/**
	 * @param pastor the pastor to set
	 */
	public void setPastor(Pessoa pastor) {
		this.pastor = pastor;
	}

	/**
	 * @return the dataCriacao
	 */
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	/**
	 * @param dataCriacao the dataCriacao to set
	 */
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	/**
	 * @return the dataAtualizacao
	 */
	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	/**
	 * @param dataAtualizacao the dataAtualizacao to set
	 */
	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataAtualizacao == null) ? 0 : dataAtualizacao.hashCode());
		result = prime * result + ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result + ((nomeIgreja == null) ? 0 : nomeIgreja.hashCode());
		result = prime * result + ((pastor == null) ? 0 : pastor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sistema other = (Sistema) obj;
		if (dataAtualizacao == null) {
			if (other.dataAtualizacao != null)
				return false;
		} else if (!dataAtualizacao.equals(other.dataAtualizacao))
			return false;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (nomeIgreja == null) {
			if (other.nomeIgreja != null)
				return false;
		} else if (!nomeIgreja.equals(other.nomeIgreja))
			return false;
		if (pastor == null) {
			if (other.pastor != null)
				return false;
		} else if (!pastor.equals(other.pastor))
			return false;
		return true;
	}

}
