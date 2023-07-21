package com.elbiasimonebuglio.dslist.services;

import com.elbiasimonebuglio.dslist.dto.GameListDTO;
import com.elbiasimonebuglio.dslist.entities.GameList;
import com.elbiasimonebuglio.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
