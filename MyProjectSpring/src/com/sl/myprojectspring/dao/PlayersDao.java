package com.sl.myprojectspring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("playersDao")
public class PlayersDao {

	private NamedParameterJdbcTemplate jdbc;

	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Player> getPlayers() {
		return jdbc.query("SELECT * FROM giocatore", new RowMapper<Player>() {

			public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
				Player player = new Player();

				player.setId(rs.getInt("id"));
				player.setNome(rs.getString("nome"));
				player.setCognome(rs.getString("cognome"));
				player.setDataNascita(rs.getDate("dataNascita"));
				player.setRuolo(rs.getString("ruolo"));
				player.setNumMaglia(rs.getInt("numMaglia"));

				return player;
			}

		});

	}

	public boolean createTeam(Team team) {
		return true;
	}

	/*
	 * public boolean updateTeam(Team team) {
	 * 
	 * }
	 * 
	 * public boolean deleteTeam(Team team) {
	 * 
	 * }
	 */

}
