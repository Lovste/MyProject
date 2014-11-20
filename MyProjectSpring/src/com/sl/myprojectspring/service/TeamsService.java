package com.sl.myprojectspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sl.myprojectspring.dao.Team;
import com.sl.myprojectspring.dao.TeamsDao;


@Service("teamService")
public class TeamsService {
	
	private TeamsDao teamsDao;
	
	@Autowired
	public void setTeamsDao(TeamsDao teamsDao){
		this.teamsDao = teamsDao;
	}
	
	public List<Team> getCurrent(){
		return teamsDao.getTeams();
	}

}
