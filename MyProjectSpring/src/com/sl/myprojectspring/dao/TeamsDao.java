package com.sl.myprojectspring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("teamsDao")
public class TeamsDao {

	private NamedParameterJdbcTemplate jdbc;

	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Team> getTeams() {
		return jdbc.query("SELECT * FROM squadre", new RowMapper<Team>() {

			public Team mapRow(ResultSet rs, int rowNum) throws SQLException {
				Team team = new Team();

				team.setCodice(rs.getInt("codice"));
				team.setNome(rs.getString("nome"));
				team.setSede(rs.getString("sede"));
				team.setCampo(rs.getString("campo"));

				return team;
			}

		});

	}

	/*public boolean createTeam(Team team) {

	}

	public boolean updateTeam(Team team) {

	}

	public boolean deleteTeam(Team team) {

	}*/
}
