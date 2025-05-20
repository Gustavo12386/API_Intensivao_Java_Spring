package com.intensivaojavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.intensivaojavaspring.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
