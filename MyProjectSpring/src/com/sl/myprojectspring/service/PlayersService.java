package com.sl.myprojectspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sl.myprojectspring.dao.Player;
import com.sl.myprojectspring.dao.PlayersDao;


@Service("playersService")
public class PlayersService {

private PlayersDao playersDao;
	
	@Autowired
	public void setPlayersDao(PlayersDao playersDao){
		this.playersDao = playersDao;
	}
	
	public List<Player> getCurrent(){
		return playersDao.getPlayers();
	}
}
