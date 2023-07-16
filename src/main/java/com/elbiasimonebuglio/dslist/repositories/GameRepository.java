package com.elbiasimonebuglio.dslist.repositories;

import com.elbiasimonebuglio.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
