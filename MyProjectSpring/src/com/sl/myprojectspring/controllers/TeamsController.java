package com.sl.myprojectspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sl.myprojectspring.dao.Team;
import com.sl.myprojectspring.service.TeamsService;

@Controller
public class TeamsController {

	private TeamsService teamsService;

	@Autowired
	public void setTeamsService(TeamsService teamsService) {
		this.teamsService = teamsService;
	}

	@RequestMapping("/teams")
	public String showTeams(Model model) {

		List<Team> teams = teamsService.getCurrent();
		
		model.addAttribute("teams", teams);

		return "teams";
	}
	

}
