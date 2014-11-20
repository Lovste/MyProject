package com.sl.myprojectspring.dao;

public class Team {

	private int codice;
	private String nome;
	private String sede;
	private String campo;

	public Team() {

	}

	public Team(int codice, String nome, String sede, String campo) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.sede = sede;
		this.campo = campo;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((campo == null) ? 0 : campo.hashCode());
		result = prime * result + codice;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sede == null) ? 0 : sede.hashCode());
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
		Team other = (Team) obj;
		if (campo == null) {
			if (other.campo != null)
				return false;
		} else if (!campo.equals(other.campo))
			return false;
		if (codice != other.codice)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sede == null) {
			if (other.sede != null)
				return false;
		} else if (!sede.equals(other.sede))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Team [codice=" + codice + ", nome=" + nome + ", sede=" + sede
				+ ", campo=" + campo + "]";
	}

}
