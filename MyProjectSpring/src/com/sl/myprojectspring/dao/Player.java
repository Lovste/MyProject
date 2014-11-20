package com.sl.myprojectspring.dao;

import java.util.Date;

public class Player {

	private int id;
	private String nome;
	private String cognome;
	private Date dataNascita;
	private String ruolo;
	private int numMaglia;
	private Team squadra;

	public Player() {

	}

	public Player(int id, String nome, String cognome, Date dataNascita,
			String ruolo, int numMaglia, Team squadra) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.ruolo = ruolo;
		this.numMaglia = numMaglia;
		this.squadra = squadra;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public int getNumMaglia() {
		return numMaglia;
	}

	public void setNumMaglia(int numMaglia) {
		this.numMaglia = numMaglia;
	}

	public Team getSquadra() {
		return squadra;
	}

	public void setSquadra(Team squadra) {
		this.squadra = squadra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result
				+ ((dataNascita == null) ? 0 : dataNascita.hashCode());
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numMaglia;
		result = prime * result + ((ruolo == null) ? 0 : ruolo.hashCode());
		result = prime * result + ((squadra == null) ? 0 : squadra.hashCode());
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
		Player other = (Player) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (dataNascita == null) {
			if (other.dataNascita != null)
				return false;
		} else if (!dataNascita.equals(other.dataNascita))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numMaglia != other.numMaglia)
			return false;
		if (ruolo == null) {
			if (other.ruolo != null)
				return false;
		} else if (!ruolo.equals(other.ruolo))
			return false;
		if (squadra == null) {
			if (other.squadra != null)
				return false;
		} else if (!squadra.equals(other.squadra))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", nome=" + nome + ", cognome=" + cognome
				+ ", dataNascita=" + dataNascita + ", ruolo=" + ruolo
				+ ", numMaglia=" + numMaglia + ", squadra=" + squadra + "]";
	}

}
