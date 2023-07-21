package com.elbiasimonebuglio.dslist.repositories;

import com.elbiasimonebuglio.dslist.entities.Game;
import com.elbiasimonebuglio.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
