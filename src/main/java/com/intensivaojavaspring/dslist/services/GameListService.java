package com.intensivaojavaspring.dslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intensivaojavaspring.dslist.dto.GameDTO;
import com.intensivaojavaspring.dslist.dto.GameListDTO;
import com.intensivaojavaspring.dslist.dto.GameMinDTO;
import com.intensivaojavaspring.dslist.entities.Game;
import com.intensivaojavaspring.dslist.entities.GameList;
import com.intensivaojavaspring.dslist.repositories.GameListRepository;
import com.intensivaojavaspring.dslist.repositories.GameRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
	}
}
