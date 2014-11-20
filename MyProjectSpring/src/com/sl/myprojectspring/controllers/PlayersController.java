package com.sl.myprojectspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sl.myprojectspring.dao.Player;
import com.sl.myprojectspring.service.PlayersService;


@Controller
public class PlayersController {
	
	private PlayersService playersService;

	@Autowired
	public void PlayersService(PlayersService playersService) {
		this.playersService = playersService;
	}

	@RequestMapping("/teamPlayers")
	public String showPlayers(Model model) {

		List<Player> players = playersService.getCurrent();
		
		model.addAttribute("players", players);

		return "teamPlayers";
	}
	
	@RequestMapping("/addPlayer")
	public String addPlayer(Model model) {
		return "addPlayer";
	}

	@RequestMapping(value="/doAdd", method=RequestMethod.POST)
	public String playerAdded(Model model, Player player) {
		System.out.println(player);
		return "playerAdded";
	}
}
